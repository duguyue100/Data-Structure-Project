import java.awt.*;
import javax.swing.*;

public class LabelFrame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public LabelFrame()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1=new JLabel("Label with text");
		label1.setToolTipText("This is label1");
		add(label1);
		
		label2=new JLabel("Label with text and icon");
		label2.setToolTipText("this is label2");
		add(label2);
		
		label3=new JLabel();
		label3.setText("Label with icon and text at bottom");
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		add(label3);
	}
	
	public static void main(String args[])
	{
		LabelFrame labelFrame=new LabelFrame();
		
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(275,180);
		labelFrame.setVisible(true);
	}
}
