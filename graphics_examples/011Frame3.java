import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame3 extends JFrame implements ActionListener{
	JLabel answer=new JLabel("");
	JPanel pane=new JPanel();
	JButton pressme=new JButton("Press Me");
	
	Frame3()
	{
		super("Event Handler Demo");
		
		Container con=this.getContentPane();
		con.add(pane);
		pressme.setMnemonic('P');
		pressme.addActionListener(this);
		pane.add(pressme);
		pane.add(answer);
		pane.requestFocus();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source=e.getSource();
		
		if (source==pressme)
		{
			answer.setText("Button Pressed");
			JOptionPane.showMessageDialog(null, "I hear you ", "Message dialog", JOptionPane.PLAIN_MESSAGE);
			setVisible(true);
		}
	}
	
	public static void main(String args[])
	{
		Frame3 frame=new Frame3();
		
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
