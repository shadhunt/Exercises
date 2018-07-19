import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel linearLabel1 = new JLabel("Linear Reference 1");
		JLabel linearLabel2 = new JLabel("Linear Reference 2");	
		JLabel linearLabel3 =new JLabel(" ");
		JLabel linearLabel4 =new JLabel("  ");
		JTextField textField = new JTextField(10);
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		GridBagLayout layout = new GridBagLayout();
		panel1.setLayout(layout);
		panel2.setLayout(layout);
		
		GridBagConstraints constraints = new GridBagConstraints();
//		constraints.fill=GridBagConstraints.BOTH;
		constraints.fill=GridBagConstraints.NONE;
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth=1;      //需要大于1，如果是0，就会出现重叠情况
		constraints.gridheight=1;
		constraints.weightx=1;
		constraints.weighty=1;
			
		layout.setConstraints(linearLabel1, constraints);
		panel1.add(linearLabel1);		
		
//		constraints = new GridBagConstraints();
//		constraints.fill=GridBagConstraints.NONE;
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.weightx=1;
		constraints.weighty=1;		
		
		layout.setConstraints(button1, constraints);
		panel1.add(button1);
		panel1.setBackground(Color.yellow);
		
				
		constraints.anchor=GridBagConstraints.NORTH;
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth=1;
//		constraints.gridwidth = GridBagConstraints.REMAINDER; 
		constraints.gridheight=1;
		constraints.weightx=1;
		constraints.weighty=1;
		
		
		layout.setConstraints(linearLabel2, constraints);		
		panel2.add(linearLabel2);
		
//		constraints.gridx=0;
//		constraints.gridy=1;
//		constraints.gridwidth=1;
//		constraints.gridheight=1;
//		constraints.weightx=1;
//		constraints.weighty=1;

//		layout.setConstraints(linearLabel3, constraints);		
//		panel2.add(linearLabel3);
//		panel2.setBackground(Color.cyan);
//		
//		
		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.weightx=0;
		constraints.weighty=1;
	    constraints.insets = new Insets(1,1,5,5); 
		layout.setConstraints(linearLabel4, constraints);		
		panel2.add(linearLabel4);
		panel2.setBackground(Color.cyan);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // frame中的元素就不会因为拖拽而移动
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);
		frame.pack();
	}
}

