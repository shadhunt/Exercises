package com.transdyn.dynac.registry;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Page1 {

	
	/**
	 * the first page of RegistryConfiguration
	 * @param args
	 */
	
     public static void main(final String[] args) {
    	 
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
    	 
    	 String[] typeItems = {"UTC","UTMC Center Controller", "Digital Camera","Video Wall"};
    	 String[] manufacturerItems= {"UTMC"};
    	 JFrame frame = new JFrame();
    	 JDialog dialog = new JDialog(frame, "Registry Object Creation",true);   //dialog用法不对
    	 /*
    	  * 可关闭
    	  */
    	 frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	 frame.setLayout(new BorderLayout());
    	 frame.setSize(800,800); 
    	 JPanel panel1 = new JPanel();
    	 JPanel panel2 = new JPanel();
    	 JButton okButton = new JButton("OK");
    	 JButton cancelButton = new JButton("Cancel");
    	 JLabel typeLabel = new JLabel("Type:");
    	 typeLabel.setHorizontalAlignment(JLabel.RIGHT);
    	 JLabel manufacturerLabel = new JLabel("Manufacturer:");
    	 manufacturerLabel.setHorizontalAlignment(JLabel.RIGHT);
    	 JLabel registryNameLabel = new JLabel("Registry Name:");
    	 registryNameLabel.setHorizontalAlignment(JLabel.RIGHT);
    	 JComboBox typeComboBox = new JComboBox(typeItems);
    	 JComboBox manufacturerComboBox = new JComboBox(manufacturerItems);
    	 JTextField registryComboBox = new JTextField();
    	 GridBagLayout gridbagLayout = new GridBagLayout();
    	 GridBagConstraints c= new GridBagConstraints();
    	 panel1.setLayout(gridbagLayout);
    	 panel1.setFont(new Font("SanSerif",Font.PLAIN,14));
    	 c.fill=GridBagConstraints.BOTH;
    	 c.insets=new Insets(5,10,5,10);        	 
    	 c.gridx=0;
    	 c.gridy=0;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(typeLabel, c);
    	 panel1.add(typeLabel,c);
    	 c.gridx=1;
    	 c.gridy=0;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(typeComboBox, c);
    	 panel1.add(typeComboBox,c);
    	 
    	 c.gridx=0;
    	 c.gridy=1;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(manufacturerLabel, c);
    	 panel1.add(manufacturerLabel,c);
    	 
    	 c.gridx=1;
    	 c.gridy=1;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(manufacturerComboBox, c);
    	 panel1.add(manufacturerComboBox,c);
    	 
    	 c.gridx=0;
    	 c.gridy=2;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(registryNameLabel, c);
    	 panel1.add(registryNameLabel,c);
    	 
    	 c.gridx=1;
    	 c.gridy=2;
    	 c.weightx=0;
    	 c.weighty=0;
    	 gridbagLayout.setConstraints(registryComboBox, c);
    	 panel1.add(registryComboBox,c);
    	 

    	 dialog.add(panel1,BorderLayout.NORTH);
    	 
    	 
    	 panel2.setLayout(gridbagLayout);
    	 c.insets = new Insets(10,160,10,5);
    	 c.gridx=0;
    	 c.gridy=0;    	 
    	 panel2.add(okButton,c);
    	 c.insets = new Insets(10,5,10,20);
    	 c.gridx=1;
    	 c.gridy=0;
    	 panel2.add(cancelButton,c);
    	 dialog.add(panel2,BorderLayout.CENTER);
    	 
    	 frame.setSize(600, 600);
    	 dialog.setBounds(600,400,320,200);
    	 dialog.setVisible(true);
    	 frame.setVisible(true);    	 
    	 frame.pack();
     }
 }