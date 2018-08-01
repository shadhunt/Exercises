package esbmock;

import javax.swing.table.DefaultTableModel;

public class TrafficLightModel extends DefaultTableModel{

	static Object[][] p = {
			{"TrafficLight 1"}, 
			{"TrafficLight 2",}, 
			{"TrafficLight 3"},
			{"TrafficLight 4"},
			{"TrafficLight 5"},
	}; 
	
	static String[] names= {"name"};
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return names.length;
	}


	public TrafficLightModel() {
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
