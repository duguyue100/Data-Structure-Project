import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 extends JFrame{
	JPanel pane=new JPanel();
	JButton pressme=new JButton("Press Me");
	
	Frame2()
	{
		super("JPrompt Demo");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con=this.getContentPane();
		
		con.add(pane);
		pressme.setMnemonic('P');
		pane.add(pressme);
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new Frame2();
	}
}
