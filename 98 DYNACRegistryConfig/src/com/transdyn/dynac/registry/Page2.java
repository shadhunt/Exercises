package com.transdyn.dynac.registry;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Page2 {
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
		
		JLabel manufacturerItem = new JLabel("Manufacturer");
		JLabel networkItem = new JLabel("Network"); 
		JLabel networkAddrItem = new JLabel("Network Address");
		/*
		 * for ESB UTC
		 */
		JLabel CommandsItem = new JLabel("Traffic Lights");
		
		menuPanel.add(manufacturerItem);
		networkItem.setOpaque(true);
		networkItem.setBackground(Color.lightGray);
		
		menuPanel.add(networkItem);		
		menuPanel.add(networkAddrItem);	
		menuPanel.add(CommandsItem);
		
		
		leftPanel.setSize(100,840);
	
//		leftPanel.setBackground(Color.gray);
		

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
		rc.weightx=0;
		rc.weighty=0;
		rightPanel.setSize(800,1200);
		rightPanel.setLayout(rightPanelLayout);	
		
		JPanel blankPanel1 = new JPanel();
		rightPanel.add(blankPanel1,rc);
		
				
		JRadioButton scanGroupRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=0;
		rightPanel.add(scanGroupRadioButton,rc);		
		JLabel existingScanGroupLabel = new JLabel("Use existing scan group:");
		rc.gridx=2;
		rc.gridy=0;
		
		rightPanel.add(existingScanGroupLabel,rc);
		
		
		JTextField existingScanGroupTextField = new JTextField("                                         ");
//		rc.fill=GridBagConstraints.HORIZONTAL;
		rc.gridx=3;
		rc.gridy=0;						
		rc.gridwidth=2;
		rc.weightx = 1;

		rightPanel.add(existingScanGroupTextField,rc);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));		
		JButton scanGroupButton = new JButton("...");

		rc.fill=GridBagConstraints.NONE;
		rc.gridx=5;
		rc.gridy=0;
		rc.gridwidth=1;
		rc.anchor=GridBagConstraints.BASELINE_LEADING;
		scanGroupButton.setBounds(0,0, 6, 3);
		scanGroupButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		buttonPanel.add(scanGroupButton);
		rightPanel.add(buttonPanel,rc);		
		
		JPanel blankPanel2 = new JPanel();
		rc.gridx=6;
		rc.gridy=0;
		rc.gridwidth=0;
		rightPanel.add(blankPanel2,rc);
		
		/*START SCAN GROUP PART*/
		JPanel blankPanel3 = new JPanel();
		rc.gridx=0;
		rc.gridy=1;	
		rc.gridwidth=1;
		rightPanel.add(blankPanel3,rc);
			
		JRadioButton newScanGroupRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=1;
		rightPanel.add(newScanGroupRadioButton,rc);
		
		
		JLabel newScanGroupLabel = new JLabel("Create new scan group:");
		rc.gridx=2;
		rc.gridy=1;
		rightPanel.add(newScanGroupLabel,rc);

		JPanel blankPanel4 = new JPanel();
		rc.gridx=3;
		rc.gridy=1;
		rc.anchor=GridBagConstraints.BASELINE_TRAILING;
		rightPanel.add(blankPanel4,rc);
		
		
		JLabel serverNodeLabel = new JLabel("Server node name:");
		rc.gridx=4;
		rc.gridy=1;
		rightPanel.add(serverNodeLabel);
		
		String[] comboBoxContent = {"UTMC"};
		JComboBox nodeComboBox = new JComboBox(comboBoxContent);
		rc.gridx=5;
		rc.gridy=1;
		rc.anchor=GridBagConstraints.BASELINE_LEADING;
		rightPanel.add(nodeComboBox,rc);
		
		JPanel blankPanel5 = new JPanel();
		rc.gridx=6;
		rc.gridy=1;
		rc.gridwidth=0;		
		rightPanel.add(blankPanel5,rc);
		
		JPanel blankPanel6 = new JPanel();
		rc.fill=GridBagConstraints.HORIZONTAL;
		rc.gridx=0;
		rc.gridy=2;
		rc.gridwidth=4;		
		rc.weightx=0;
//		blankPanel6.setBackground(Color.cyan);
		rightPanel.add(blankPanel6,rc);
		
		
		JLabel scanGroupName = new JLabel("Scan group name:");
		
		rc.gridx=4;
		rc.gridy=2;
		rc.gridwidth=1;	
		rc.weightx=0;		
		rc.anchor=GridBagConstraints.BASELINE_TRAILING;
		rightPanel.add(scanGroupName,rc);
//		
//		
		JTextField scanGroupNameTextField = new JTextField("                                         ");
		rc.gridx=5;
		rc.gridy=2;
		rc.weightx=0;
		rc.anchor=GridBagConstraints.BASELINE_LEADING;
		scanGroupNameTextField.setBackground(Color.getHSBColor(10, 240, 130));
		rightPanel.add(scanGroupNameTextField,rc);

		
		

		
//				/*END SCAN GROUP PART*/
				
		
		JPanel devidePanel1 = new JPanel();
		rc.gridwidth=7;	
		rc.gridx=0;
		rc.gridy=3;
		rc.gridwidth=0;		
		rightPanel.add(devidePanel1,rc);
				/*START CHANNEL PART*/
