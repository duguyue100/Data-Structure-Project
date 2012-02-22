// This code fill all frame automatically and would cancel
// the line which has filled.
// The way I do is define a 2-dimensional matrix and record
// the place which has got the block.

// This code is easily to understand if you know the last one 
// I uploaded.

// Author: Hu Yuhuang.
// E-mail: duguyue100@gmail.com
// If you have any question, feel free to contact me via above email.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FillBlock extends JFrame{
	public static int HEIGHT=400;
	public static int WIDTH=200;
	
	public FillBlock()
	{
		Block a=new Block();
		addKeyListener(a);
		add(a);
	}
	
	public class Block extends JPanel implements KeyListener
	{
		public int maps[][]=new int[21][11];
		
		public int x=20;
		public int y=20;
		
		public int height=20;
		public int width=20;
		
		public void paint(Graphics g)
		{
			for (int i=0;i<21;i++)
			{
				if (decline(i)==true)
				{
					for (int j=0;j<11;j++)
					{
						maps[i][j]=0;
					}
				}
			}
			super.paint(g);
			for (int i=0;i<21;i++)
				for (int j=0;j<11;j++)
				{
					if (maps[i][j]==1)
					{
						x=j*20;
						y=i*20;
						g.fillRect(x, y, width, height);
					}
				}
		}
		
		public boolean decline(int i)
		{
			
			for (int j=0;j<11;j++)
			{
				if (maps[i][j]==0)
				{
					return false;
				}
			}
			
			return true;
		}
		
		Block()
		{
			init();
			Timer timer=new Timer(50, new TimeListener());
			timer.start();
		}
		
		class TimeListener implements ActionListener
		{
			public void draw()
			{	
				int xi,yi;
				xi=((int)(Math.random()*1000)%11);
				yi=((int)(Math.random()*1000)%21);
				
				if (maps[yi][xi]!=1)
				{
					maps[yi][xi]=1;
				}
			}
			
			
			public void actionPerformed(ActionEvent e)
			{
				draw();
				System.out.println();
				repaint();
			}
		}
		
		public void init()
		{
			for (int i=0;i<21;i++)
			{
				for (int j=0;j<11;j++)
				{
					maps[i][j]=0;
				}
			}
		}
		
		public void keyPressed(KeyEvent e)
		{
			
		}
		
		public void keyTyped(KeyEvent e)
		{
			
		}
		
		public void keyReleased(KeyEvent e)
		{
			
		}
	}

	public static void main(String args[])
	{
		FillBlock block=new FillBlock();
		
		block.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		block.setTitle("Fill Block");
		block.setSize(WIDTH, HEIGHT);
		block.setResizable(false);
		block.setVisible(true);
	}
}
