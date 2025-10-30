package MyPackage;


public class Main {
	public static void main(String[] args) {
		
		JDBC_DB_create st = new JDBC_DB_create();
		JDBC_Table_create tb = new JDBC_Table_create();
		JDBC_Data_create dc=new JDBC_Data_create();
		JDBC_read_data rc=new JDBC_read_data();
		JDBC_update_data ud=new JDBC_update_data();
		JDBC_Delete_data dd=new JDBC_Delete_data();
		//st.createDatabase();
		//tb.createTable();
		//dc.DataCreate();
		rc.read_data();
		//ud.UpdateData();
		//dd.DeleteData();
		
	}

}
