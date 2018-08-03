package esbmock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class CommandDetails
{
	public static void main(String[] args)
	{
		/*
		   	  * 使风格与dynac统一
		   	  */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {

		} catch (InstantiationException ex) {

		} catch (IllegalAccessException ex) {

		} catch (UnsupportedLookAndFeelException ex) {

		}

		JFrame frame = new JFrame("Command Details");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		mainPanel.setSize(new Dimension(150,200));
		mainPanel.setLayout(new GridBagLayout());
		JPanel lowPanel = new JPanel();
		lowPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		

		
		JPanel namePanel = new JPanel();
		namePanel.setSize(new Dimension(30,180));
		JPanel paramPanel = new JPanel();
		paramPanel.setSize(new Dimension(30,180));
		JPanel implPanel = new JPanel();
		implPanel.setSize(new Dimension(30,180));
		
		JLabel commandNameLabel = new JLabel("Command Name");
		JTextField commandNameTextField = new JTextField(15);
		
		JLabel descriptionLabel = new JLabel("Description");
		JTextField descrptionTextField = new JTextField(15);
		JLabel externalRefLabel = new JLabel("External Reference");
		JTextField externalRefTextField = new JTextField(40);		
		JLabel serviceNameLabel = new JLabel("No Predefined Service Name");
		JTextField serviceNameTextField = new JTextField(40);
		JLabel countryLabel = new JLabel("Country");
		JTextField countryTextField = new JTextField(20);
		JLabel nationIdLabel = new JLabel("Nation ID");
		JTextField nationIdTextField = new JTextField(20);
		
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Terminate");
		namePanel.setLayout(new GridBagLayout());
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth=1;
		gc.gridheight=1;
		gc.weightx=0;
		gc.weighty=0;
		gc.anchor = gc.FIRST_LINE_END;
		namePanel.setBorder(BorderFactory.createTitledBorder("Command"));
		namePanel.add(commandNameLabel,gc);
		gc.gridx=1;
		namePanel.add(commandNameTextField,gc);
		JPanel blank1=new JPanel();
		gc.gridx=2;
		namePanel.add(blank1,gc);
		gc.gridy=1;
		gc.gridx=0;
		namePanel.add(descriptionLabel,gc);
		gc.gridx=1;
		namePanel.add(descrptionTextField,gc);
		
		paramPanel.setLayout(new GridBagLayout());
		paramPanel.setBorder(BorderFactory.createTitledBorder(""));
		gc.gridx=0;
		gc.gridy=0;
		paramPanel.add(externalRefLabel,gc);
		gc.gridx=1;		
		paramPanel.add(externalRefTextField,gc);
		gc.gridx=0;
		gc.gridy=1;
		paramPanel.add(serviceNameLabel,gc);
		gc.gridx=1;
		gc.gridy=1;
		paramPanel.add(serviceNameTextField,gc);
		
		implPanel.setLayout(new GridBagLayout());
		implPanel.setBorder(BorderFactory.createTitledBorder("Service Implementer"));
		gc.gridx=0;
		gc.gridy=0;
		gc.gridwidth=1;
		implPanel.add(countryLabel,gc);
		gc.gridx=1;
		gc.gridy=0;		
		implPanel.add(countryTextField,gc);
		gc.gridx=0;
		gc.gridy=1;
		implPanel.add(nationIdLabel,gc);
		gc.gridx=1;
		implPanel.add(nationIdTextField,gc);
		gc.gridx=0;
		gc.gridy=0;
		gc.gridwidth=1;		
		mainPanel.setBorder(BorderFactory.createTitledBorder(""));
		mainPanel.add(namePanel,gc);
		gc.gridx=1;
		mainPanel.add(implPanel, gc);
		gc.gridwidth=2;
		gc.gridheight=4;
		gc.gridx=0;
		gc.gridy=1;
		mainPanel.add(paramPanel, gc);

		Label blankLabel = new Label("                                                                        ");
		lowPanel.add(blankLabel);
		lowPanel.add(okButton);
		lowPanel.add(cancelButton);	
		
		
		frame.add(mainPanel,BorderLayout.CENTER);
		frame.add(lowPanel,BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.setSize(new Dimension(800, 400));
	}
}

