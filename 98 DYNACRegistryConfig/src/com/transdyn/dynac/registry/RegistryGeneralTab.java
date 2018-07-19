package com.transdyn.dynac.registry;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistryGeneralTab {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel statuslabel = new JLabel("Status");
		JTextField statusText = new JTextField(10);
		JLabel cmdTryLable = new JLabel("Comamnd Try Limit");
		JTextField cmdTryTextField = new JTextField(10);
		JLabel scanEnabled = new JLabel("Scan Enabled");
		JCheckBox scanCheckBox = new JCheckBox();
		JLabel scanRetryLabel = new JLabel("Scan Retry Label");
		JTextField scanRetryTextField = new JTextField(10);
		JLabel networkAddrLabel = new JLabel("Network Address");
		JTextField networkAddrTextField = new JTextField(10);
		JLabel commandActive = new JLabel("Command Active");
		JLabel commandTimeout = new JLabel("Command Timeout");
		JLabel inHistoryLabel = new JLabel("In History");
		JLabel scanActiveLabel = new JLabel("Scan Active");
		JLabel scanErrorLabel = new JLabel("Scan Error Limit");
		JLabel scanInterval = new JLabel("Scan Timeout");
		JLabel scanTimeout = new JLabel("Simulate Mode");
		JLabel tagSummary = new JLabel("Tag Summary");
		
		frame.add(panel);
		panel.add(statuslabel);
		panel.add(statusText);
		panel.add(cmdTryLable);
		panel.add(cmdTryTextField);
		panel.add(scanEnabled);
		panel.add(scanCheckBox);
		panel.add(scanRetryLabel);
		panel.add(scanRetryTextField);
		panel.add(networkAddrLabel);
		panel.add(networkAddrTextField);
		panel.add(commandActive);
		panel.add(commandTimeout);
		panel.add(inHistoryLabel);
		panel.add(scanActiveLabel);
		panel.add(scanErrorLabel);
		panel.add(scanInterval);
		panel.add(scanTimeout);
		panel.add(tagSummary);
		
		frame.setVisible(true);
		
		
	}
}
