import java.awt.*;
import java.awt.event.*;
class AuthorityLogin extends Frame implements WindowListener, ActionListener{
	private Memory memory;
	public TextField nid;
	public TextField govid;
	public TextField password;
	public Button login;
	public Button forget;
	public Button create;
	
	public AuthorityLogin(Memory m){
		super("AuthorityLogin");
		this.memory=m;
		
		nid=new TextField();
		govid=new TextField();
		password=new TextField();
		login=new Button("Login");
		forget=new Button("forgot Password");
		create=new Button("Create Account");
		
        nid.setBounds(125,80,150,30);
		govid.setBounds(125,130,150,30);
		password.setBounds(125,180,150,30);
		forget.setBounds(60,300,150,30);
		create.setBounds(230,300,150,30);
		login.setBounds(170,250,90,30);
		
		add(nid);
		add(govid);
		add(password);
		add(login);
		add(create);
		add(forget);
		
		login.addActionListener(this);
		forget.addActionListener(this);
		create.addActionListener(this);
		addWindowListener(this);
		setSize(1800,900);
		setLayout(null);
		
	}
	public void paint(Graphics g){
		g.drawString("National ID:",40,100);
		g.drawString("Government ID:",40,150);
		g.drawString("Password:",40,200);
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
			memory.authoritylogin.setVisible(false);
			memory.authorityselection.setVisible(true);
		}
		/*else if(s.equals("Create Account")){
			memory.login.setVisible(false);
			memory.registration.setVisible(true);
		}*/
		
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}	