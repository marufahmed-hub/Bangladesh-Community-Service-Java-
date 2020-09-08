import java.awt.*;
import java.awt.event.*;
/*import javax.swing.*;*/

class LoginSelection extends Frame implements WindowListener,ActionListener
{
	private Memory memory;
	public Button CitizenButton;
	public Button AuthorityButton;
	public Button HomeButton;
	
	public LoginSelection(Memory m)
	{
		super("LoginSelection");
		this.memory=m;
		setSize(1800,1800);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		CitizenButton=new Button("Citizen");
		AuthorityButton=new Button("Authority");
		HomeButton=new Button("Go to Home");
		
		CitizenButton.setBounds(1100,300,150,75);
		AuthorityButton.setBounds(1300,300,150,75);
		HomeButton.setBounds(1200,400,150,75);
		
		add(CitizenButton);
		add(AuthorityButton);
		add(HomeButton);
		
		CitizenButton.addActionListener(this);
		AuthorityButton.addActionListener(this);
		HomeButton.addActionListener(this);
		
		addWindowListener(this);
		setLayout(null);
	}
	public void windowClosing(WindowEvent we)
	{
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		if(st.equals("Citizen"))
		{
			memory.loginselection.setVisible(false);
			memory.login.setVisible(true);
			
		}
		else if(st.equals("Authority"))
		{
			memory.loginselection.setVisible(false);
			memory.authoritylogin.setVisible(true);
			
		}
		
		else if(st.equals("Go to Home")){
			memory.loginselection.setVisible(false);
			memory.firstpage.setVisible(true);
			
			
		}
	}
	
	
	
	
	
	
	
	
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}
	