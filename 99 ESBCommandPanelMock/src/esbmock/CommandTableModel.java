package esbmock;

import javax.swing.table.DefaultTableModel;

public class CommandTableModel extends DefaultTableModel{

	static Object[][] p = {
			{"Command 1","Service name1","parameter 1","request 1"}, 
            {"Command 2","Service name2","parameter 2","request 2"}, 
            {"Command 3","Service name3","parameter 3","request 3"}, 
            {"Command 4","Service name4","parameter 4","request 4"}, 
            {"Command 5","Service name5","parameter 5","request 5"}                
	}; 
	
	static String[] names= {"External Reference","No Predifined Service Name", "Custom Service Parameter", "Service Requester"};
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return names.length;
	}


	public CommandTableModel() {
		super(p,names);
		// TODO Auto-generated constructor stub
	}





	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return p.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return p[rowIndex][columnIndex];
	}
	  public String geColumnName(int col){ 
          return names[col]; 
      } 

      public Class getColumnClass(int c){ 
          return getValueAt(0,c).getClass(); 
      } 

      public boolean isCellEditable(int row,int column){ 
          return true; 
      } 

      public void setValueAt(Object value,int row,int column){ 
          p[row][column]=value; 
          fireTableCellUpdated(row, column); 
      } 

      public void mySetValueAt(Object value,int row,int column){ 
          p[row][column]=value; 
      } 


}
