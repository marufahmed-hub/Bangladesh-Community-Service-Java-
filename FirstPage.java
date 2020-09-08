import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FirstPage extends JFrame implements WindowListener,ActionListener
{
	private Memory memory;
	public Button RegistrationButton;
	public Button LoginButton;
	
	public FirstPage(Memory m)
	{
		super("The first Page");
		this.memory=m;
		JLabel background;
		JLabel L1=new JLabel("WELCOME TO BANGLADESH COMMUNITY SERVICE");
		setLayout(null);
		setSize(1800,900);
		L1.setBounds(500,500,300,300);
		add(L1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		RegistrationButton=new Button("REGISTRATION");
		RegistrationButton.setBounds(1000,500,150,75);
		LoginButton=new Button("LOGIN");
		LoginButton.setBounds(1300,500,150,75);
		add(RegistrationButton);
		add(LoginButton);
		
		ImageIcon img=new ImageIcon("project.png");
	
	background = new JLabel( "",img,java.awt.Image.SCALE_SMOOTH);
	background.setBounds(0,0,1800,900);
	add(background);
	RegistrationButton.addActionListener(this);
	LoginButton.addActionListener(this);
	addWindowListener(this);
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		if(st.equals("REGISTRATION"))
		{
			memory.firstpage.setVisible(false);
			memory.registration.setVisible(true);
			
		}
		else if(st.equals("LOGIN")){
			memory.firstpage.setVisible(false);
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
	
		
