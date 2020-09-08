import java.awt.*;
import java.awt.event.*;
class AuthoritySelection extends Frame implements WindowListener, ActionListener{
	private Memory memory;
	public Button city;
	public Button municipal;
	public Button union;
	public Button logout;
	
	public AuthoritySelection(Memory m){
		super("AuthoritySelection");
		this.memory=m;
		
		city=new Button("City Corporation");
		municipal=new Button("Municipal");
		union=new Button("Union");
		logout=new Button("Logout");
        city.setBounds(125,80,150,30);
		municipal.setBounds(125,130,150,30);
		union.setBounds(125,180,150,30);
		logout.setBounds(125,230,150,30);
        add(city);
		add(municipal);
		add(union);
		add(logout);
		
		city.addActionListener(this);
		municipal.addActionListener(this);
		union.addActionListener(this);
		logout.addActionListener(this);
		addWindowListener(this);
		setSize(1800,900);
		setLayout(null);
		
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		
		if(s.equals("City Corporation")){
			
			memory.authorityselection.setVisible(false);
			memory.requestcc.setVisible(true);
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