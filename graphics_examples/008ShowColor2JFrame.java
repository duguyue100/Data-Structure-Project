import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowColor2JFrame extends JFrame{
	private JButton changeColorJButton;
	private Color color=Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	
	public ShowColor2JFrame()
	{
		super("Using JColor");
		
		colorJPanel=new JPanel();
		colorJPanel.setBackground(color);
		
		changeColorJButton=new JButton("Change Color");
		changeColorJButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						color=JColorChooser.showDialog(ShowColor2JFrame.this, "Choose a color", color);
						if (color==null)
						{
							color=Color.LIGHT_GRAY;
						}
						colorJPanel.setBackground(color);
					}
				}
				);
		
		add(colorJPanel,BorderLayout.CENTER);
		add(changeColorJButton,BorderLayout.SOUTH);
		
		setSize(400,130);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		ShowColor2JFrame application=new ShowColor2JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
