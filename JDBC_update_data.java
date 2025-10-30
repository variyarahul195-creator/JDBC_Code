package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_update_data {
	public void UpdateData() {	
		try {
			String url ="jdbc:mysql://localhost:3306/mysql";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			//create statement
			String query = "update class_v set sid=? where semail=?";
			PreparedStatement pstm=conn.prepareStatement(query);
			
			//execute query
			pstm.setInt(1,2);
			pstm.setString(2, "variyarahul449@gmail.com");
			pstm.execute();
			
			System.out.println("Data Updated Successfully");
			//close the connection
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
}
public static void main(String[] args){
		
}
}
