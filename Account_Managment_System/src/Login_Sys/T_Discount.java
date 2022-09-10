package Login_Sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class T_Discount {
	private Connection conn =null;
	String Leaves(String holidays,String srch,String amount) {
		String Salary = null;
		long salary = 0;
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/account_managment_system";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		try {
			//Statement statement=  conn.createStatement();
			String sql = "SELECT `Specialization` FROM `teachers` WHERE `teacher_ID` = ? ";
			
			PreparedStatement preparedStatement= conn.prepareStatement(sql);
				preparedStatement.setString(1, srch);
			
			ResultSet result = preparedStatement.executeQuery();
			if(!result.next()) {
				JOptionPane.showMessageDialog(null, "Teacher ID Not Found");
			}else {
				String special = String.valueOf(result.getString("Specialization"));
				
				if(holidays.equals("2 Half")|| holidays.equals("Half") || holidays.equals("2 half") || holidays.equals("half") || holidays.equals("1")) {
					
					salary = Long.parseLong(amount);
					return Salary = String.valueOf(salary);
				}else {
					if(special.equals("C/ C++") || special.equals("Web Development")) {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}else if(special.equals("C#/ JAVA/ Python")) {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}else if(special.equals("Mathematics") || special.equals("Physics") || special.equals("Chemistry") || special.equals("Psychology")) {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}else if(special.equals("Electrical Engineering") || special.equals("Aviation")) {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}else if(special.equals("Machenical Engineering")) {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}else {
						
						salary = (long) (Long.parseLong(amount)- (Long.parseLong(amount)*((Double.parseDouble(holidays)-1)/30)));
						return Salary = String.valueOf(salary);
						
					}
						
				}
				
			}
			return Salary;
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
		return Salary;
	}
	
}
