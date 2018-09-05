package com.transdyn.dynac.registry;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RegistryViewTabs {
	public static void main(String[] args)
	{
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
		
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel();
		JPanel upperPanel = new JPanel();
		JLabel objectName = new JLabel("Registry View for: UTMCCenterController/UTMCCenter 1");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		
		upperPanel.add(objectName);
		upperPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JTabbedPane topicTabs = new JTabbedPane();
		topicTabs.add("General", panel1);
		topicTabs.add("Commands",panel2);
		topicTabs.add("GIS", panel3);
		topicTabs.add("Command Library", panel4);
//		topicTabs.add("Status", panel3);
//		topicTabs.add("Tags", panel4);
//		topicTabs.add("Alarms", panel5);
//		topicTabs.add("Aspects", panel6);
//		topicTabs.add("Notes", panel7);
//		topicTabs.add("Driver", panel8);
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEtchedBorder());
		mainPanel.add(topicTabs);
		mainFrame.add(upperPanel,BorderLayout.NORTH);
		mainFrame.add(mainPanel,BorderLayout.CENTER);
		mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setSize(600, 400);
	}
}
