import java.awt.*;
import java.awt.event.*;

class AuthorityReg extends Frame implements WindowListener, ActionListener
{
	private Memory memory;
	public Button save;
	public TextField name;
	public TextField nid;
	public TextField age;
	public TextField phone;
	public TextField dob;
	public TextField govid;
	public TextField presentadd;
	public TextField permanentadd;
	public TextField gender;
	public TextField blood;
	public TextField father;
	public TextField mother;
	public TextField fathernid;
	public TextField mothernid;
	public TextField occupation;
	public TextField email;
	public TextField password;
	public TextField confirm;
	
	public AuthorityReg(Memory m)
	{
		super("Authority Registration");
		this.memory=m;
		name=new TextField();
		nid=new TextField();
		age=new TextField();
		phone=new TextField();
		dob=new TextField();
		govid=new TextField();
		presentadd=new TextField();
		permanentadd=new TextField();
		gender=new TextField();
		blood=new TextField();
		father=new TextField();
		mother=new TextField();
		fathernid=new TextField();
		mothernid=new TextField();
		occupation=new TextField();
		email=new TextField();
		password=new TextField();
		confirm=new TextField();
		save=new Button("Save And Go To Login");
		
		setSize(1800,900);
		setLayout(null);
		
		name.setBounds(165,80,150,25);
		nid.setBounds(165,110,150,25);
		age.setBounds(165,140,150,25);
		phone.setBounds(165,170,150,25);
		dob.setBounds(165,200,150,25);
		govid.setBounds(165,230,150,25);
		presentadd.setBounds(165,260,150,25);
		permanentadd.setBounds(165,290,150,25);
		gender.setBounds(165,320,150,25);
		blood.setBounds(165,350,150,25);
		father.setBounds(165,380,150,25);
		mother.setBounds(165,410,150,25);
		fathernid.setBounds(165,440,150,25);
		mothernid.setBounds(165,470,150,25);
		occupation.setBounds(165,500,150,25);
		email.setBounds(165,530,150,25);
		password.setBounds(165,560,150,25);
		confirm.setBounds(165,590,150,25);
		save.setBounds(165,620,150,25);
		
		add(name);
		add(nid);
		add(age);
		add(phone);
		add(dob);
		add(govid);
		add(presentadd);
		add(permanentadd);
		add(gender);
		add(blood);
		add(father);
		add(mother);
		add(fathernid);
		add(mothernid);
		add(occupation);
		add(email);
		add(password);
		add(confirm);
		add(save);
		save.addActionListener(this);
		addWindowListener(this);
	}
		
		public void paint(Graphics g){
		g.drawString("Name:",40,100);
		g.drawString("National ID:",40,130);
		g.drawString("Age:",40,160);
		g.drawString("Phone Number:",40,190);
		g.drawString("Date Of Birth:",40,220);
		g.drawString("Government ID:",40,250);
		g.drawString("Present Address:",40,280);
		g.drawString("Permanent Address:",40,310);
		g.drawString("Gender:",40,340);
		g.drawString("Blood Group:",40,370);
		g.drawString("Father's Name:",40,400);
		g.drawString("Mother's Name:",40,430);
		g.drawString("Father's National ID:",40,460);
		g.drawString("Mother's National ID:",40,490);
		g.drawString("Occupation:",40,520);
		g.drawString("Email:",40,550);
		g.drawString("Password:",40,580);
		g.drawString("Confirm Password:",40,610);
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		
		if(s.equals("Save And Go To Login")){
				memory.authority.setVisible(false);
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

	
		