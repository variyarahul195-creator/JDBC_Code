package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_Data_create {
	public void DataCreate(){
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String db="mysql";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url+db,userName,password);
			String query = "insert into Class_v (sid, sname, semail) values(?,?,?)";
			
			//create statement
			PreparedStatement pstm=conn.prepareStatement(query);
			
			//execute query
			pstm.setInt(1,1);
			pstm.setString(2, "Rahul");
			pstm.setString(3, "variyarahul449@gmail.com");
			pstm.execute();
			System.out.println("Data Inserted Successfully");
			
			//close the connection
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			
		}
}
