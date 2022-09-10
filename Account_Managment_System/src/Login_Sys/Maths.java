package Login_Sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Maths {
	private Connection conn=null;
	int i=1;
	//private String rollNo;
	//private String Email;
	void Math(int choice, String email,String reg) {
		
		
		
		switch(choice) {
			case 1:
			{
				BS(i,email,reg);
			}break;
			case 2:
			{
				MS(i,email,reg);
			}break;
			case 3:
			{
				ADP(i,email,reg);
			}break;
			case 4:
			{
				Msc(i,email,reg);
			}break;
			case 5:
			{
				PHD(i,email,reg);
			}break;
			default:
			{
				JOptionPane.showMessageDialog(null, "Invalid Degree..!");
			}
		}
	}
	
	void BS(int i,String email,String reg) {
		String rollNo;
		String Email;
		String REG_ID;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "25103001-00"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "25103002-0"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				break;
			}else {
				rollNo= "25103002-"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				break;
			}
			
			
		}
		
		
		
	}
	void MS(int i,String email,String reg)
	{
		String rollNo;
		String Email;
		String REG_ID;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "25103005-00"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "25103005-0"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else {
				rollNo= "25103005-"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}
			
			
		}
	}
	void ADP(int i,String email,String reg)
	{
		String rollNo;
		String Email;
		String REG_ID;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "25203005-00"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "25203005-0"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else {
				rollNo= "25203005-"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}
			
			
		}
	}
	void Msc(int i,String email,String reg)
	{
		String rollNo;
		String Email;
		String REG_ID;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "25113002-00"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "25113002-0"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else {
				rollNo= "25113002-"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}
			
			
		}
	}
	void PHD(int i,String email,String reg)
	{
		String rollNo;
		String Email;
		String REG_ID;
		for(;i<1000;) {
			
			
			if(i<10) {
				rollNo= "25313002-00"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else if(i<100){
				rollNo= "25313002-0"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}else {
				rollNo= "25313002-"+Integer.toString(i);
				Email=rollNo+"@uskt.edu.pk";
				REG_ID=reg+rollNo;
				connection(rollNo,Email,email,reg,REG_ID);
				//System.out.println(rollNo);
				break;
			}
			
			
		}
	}
	
	void connection(String rollNo,String Email,String email,String reg,String REG_ID) {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/account_managment_system";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		
		Duplicate(rollNo,email,reg);	
		
		try {
			String sql = "SELECT `EmailAddress` FROM `students` WHERE 1";
			Statement statement=  conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				String D_Email = result.getString("EmailAddress");
				if(D_Email.equals(email)){
					try {
						String sql_1 = "UPDATE `students` SET  `RollNo`=?,`Username`=?,`Uni_Email`=?,`Registeration_Id`=? WHERE `EmailAddress`=?";
						PreparedStatement preparedStatement = conn.prepareStatement(sql_1);
						preparedStatement.setString(1,rollNo);
						preparedStatement.setString(2,rollNo);
						preparedStatement.setString(3,Email);
						preparedStatement.setString(4,REG_ID);
						preparedStatement.setString(5,email);
						int rows = preparedStatement.executeUpdate();
						
						if(rows>0){
							JOptionPane.showMessageDialog(null, "Your Roll No/Username is "+rollNo+" and Email ID is "+Email);
						}
						conn.close();
					}catch (Exception e) {
						
						//JOptionPane.showMessageDialog(null, e);
					}
					
				}
			}
			
		} catch (SQLException e1) {
			//TODO Auto-generated catch block
			//System.out.println(e1);
			
		}
	}
	
	int Duplicate(String rollNo,String email,String reg) {
		//int flag=0;
		try {
				String sql = "SELECT `RollNo` FROM `students` WHERE 1";
				Statement statement=  conn.createStatement();
				ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				String uname = result.getString("RollNo");
				if(uname==null)
				{
					continue;
				}
				if(uname.matches(rollNo)){
					
					i++;
					
					if(rollNo.startsWith("25103002")){
						BS(i,email,reg);
					}else if(rollNo.startsWith("25103005")) {
						MS(i,email,reg);
					}else if(rollNo.startsWith("25203005")){
						ADP(i,email,reg);
					}else if(rollNo.startsWith("25113002")) {
						Msc(i,email,reg);
					}else {
						PHD(i,email,reg);
					}
				}
				
			}
		}catch (Exception e1){
			
			JOptionPane.showMessageDialog(null, e1);
		}
		//return rollNo;
		return 0;
	}

}