package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_Delete_data {
	public void DeleteData() {	
		try {
			String url ="jdbc:mysql://localhost:3306/mysql";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			//create statement
			String query = "delete from class_v where sid=?";
			PreparedStatement pstm=conn.prepareStatement(query);
			
			//execute query
			
			pstm.setInt(1, 2);
			pstm.execute();
			
			System.out.println("Data Deleted Successfully");
			//close the connection
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
}
public static void main(String[] args){
		
}
}