//		
		
		JPanel blankPanel7 = new JPanel();
		rc.gridx=0;
		rc.gridy=4;
		rc.gridwidth=1;		
		rightPanel.add(blankPanel7,rc);
//		rightPanel.add(scanGroupName,rc);
		JRadioButton existingchannelRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=4;
		rc.gridwidth=1;		
		rightPanel.add(existingchannelRadioButton,rc);
		JLabel existingChannel = new JLabel("Use Existing Channel");
		rc.gridx=2;
		rc.gridy=4;
		rc.gridwidth=1;		
		rightPanel.add(existingChannel,rc);
		
		JTextField existingChannelTextField = new JTextField("                                         ");
		rc.anchor=GridBagConstraints.BASELINE_TRAILING;
		rc.gridx=3;
		rc.gridy=4;
		rc.gridwidth=2;				
		rightPanel.add(existingChannelTextField,rc);
		
		JButton channelButton = new JButton("...");
		rc.fill=GridBagConstraints.NONE;
		rc.gridx=5;
		rc.gridy=4;
		rc.gridwidth=1;
		rc.anchor=GridBagConstraints.BASELINE_LEADING;
		channelButton.setBounds(0,0, 6, 3);
		channelButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		rightPanel.add(channelButton,rc);
		
		JPanel blankPanel8 = new JPanel();
		rc.gridx=0;
		rc.gridy=5;
		rc.gridwidth=1;		
		rightPanel.add(blankPanel8,rc);
		
		JRadioButton newChannelRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=5;
		rc.gridwidth=1;
		rightPanel.add(newChannelRadioButton,rc);
		
		JLabel newChannelLabel = new JLabel("Create New Channel");
		rc.gridx=2;
		rc.gridy=5;
		rc.gridwidth=1;
		rightPanel.add(newChannelLabel,rc);
		
		JTextField newChannelTextField = new JTextField("                                         ");
		rc.gridx=3;
		rc.gridy=5;						
		rc.gridwidth=2;
		rc.weightx = 1;
		newChannelTextField.setBackground(Color.getHSBColor(10, 240, 130));
		rightPanel.add(newChannelTextField,rc);
		
				/*END CHANNEL PART*/
		
		JPanel devidePanel2 = new JPanel();
		rc.gridwidth=7;	
		rc.gridx=0;
		rc.gridy=6;
		rc.gridwidth=0;
		rightPanel.add(devidePanel2,rc);
		
		       /*START CONTROLLER PART*/

		JPanel blankPanel9 = new JPanel();
		rc.gridx=0;
		rc.gridy=7;
		rc.gridwidth=1;		
		rightPanel.add(blankPanel9,rc);
//		rightPanel.add(scanGroupName,rc);
		JRadioButton existingControllerRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=7;
		rc.gridwidth=1;		
		rightPanel.add(existingControllerRadioButton,rc);
		JLabel existingController = new JLabel("Use Existing Controller:");
		rc.gridx=2;
		rc.gridy=7;
		rc.gridwidth=1;		
		rightPanel.add(existingController,rc);
		
		JTextField existingControllerTextField = new JTextField("                                         ");
		rc.anchor=GridBagConstraints.BASELINE_TRAILING;
		rc.gridx=3;
		rc.gridy=7;
		rc.gridwidth=2;				
		rightPanel.add(existingControllerTextField,rc);
		
		JButton controllerButton = new JButton("...");
		rc.fill=GridBagConstraints.NONE;
		rc.gridx=5;
		rc.gridy=7;
		rc.gridwidth=1;
		rc.anchor=GridBagConstraints.BASELINE_LEADING;
		channelButton.setBounds(0,0, 6, 3);
		channelButton.setAlignmentX(Component.LEFT_ALIGNMENT);
		rightPanel.add(controllerButton,rc);
		
		JPanel blankPanel10 = new JPanel();
		rc.gridx=0;
		rc.gridy=8;
		rc.gridwidth=1;		
		rightPanel.add(blankPanel10,rc);
		
		JRadioButton newControllerRadioButton = new JRadioButton();
		rc.gridx=1;
		rc.gridy=8;
		rc.gridwidth=1;
		rightPanel.add(newControllerRadioButton,rc);
		
		JLabel newControllerLabel = new JLabel("Create New Controller:");
		rc.gridx=2;
		rc.gridy=8;
		rc.gridwidth=1;
		rightPanel.add(newControllerLabel,rc);
		
		JTextField newControllerTextField = new JTextField("                                         ");
		rc.gridx=3;
		rc.gridy=8;						
		rc.gridwidth=2;
		rc.weightx = 1;
		newControllerTextField.setBackground(Color.getHSBColor(10, 240, 130));
		rightPanel.add(newControllerTextField,rc);
		
			   /*END CONTROLLER PART*/
//		JLabel newChannel = new JLabel("createnewchannel");
		
		
//		rightPanel.add(scanGroupRadioButton,rc);
//		rightPanel.add(existingScanGroupLabel);
//		rightPanel.add(existingScanGroupTextField);
//		rightPanel.add(scanGroupButton);
//		rightPanel.add(newScanGroupRadioButton);
//		rightPanel.add(newScanGroupLabel);
//		
//		rightPanel.add(existingchannelRadioButton);
//		rightPanel.add(existingChannel);
//		rightPanel.add(newChannelRadioButton);
//		rightPanel.add(newChannel);
		
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
