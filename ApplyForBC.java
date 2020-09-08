import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
class ApplyForBC extends Frame implements WindowListener, ActionListener{
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
	public Button next;
	public Button back;
	
	public ApplyForBC(Memory m){
		super("Application");
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
		next=new Button("Confirm");
		back=new Button("Back");
		
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
		next.setBounds(165,590,150,30);
		back.setBounds(350,590,150,30);
		
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
		add(next);
		add(back);
		
		next.addActionListener(this);
		back.addActionListener(this);
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

	}
public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Confirm")){
			
			JOptionPane.showConfirmDialog(null, "Are you sure to confirm? ", "Alert", JOptionPane.YES_NO_OPTION);
		}
		else if(s.equals("Back")){
			memory.applyforbc.setVisible(false);
			memory.applyfor.setVisible(true);
		}
	}
		public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}	
	
