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
		public int x=20;
		public int y=20;
		
		public int height=20;
		public int width=20;
		
		public int[][] maps=new int[23][13];
		
		public void paint(Graphics g)
		{
			super.paint(g);
			
			g.fillRect(x, y, width, height);
			
			for (int i=1;i<=20;i++)
			{
				for (int j=1;j<=10;j++)
				{
					if (maps[i][j]==1)
					{
						g.fillRect(j*20, i*20, width, height);	
					}
				}
			}
		}
		
		public void init()
		{
			for (int i=1;i<=20;i++)
			{
				for (int j=1;j<=10;j++)
				{
					maps[i][j]=0;
				}
			}
		}
		
		Block()
		{
			init();
			Timer timer=new Timer(250, new TimerListener());
			timer.start();
		}
		
		class TimerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				y+=20;
				if (check(y/20+1,x/20)==true)
				{
					maps[y/20][x/20]=1;
					x=20;
					y=20;
				}
				
				if (y>FillBlock.HEIGHT)
				{
					y=20;
					x=20;
				}
				
				for (int i=20;i>=1;i--)
				{
					if (decline(i)==true)
					{
						for (int j=10;j>=1;j--)
						{
							maps[i][j]=0;
							redoMatrix(j);
						}
					}
				}
				
				repaint();
			}
			
			public void redoMatrix(int j)
			{
				
				for (int i=20;i>=1;i--)
				{
					maps[i][j]=maps[i-1][j];
				}
			}
			
			public boolean decline(int i)
			{
				for (int j=1;j<=10;j++)
				{
					if (maps[i][j]==0)
					{
						return false;
					}
				}
				
				return true;
			}
			
			public boolean check(int i,int j)
			{
				if (i>20)
				{
					return true;
				}
				else if (maps[i][j]==1)
				{
					return true;
				}
				
				return false;
			}
		}
		
		
		// Key Actions
		public void keyPressed(KeyEvent e)
		{
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP :
				break;
			case KeyEvent.VK_DOWN :
				y+=20;
				if (y>FillBlock.HEIGHT)
				{
					y=FillBlock.HEIGHT;
				}
				break;
			case KeyEvent.VK_LEFT :
				x-=20;
				if (x<0)
				{
					x=0;
				}
				break;
			case KeyEvent.VK_RIGHT :
				x+=20;
				if (x>=FillBlock.WIDTH)
				{
					x=FillBlock.WIDTH;
				}
				break;
			}
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
		block.setSize(WIDTH*2, HEIGHT*2);
		block.setTitle("Fill Block");
		block.setVisible(true);
		block.setResizable(false);
	}

}
