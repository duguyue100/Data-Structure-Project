import java.awt.*;
import javax.swing.*;

public class ColorJPanel extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(new Color(255,0,0));
		g.fillRect(15, 25, 100, 20);
		g.drawString("Current RGB: "+ g.getColor(), 130, 40);
		
		g.setColor(new Color(0.50f,0.75f,0.00f));
		g.fillRect(15, 50, 100, 20);
		g.drawString("Current RGB: "+g.getColor(), 130, 65);
		
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("Current RGB: "+g.getColor(), 130, 90);
		
		g.setColor(Color.MAGENTA);
		g.fillRect(15, 100, 100, 20);
		g.drawString("RGB Values: "+Color.MAGENTA.getRed()+", "+Color.MAGENTA.getGreen()+", "+Color.MAGENTA.getBlue(),130,115);
		
	}
	
	public static void main(String args[])
	{
		JFrame frame=new JFrame("Using colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorJPanel colorJPanel=new ColorJPanel();
		frame.add(colorJPanel);
		frame.setSize(400, 180);
		frame.setVisible(true);
	}
}
