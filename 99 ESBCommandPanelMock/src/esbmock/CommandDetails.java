package esbmock;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
		JPanel mainPanel = new JPanel();
		mainPanel.setSize(new Dimension(150,200));
		mainPanel.setLayout(new BorderLayout());
		JPanel lowPanel = new JPanel();
		
		
		JPanel namePanel = new JPanel();
		JPanel paramPanel = new JPanel();
		JPanel implPanel = new JPanel();
		
		JLabel commandNameLabel = new JLabel("Command Name");
		JTextField commandNameTextField = new JTextField(16);
		
		JLabel descriptionLabel = new JLabel("Description");
		JTextField descrptionTextField = new JTextField(25);
		JLabel externalRefLabel = new JLabel("External Reference");
		JTextField externalRefTextField = new JTextField(15);		
		JLabel serviceNameLabel = new JLabel("No Predefined Service Name");
		JTextField serviceNameTextField = new JTextField(15);
		JLabel countryLabel = new JLabel("Country");
		JTextField countryTextField = new JTextField(10);
		JLabel nationIdLabel = new JLabel("Nation ID");
		JTextField nationIdTextField = new JTextField(5);
		
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Cancel");
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		namePanel.setBorder(BorderFactory.createTitledBorder(""));
		namePanel.add(commandNameLabel);
		namePanel.add(commandNameTextField);
		namePanel.add(descriptionLabel);
		namePanel.add(descrptionTextField);
		
		paramPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		paramPanel.setBorder(BorderFactory.createTitledBorder(""));
		paramPanel.add(externalRefLabel);
		paramPanel.add(externalRefTextField);
		paramPanel.add(serviceNameLabel);
		paramPanel.add(serviceNameTextField);
		
		implPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		implPanel.setBorder(BorderFactory.createTitledBorder("Service Implementer"));
		implPanel.add(countryLabel);
		implPanel.add(countryTextField);
		implPanel.add(nationIdLabel);
		implPanel.add(nationIdTextField);
		
		frame.add(namePanel, BorderLayout.NORTH);
		frame.add(paramPanel, BorderLayout.CENTER);
		frame.add(implPanel, BorderLayout.SOUTH);
				
		frame.setVisible(true);
		frame.setSize(new Dimension(200, 300));
	}
}

