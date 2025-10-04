package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JDBC_DB_create {
	public void createDatabase() {	
		try {
			String url ="jdbc:mysql://localhost:3306/";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			//create statement
			String query = "create database Hello_World;";
			
			//execute query
			stm.execute(query);
			System.out.println("DB Created succesfully");
			
			//close the connection
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void createTable(){
		try {
			String url ="jdbc:mysql://localhost:3306/mysql";
			String userName="root";
			String password="R@hulMySQL@1410";
			
			//establish connection
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm=conn.createStatement();
			
			//create statement
			String query = "create table Class_v (sid int(3),sname varchar(20),semail varchar(200));";
			String value = "insert into Class_v(sid,sname,semail) values(1,'Rahul','variyarahul123@gmail.com');";
			//execute query
			stm.execute(query);
			System.out.println("Table Created succesfully");
			
			stm.execute(value);
			System.out.println("Data Inserted succesfully");
			
			//close the connection
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		
		
							
}
}



