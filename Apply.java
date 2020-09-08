import java.awt.*;
import java.awt.event.*;

class Apply extends Frame implements WindowListener, ActionListener
{
	private Memory memory;
	public Button applybutton;
	public Button homepage;
	public Apply(Memory m)
	{
		super("Apply Page");
		this.memory=m;
		applybutton=new Button("Apply");
		homepage=new Button("Go To Home Page");
		
		applybutton.setBounds(800,350,150,75);
		homepage.setBounds(800,500,150,75);
		
		add(applybutton);
		add(homepage);
		applybutton.addActionListener(this);
		homepage.addActionListener(this);
		
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
		if(st.equals("Apply"))
		{
			memory.apply.setVisible(false);
			memory.applyfor.setVisible(true);
			
		}
		else if(st.equals("Go To Home Page")){
			memory.apply.setVisible(false);
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
		