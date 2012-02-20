// In this program, I use three package sets as following:
// java.awt.*;java.awt.event.*;javax.swing.*;
// awt.event.* provides all kinds listener and events we need,
// such as windows listener, key listener, action listener.

// The main class is BlockDown in this case, it is extended from JFrame
// As you can see in constructor method, all actions we need to perform
// are all in class Block. Thus, the job of BlockDown is to perform Block.
// In main method, we set all features of our window, such as frame size.
// We can also add menu and everything easily.
// Of course, these features can be set in constructor of BlockDown,
// however, because we get "code complete" tool in our IDE, thus, I
// choose set it in main method.

// The object in this case is a 10*10 block. Before we are going to next
// step, let's determine the properties of this block:
// Here, I set the size is 10*10, and the origin location is (0,WEIGHT/2);
// Now, we are going to determine the action when we press the keys.
// Actually, when your class "implements KeyListener", there are three
// methods which must be contained in your class: keyPressed, keyTyped 
// and keyReleased.
// In this case, we just need to define keyPressed method.
// I use getKeyCode() method to catch the pressed keys. And a switch
// change the location of block.
// The way we create block is using the method called paint().
// The simplest way is as following. You can also add the properties you
// want.

// The way which we let the block going down is to define a ActionListener
// and let a Timer object use it.
// When you look at TimerListener class, you would see the code is very simple.
// The action we perform here is just change the location y and repaint the
// frame.
// By the way, the method called actionPerformed is also a default method
// we need to use.

// Here, you may not see the top-down programming way directly, however,
// because the functions interact with each other, they can run it automatically.

// Author: Hu Yuhuang.
// E-mail: duguyue100@gmail.com
// If you have any question with this version, you can email me with above way.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlockDown extends JFrame{
	//Frame Size
	public static int HEIGHT=600;
	public static int WEIGHT=300;
	
	public BlockDown()
	{
		Block a=new Block();
		addKeyListener(a);
		add(a);
	}
	
	public class Block extends JPanel implements KeyListener
	{
		//location of blocks;
		private int x=BlockDown.WEIGHT/2;
		private int y=0;
		
		//size of blocks;
		private int height=10;
		private int weight=10;
		
		public void paint(Graphics g)
		{
			super.paint(g);
			g.fillRect(x, y, weight, height);
		}
		
		Block()
		{
			Timer timer=new Timer(250, new TimerListener());
			timer.start();
		}
		
		class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				y+=10;
				if (y>BlockDown.HEIGHT)
				{
					y=0;
				}
				repaint();
			}
		}
		
		public void keyPressed(KeyEvent e)
		{
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP :
				y-=10;
				if (y<0)
				{
					y=0;
				}
				break;
			case KeyEvent.VK_DOWN :
				y+=10;
				if (y>BlockDown.HEIGHT)
				{
					y=BlockDown.HEIGHT;
				}
				break;
			case KeyEvent.VK_LEFT :
				x-=10;
				if (x<0)
				{
					x=0;
				}
				break;
			case KeyEvent.VK_RIGHT :
				x+=10;
				if (x>BlockDown.WEIGHT)
				{
					x=BlockDown.WEIGHT;
				}
				break;
			}
		}
		
		//useless, but necessary
		public void keyTyped(KeyEvent e)
		{	
		}
		
		//useless, but necessary
		public void keyReleased(KeyEvent e)
		{
		}
	}
	
	public static void main(String args[])
	{
		BlockDown block=new BlockDown();
	
		block.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		block.setTitle("Block Down");
		block.setSize(WEIGHT, HEIGHT);
		block.setVisible(true);
		block.setResizable(false);
		block.setLocationRelativeTo(null);
	}
}
