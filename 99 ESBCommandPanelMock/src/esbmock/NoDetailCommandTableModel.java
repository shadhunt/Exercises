package esbmock;

import javax.swing.table.DefaultTableModel;

public class NoDetailCommandTableModel extends DefaultTableModel{

	static Object[][] p = {
			{"Command 1","Service name1"}, 
            {"Command 2","Service name2"}, 
            {"Command 3","Service name3"}, 
            {"Command 4","Service name4"}, 
            {"Command 5","Service name5"}                
	}; 
	
	static String[] names= {"Command Name","Description"};
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return names.length;
	}


	public NoDetailCommandTableModel() {
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
