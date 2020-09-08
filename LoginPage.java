import java.awt.*;
import java.awt.event.*;
class LoginPage extends Frame implements WindowListener, ActionListener{
	private Memory memory;
	public TextField nid;
	public TextField password;
	public Button forget;
	public Button create;
	public Button login;
	public LoginPage(Memory m){
		super("LoginPage");
		this.memory=m;
		
		nid=new TextField();
		password=new TextField();
		forget=new Button("Forgot Password");
		create=new Button("Create Account");
		login=new Button("Login");
		
		nid.setBounds(120,80,150,30);
		password.setBounds(120,130,150,30);
		forget.setBounds(60,200,150,30);
		create.setBounds(230,200,150,30);
		login.setBounds(170,250,90,30);
		add(nid);
		add(password);
		add(forget);
		add(create);
		add(login);
		forget.addActionListener(this);
		create.addActionListener(this);
		login.addActionListener(this);
		addWindowListener(this);
		
		setSize(1800,900);
		setLayout(null);
		
	}
public void paint(Graphics g){
		g.drawString("National ID:",40,100);
		g.drawString("Password:",40,150);
	}
	
public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		int l=0;
		if(s.equals("Login")){
			System.out.println(nid.getText());
			System.out.println(password.getText());
			memory.login.setVisible(false);
			memory.apply.setVisible(true);
		}
		else if(s.equals("Create Account")){
			memory.login.setVisible(false);
			memory.registration.setVisible(true);
		}
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}	

