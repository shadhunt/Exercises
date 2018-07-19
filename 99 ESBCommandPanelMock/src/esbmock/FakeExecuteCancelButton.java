package esbmock;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FakeExecuteCancelButton {
	public static void main(String[] args) {
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
		JFrame frame = new JFrame("");
		JButton button = new JButton("Execute");
		JButton button2 = new JButton("Cancel");
		button2.setEnabled(false);
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		
		frame.add(panel);
		frame.pack();
		frame.setSize(200, 300);
		frame.setVisible(true);
	}
}
