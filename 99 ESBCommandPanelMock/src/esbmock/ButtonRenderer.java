package esbmock;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
/**
 * 
 * 
 * @author kingram
 *
 */
public class ButtonRenderer extends JButton implements TableCellRenderer{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
 
    public ButtonRenderer(){
        setOpaque(true);
    }
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column ) {
        if(isSelected){
            setForeground(table.getSelectionForeground());
            setBackground(table.getSelectionBackground());
        }
        else{
            setForeground(table.getForeground());
            setBackground(UIManager.getColor("Button.background"));
        }
        JButton editButton = new JButton("Details");
		editButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Clicked");
				
			}
		});
        return editButton;
//        if(value != null && value.toString().length() > 0){
//            setText("Details");
//            return this;
//        }
//        else{
//            setText("");
//            return null;
//        }
       
    }
  
}
