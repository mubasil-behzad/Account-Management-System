package Login_Sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Duplicate {
	private Connection conn=null;
	//public String REG_ID;
	int i=1;
	
	String generate(int choice,String reg) {
		String regid = null;
		switch(choice) {
		case 1:
		{
			
			regid = BS(i,reg);
		}
				default:
		{
			JOptionPane.showMessageDialog(null, "Invalid Degree..!");
		}
		}
		return regid;
	}
	String BS(int i,String reg) {

		String REG_ID = null;
		
		for(;i<100;) {
			if(i<10) {
				
				REG_ID= reg+"20101002-00"+Integer.toString(i);
				connection(reg,REG_ID);
			}else if(i<100){
				REG_ID= reg+"20101002-0"+Integer.toString(i);
			}else {
				REG_ID= reg+"20101002-"+Integer.toString(i);
			}
		}
		return REG_ID;
		
	}
	
	void connection(String reg,String REG_ID) {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/account_managment_system";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		duplicate(reg,REG_ID);
		
	}
		
	void duplicate(String reg,String REG_ID) {
		//for(int i=1;i<100;i++) {
			try {
				String sql = "SELECT `Registeration_Id` FROM `students` WHERE 1";
				Statement statement = conn.createStatement();
				ResultSet result = statement.executeQuery(sql);
				while(result.next()) {
					String uname = result.getString("Registeration_Id");
					if(uname==null){
						continue;
					}
					if(uname.matches(REG_ID)){
						
						i++;
						if(REG_ID.startsWith("CS20101002")){
							BS(i,reg);
						}else {
							
						}
				}
			
			}
				conn.close();
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1);
			}
		}
	}
//}
