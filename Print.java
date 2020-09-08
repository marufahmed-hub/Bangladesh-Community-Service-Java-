import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.swing.Jlabel;

class Print extends Frame implements WindowListener, ActionListener
{
	private Memory memory;
	public JLabel appid;
	public Button okay;
	
	public Print(Memory m)
	{
		super("Confirm Window");
		this.memory=m;
		appid=new Label("Your Application Id is 33474");
		okay=new Button("Okay");
		
	