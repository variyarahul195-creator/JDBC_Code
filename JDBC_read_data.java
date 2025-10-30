package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBC_read_data {
	public void read_data(){
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db="mysql";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url+db,userName,password);
			String query = "select * from class_v";
			
			//create statement
			Statement stm=conn.createStatement();
			
			//execute query
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("id = "+rs.getInt(1));
				System.out.println("Name = "+rs.getString(2));
				System.out.println("email_id = "+rs.getString(3));
			}
			System.out.println("data read Successfully");
			
			//close the connection
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			
		}
}
