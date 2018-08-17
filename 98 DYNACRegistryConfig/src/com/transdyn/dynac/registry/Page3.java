package com.transdyn.dynac.registry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class Page3 {
	
	
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
   	 
		JFrame frame = new JFrame("UTC Creation");
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		/*
		 * START construct left Menu
		 */
		
		JPanel menuPanel = new JPanel();
		GridLayout menuPanelLayout =new GridLayout(20,1);
		menuPanel.setLayout(menuPanelLayout);
		
//		JLabel manufacturerItem = new JLabel("Manufacturer");
		JLabel networkItem = new JLabel("Network"); 
		JLabel networkAddrItem = new JLabel("Network Address");
		/*
		 * for ESB UTC
		 */
		JLabel CommandsItem = new JLabel("Traffic Lights");
		
		JTable commandTable = new JTable();
		commandTable.setPreferredScrollableViewportSize(new Dimension(400,80)); 

		
//		menuPanel.add(manufacturerItem);                        /*removed manufacturer page*/
		networkAddrItem.setOpaque(true);
//		CommandsItem.setBackground(Color.lightGray);
		
		menuPanel.add(networkItem);		
		menuPanel.add(networkAddrItem);	
//		menuPanel.add(CommandsItem);
		
		leftPanel.setSize(100,840);
	
		leftPanel.setBackground(Color.gray);
		

		menuPanel.setSize(new Dimension(1340, 800));
		menuPanel.setBackground(Color.WHITE);
		
		
		leftPanel.add(menuPanel);
		
		/*
		 * END construct left panel
		 */
		
		
		/*
		 * START construct right panel
		 */
		GridBagLayout rightPanelLayout = new GridBagLayout();
		GridBagConstraints rc = new GridBagConstraints();
		rc.fill=GridBagConstraints.NONE;
   	 	rc.insets = new Insets(5,5,5,20);		
		rc.gridx=0;
		rc.gridy=0;
		rc.gridheight=1;
		rc.gridwidth=1;
		rc.weightx=1;
		rc.weighty=0;
		rightPanel.setSize(800,1200);
		rightPanel.setLayout(rightPanelLayout);	
		
		
		
		JPanel incomingPanel = new JPanel();
		JPanel outgoingPanel = new JPanel();
		
		JLabel incomingUserLabel = new JLabel("username:");
		JLabel outgoingUserLabel = new JLabel("username:");
		
		JTextField incomingUserTextField = new JTextField(16);
		JTextField incomingPasswordTextField = new JTextField(16);
		
		JLabel incomingPasswordLabel =  new JLabel("password:");
		JLabel outgoingPasswordLabel = new JLabel("password:");
		
		JTextField outgoingUserTextField = new JTextField(16);
		JTextField outgoingPasswordTextField = new JTextField(16);
		
		incomingPanel.add(incomingUserLabel);
		incomingPanel.add(incomingUserTextField);
		incomingPanel.add(incomingPasswordLabel);
		incomingPanel.add(incomingPasswordTextField);
		
		
		outgoingPanel.add(outgoingUserLabel);
		outgoingPanel.add(outgoingUserTextField);
		outgoingPanel.add(outgoingPasswordLabel);
		outgoingPanel.add(outgoingPasswordTextField);		
		
		TitledBorder tbIn = BorderFactory.createTitledBorder("Incoming");
		TitledBorder tbOut = BorderFactory.createTitledBorder("Outgoing");
		rc.gridx=0;
		rc.gridy=0;
		rc.gridwidth=3;
		rc.weightx=3;
		rightPanel.add(incomingPanel,rc);
		incomingPanel.setBorder(tbIn);
		outgoingPanel.setBorder(tbOut);
		rc.gridx=0;
		rc.gridy=1;
		rc.gridwidth=3;
		rc.weightx=3;
		rightPanel.add(outgoingPanel,rc);
		
		rc.gridx=0;
		rc.gridy=2;
		rc.gridwidth=0;
		rc.weightx=0;
		JPanel connectionStringPanel = new JPanel();
		JLabel connectioStringLabel=new JLabel("Web Service URL:");
		
		connectionStringPanel.add(connectioStringLabel);
		
		
		JTextField connectionStringField = new JTextField(20);
		connectionStringPanel.add(connectionStringField);
		
		rightPanel.add(connectionStringPanel,rc);
		
		/*
		 * END construct right panel
		 */
		
		
		/*
		 * START construct bottom panel*
		 */
		JButton backButton= new JButton("< Back");
		JButton nextutton= new JButton("Next >");
		JButton CancelButton= new JButton("Cancel");
		
		JPanel botEmptyPanel = new JPanel();
		botEmptyPanel.setSize(1800,300);
		GridBagLayout botLayout = new GridBagLayout();
		GridBagConstraints bc = new GridBagConstraints();
		bottomPanel.setLayout(botLayout);
		bc.fill=GridBagConstraints.BOTH;
		bc.gridx=0;
		bc.gridy=0;
		bc.weightx=1;
		bottomPanel.add(botEmptyPanel,bc);
		
		bc.gridx=1;
		bc.weightx=0;
		bottomPanel.add(backButton,bc);
		bc.gridx=2;
		bottomPanel.add(nextutton,bc);
		bc.gridx=3;
		bc.gridwidth=0;
		bottomPanel.add(CancelButton,bc);
		
		/*
		 * End construct bottom panel*
		 */
		
		GridBagLayout frameLayout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		frame.setLayout(frameLayout);
		
   	 	c.fill=GridBagConstraints.BOTH;    //左右延伸
		
		c.gridx=0;
		c.gridy=0;
//		c.weightx=1;
//		c.weighty=1;
		c.gridwidth=1;		
		c.gridheight=1;
		frame.add(leftPanel, c);
		
		c.gridx=1;
		c.gridy=0;
//		c.weightx=1;
//		c.weighty=1;
		c.gridwidth=1;		
//		rightPanel.setBackground(Color.red);				
		
		
		frame.add(rightPanel,c);
		
		
		
		c.gridx=0;
		c.gridy=1;
//		c.weightx=0;             //左右延伸 ?
//		c.weighty=1;
		c.gridwidth=2;          //占两格    ?
//		bottomPanel.setBackground(Color.blue);
		frame.add(bottomPanel, c);
		
		
		
		
		
		frame.setSize(850, 450);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
	}
}
