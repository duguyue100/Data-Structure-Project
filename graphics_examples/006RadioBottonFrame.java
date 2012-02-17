import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioBottonFrame extends JFrame{
	private JTextField textField;
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private JRadioButton plainJRadioButton;
	private JRadioButton boldJRadioButton;
	private JRadioButton italicJRadioButton;
	private JRadioButton boldItalicJRadioButton;
	private ButtonGroup radioGroup;
	
	public RadioBottonFrame()
	{
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField=new JTextField("Watch the font style change",25);
		add(textField);
		
		plainJRadioButton=new JRadioButton("Plain",true);
		boldJRadioButton=new JRadioButton("Bold",false);
		italicJRadioButton=new JRadioButton("Italic",false);
		boldItalicJRadioButton=new JRadioButton("bold/Italic",false);
		
		add(plainJRadioButton);
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		radioGroup=new ButtonGroup();
		radioGroup.add(plainJRadioButton);
		radioGroup.add(boldJRadioButton);
		radioGroup.add(italicJRadioButton);
		radioGroup.add(boldItalicJRadioButton);
		
		plainFont=new Font("Serif",Font.PLAIN,14);
		boldFont=new Font("Serif",Font.BOLD,14);
		italicFont=new Font("Serif",Font.ITALIC,14);
		boldItalicFont=new Font("Serif",Font.BOLD+Font.ITALIC,14);
		
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
	}
	
	private class RadioButtonHandler implements ItemListener
	{
		private Font font;
		
		public RadioButtonHandler(Font f)
		{
			font=f;
		}
		
		public void itemStateChanged(ItemEvent event)
		{
			textField.setFont(font);
		}
	}
	
	public static void main(String args[])
	{
		RadioBottonFrame radioButtonFrame=new RadioBottonFrame();
		
		radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radioButtonFrame.setSize(300, 100);
		radioButtonFrame.setVisible(true);
	}
}
