package com.scp.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJdbc {
public static void main(String[] args) {
	
	try{ 
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","suraj");  
		  System.out.println("conn done");
		//step3 create the statement object  
		Statement stmt=con.createStatement();  
		  System.out.println("sts. cerated");
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next()) 
		{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));  
		} 
		
		System.out.println("hellos");
		//step5 close the connection object 
		stmt.close();
		rs.close();
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}

