package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CS {
	private Connection conn=null;
	private int i=1;
	void ComputerScience(int choice) {
		
		
		
		switch(choice) {
			case 1:
			{
				BS(i);
			}break;
			case 2:
			{
				MS(i);
			}break;
			case 4:
			{
				//ADP();
			}
		}
	}
	
	void BS(int i) {
		String rollNo;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "20101002-00"+Integer.toString(i);
				connection(rollNo);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "20101002-0"+Integer.toString(i);
				connection(rollNo);
				break;
			}else {
				rollNo= "20101002-"+Integer.toString(i);
				connection(rollNo);
				break;
			}
			
			
		}
		
		
		
	}
	void MS(int i)
	{
		String rollNo;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "20101005-00"+Integer.toString(i);
				connection(rollNo);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "20101005-0"+Integer.toString(i);
				connection(rollNo);
				//System.out.println(rollNo);
				break;
			}else {
				rollNo= "20101005-"+Integer.toString(i);
				connection(rollNo);
				//System.out.println(rollNo);
				break;
			}
			
			
		}
	}
	
	void connection(String rollNo) {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/permission";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
			//System.out.println("connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
		Duplicate(rollNo);
		String sql = "INSERT INTO `db`(`Username`) VALUES (?)";
		try {
			PreparedStatement preparedStatement =conn.prepareStatement(sql);
				
				preparedStatement.setString(1, rollNo);
			
			int rows = preparedStatement.executeUpdate();
		
			if(rows>0){
				System.out.println("Your Email Id is "+rollNo+"@uskt.edu.pk");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			//System.out.println(e1);
			
		}
	}
	
	void Duplicate(String rollNo) {
		//int flag=0;
		try {
			String sql = "SELECT `Username` FROM `db` WHERE 1";
			Statement statement=  conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				String uname = result.getString("username");
				if(uname.equals(rollNo))
				{
					//flag=1;
					//System.out.println("Your Email Id is Duplicate");
					i++;
					if(rollNo.charAt(7)=='2'){
						BS(i);
					}else if(rollNo.charAt(7)=='5') {
						MS(i);
					}else {
						
					}
					
				}	
			}
		}catch (Exception e1){
			
			System.out.println(e1);
		}
		//return rollNo;
	}

}
