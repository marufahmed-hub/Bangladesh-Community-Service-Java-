import java.awt.*;
import java.awt.event.*;

class ApplyFor extends Frame implements WindowListener, ActionListener
{
	private Memory memory;
	public Button birth;
	public Button character;
	public Button police;
	public Button legacy;
	public Button log;
	
	public ApplyFor(Memory m)
	{
		super("Apply For Page");
		this.memory=m;
		birth=new Button("Birth Certificate");
		character=new Button("Character Certificate");
		police=new Button("Police Clearance");
		legacy=new Button("Legacy Certificate");
		log=new Button("Log Out");
		birth.setBounds(200,100,300,100);
		character.setBounds(200,250,300,100);
		police.setBounds(200,400,300,100);
		legacy.setBounds(200,550,300,100);
		log.setBounds(1400,700,300,100);
		
		add(birth);
		add(character);
		add(police);
		add(legacy);
		add(log);
		
		birth.addActionListener(this);
		character.addActionListener(this);
		police.addActionListener(this);
		legacy.addActionListener(this);
		log.addActionListener(this);
		
		addWindowListener(this);
		setLayout(null);
		setSize(1800,900);
		
	}
	
	
	public void windowClosing(WindowEvent we)
	{
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String st=e.getActionCommand();
		if(st.equals("Birth Certificate"))
		{
			memory.applyfor.setVisible(false);
			memory.applyforbc.setVisible(true);
			
		}
		else if(st.equals("Character Certificate")){
			memory.applyfor.setVisible(false);
			memory.applyforcc.setVisible(true);
			
			
		}
		else if(st.equals("Police Clearance")){
			memory.applyfor.setVisible(false);
			memory.applyforpc.setVisible(true);
			
			
		}
		else if(st.equals("Legacy Certificate")){
			memory.applyfor.setVisible(false);
			memory.applyforlc.setVisible(true);
			
			
		}
		else if(st.equals("Log Out")){
			memory.applyfor.setVisible(false);
			memory.login.setVisible(true);
			
			
		}
	}
	
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}