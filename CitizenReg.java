import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class CitizenReg extends Frame implements WindowListener, ActionListener{
	private Memory memory;
	public TextField name;
	public TextField nid;
	public TextField age;
	public TextField phone;
	public TextField dob;
	public TextField presentaddress;
	public TextField permanentaddress;
	public TextField gender;
	public TextField bloodgroup;
	public TextField fathername;
	public TextField mothername;
	public TextField fathernid;
	public TextField mothernid;
	public TextField occupation;
	public TextField email;
	public TextField password;
	public TextField confirmpassword;
	public Button save;
	
	public CitizenReg(Memory m){
		super("Citizen Registration");
		this.memory=m;
		
		name=new TextField();
		nid=new TextField();
		age=new TextField();
		phone=new TextField();
		dob=new TextField();
		presentaddress=new TextField();
		permanentaddress=new TextField();
		gender=new TextField();
		bloodgroup=new TextField();
		fathername=new TextField();
		mothername=new TextField();
		fathernid=new TextField();
		mothernid=new TextField();
		occupation=new TextField();
		email=new TextField();
		password=new TextField();
		confirmpassword=new TextField();
		save=new Button("Save And Go To Login");
		
		name.setBounds(165,80,150,25);
		nid.setBounds(165,110,150,25);
		age.setBounds(165,140,150,25);
		phone.setBounds(165,170,150,25);
		dob.setBounds(165,200,150,25);
		presentaddress.setBounds(165,230,150,25);
		permanentaddress.setBounds(165,260,150,25);
		gender.setBounds(165,290,150,25);
		bloodgroup.setBounds(165,320,150,25);
		fathername.setBounds(165,350,150,25);
		mothername.setBounds(165,380,150,25);
		fathernid.setBounds(165,410,150,25);
		mothernid.setBounds(165,440,150,25);
		occupation.setBounds(165,470,150,25);
		email.setBounds(165,500,150,25);
		password.setBounds(165,530,150,25);
		confirmpassword.setBounds(165,560,150,25);
		save.setBounds(165,590,150,25);
		
		add(name);
		add(nid);
		add(age);
		add(phone);
		add(dob);
		add(presentaddress);
		add(permanentaddress);
		add(gender);
		add(bloodgroup);
		add(fathername);
		add(mothername);
		add(fathernid);
		add(mothernid);
		add(occupation);
		add(email);
		add(password);
		add(confirmpassword);
		add(save);
		save.addActionListener(this);
		addWindowListener(this);
		
		setSize(1800,900);
		setLayout(null);
	}
	public void paint(Graphics g){
		g.drawString("Name:",40,100);
		g.drawString("National ID:",40,130);
		g.drawString("Age:",40,160);
		g.drawString("Phone Number:",40,190);
		g.drawString("Date Of Birth:",40,220);
		g.drawString("Present Address:",40,250);
		g.drawString("Permanent Address:",40,280);
		g.drawString("Gender:",40,310);
		g.drawString("Blood Group:",40,340);
		g.drawString("Father's Name:",40,370);
		g.drawString("Mother's Name:",40,400);
		g.drawString("Father's National ID:",40,430);
		g.drawString("Mother's National ID:",40,460);
		g.drawString("Occupation:",40,490);
		g.drawString("Email:",40,520);
		g.drawString("Password:",40,550);
		g.drawString("Confirm Password:",40,580);
		
	}
	
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		DataAccess da=new DataAccess();
		String s=e.getActionCommand();
		
		if(s.equals("Save And Go To Login")){
			String sql="insert into citizen (c_id,name,nid,age,phone,dob,presentaddress,permanentaddress,gender,bloodgroup,fathername,mothername,fathernid,mothernid,occupation,email,password,con_pass) values(null,'"+name.getText()+"','"+nid.getText()+"','"+age.getText()+"','"+phone.getText()+"','"+dob.getText()+"','"+presentaddress.getText()+"','"+permanentaddress.getText()+"','"+gender.getText()+"','"+bloodgroup.getText()+"','"+fathername.getText()+"','"+mothername.getText()+"','"+fathernid.getText()+"','"+mothernid.getText()+"','"+occupation.getText()+"','"+email.getText()+"','"+password.getText()+"','"+confirmpassword.getText()+"')";
			da.updateDB(sql);
			System.out.println(sql);
			memory.citizen.setVisible(false);
			memory.loginselection.setVisible(true);
		}
		
	}
		public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}	
