import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;

class RequestCC extends JFrame implements WindowListener, ActionListener
{
	private Memory memory;
	public Container c;
	public JLabel request;
	public Font f;
	public Button check;
	public Button pending;
	public Button logout;
	
	public RequestCC(Memory m)
	{
		super("Request Window");
		
		this.memory=m;
		c=this.getContentPane();
		f=new Font("Arial",Font.BOLD,16);
		request=new JLabel();
		request.setText("Request From City Corporation");
		request.setBounds(200,300,300,100);
		request.setFont(f);
		c.add(request);
		
		check=new Button("Check");
		pending=new Button("Pending");
		logout=new Button("Log Out");
		
		check.setBounds(200,400,75,50);
		pending.setBounds(500,400,75,50);
		logout.setBounds(1500,700,75,50);
		add(check);
		add(pending);
		add(logout);
		
		setSize(1800,900);
		setLayout(null);
		
		
		
	}
	
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s.equals("Log Out")){
			memory.requestcc.setVisible(false);
			memory.authoritylogin.setVisible(true);
		}
		/*else if(s.equals("Signup")){
			register.loginWindow.setVisible(false);
			register.signUpWindow.setVisible(true);
		}*/
	}
	
		public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
}
		
	