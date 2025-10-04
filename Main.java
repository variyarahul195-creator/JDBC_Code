package MyPackage;


public class Main {
	public static void main(String[] args) {
		
		JDBC_DB_create st = new JDBC_DB_create();
		JDBC_Table_create tb = new JDBC_Table_create();
		//st.createDatabase();
		tb.createTable();

	}

}
