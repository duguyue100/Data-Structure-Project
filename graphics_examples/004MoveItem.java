import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveItem extends JFrame implements KeyListener{
	private int x,y;
	private int r;
	
	public MoveItem()
	{
		x=300;
		y=200;
		r=50;
		
		this.setSize(600,400);
		this.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void keyReleased(KeyEvent e)
	{
	}
	
	public void keyTyped(KeyEvent e)
	{
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		
		switch(key)
		{
		case KeyEvent.VK_UP :
			y-=10;
			break;
		case KeyEvent.VK_DOWN :
			y+=10;
			break;
		case KeyEvent.VK_LEFT :
			x-=10;
			break;
		case KeyEvent.VK_RIGHT :
			x+=10;
		}
		
		Graphics g=this.getGraphics();
		g.clearRect(0, 0, 600, 400);
		g.fillOval(x-r, y-r, 2*r, r*2);
		
	}
	
	public static void main(String args[])
	{
		new MoveItem();
	}
}
