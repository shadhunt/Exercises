package esbmock;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;



/**
 * ESB Command tab and command configuartion page
 * @author cshao
 *
 */
public class Page4 {
	
	
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
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		/*
		 * START construct left Menu
		 */
		
		JPanel menuPanel = new JPanel();
		GridLayout menuPanelLayout =new GridLayout(22,1);
		menuPanel.setLayout(menuPanelLayout);
		
		JLabel manufacturerItem = new JLabel("Manufacturer");
		JLabel networkItem = new JLabel("Network"); 
		JLabel networkAddrItem = new JLabel("Network Address");
		/*
		 * for ESB UTC
		 */
		JLabel CommandsItem = new JLabel("Traffic Lights");
		
		
		/* can be changed to other table model*/
		CommandTableModel cmdtm=new CommandTableModel();
		JTable commandTable = new JTable(cmdtm);
		commandTable.setPreferredScrollableViewportSize(new Dimension(600,300)); 

		
		menuPanel.add(manufacturerItem);
		networkAddrItem.setOpaque(true);
		CommandsItem.setBackground(Color.lightGray);
		
		menuPanel.add(networkItem);		
		menuPanel.add(networkAddrItem);	
		menuPanel.add(CommandsItem);

		
		leftPanel.setSize(100,940);
	
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
		JScrollPane pane = new JScrollPane(commandTable);	
		pane.setSize(1600,800);
		JPanel addDelPanel = new JPanel();
		GridBagLayout addDelLayout= new GridBagLayout();
		GridBagConstraints adc = new GridBagConstraints();
		addDelPanel.setLayout(addDelLayout);				
		
		JButton addButton = new JButton("Add");
//		addButton.setEnabled(false);
		addButton.setSize(new Dimension(50,20));
		JButton delButton = new JButton("Remove");
//		delButton.setEnabled(false);
		JButton editButton = new JButton("Modify");
//		editButton.setEnabled(false);
		adc.fill=adc.NONE;
		adc.gridx=0;
		
		adc.weightx=2;	
		adc.gridwidth=1;	
		addDelPanel.add(addButton, adc);
		adc.fill=adc.NONE;
		adc.gridx=1;

		
		addDelPanel.add(editButton, adc);
		adc.fill=adc.NONE;
		adc.gridx=2;

		addDelPanel.add(delButton,adc);
		
		BorderLayout rightPanelLayout = new BorderLayout();
        TitledBorder connStrTb = BorderFactory.createTitledBorder("");        
		rightPanel.setBorder( connStrTb );
		rightPanel.setLayout(rightPanelLayout);
		rightPanel.add(pane,BorderLayout.NORTH);
		rightPanel.add(addDelPanel,BorderLayout.CENTER);
		rightPanel.setSize(1800,1200);
		
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
		botEmptyPanel.setSize(1500,300);
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
