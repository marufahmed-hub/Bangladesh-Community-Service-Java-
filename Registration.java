import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Registration extends JFrame implements WindowListener,ActionListener
{
	private Memory memory;
	public Button CitizenButton;
	public Button AuthorityButton;
	public Button HomeButton;
	
	public Registration(Memory m)
	{
		super("Registration Window");
		this.memory=m;
		JLabel background;
		setSize(1800,1800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		CitizenButton=new Button("Citizen");
		AuthorityButton=new Button("Authority");
		HomeButton=new Button("Go to Home");
		CitizenButton.setBounds(1100,300,150,75);
		AuthorityButton.setBounds(1300,300,150,75);
		HomeButton.setBounds(1200,400,150,75);
		add(CitizenButton);
		add(AuthorityButton);
		add(HomeButton);
		ImageIcon img=new ImageIcon("project.png");
	
	background = new JLabel( "",img,java.awt.Image.SCALE_SMOOTH);
	background.setBounds(0,0,1800,900);
	add(background);
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
			memory.registration.setVisible(false);
			memory.citizen.setVisible(true);
			
		}
		else if(st.equals("Authority"))
		{
			memory.registration.setVisible(false);
			memory.authority.setVisible(true);
			
		}
		
		else if(st.equals("Go to Home")){
			memory.registration.setVisible(false);
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
		
		
		