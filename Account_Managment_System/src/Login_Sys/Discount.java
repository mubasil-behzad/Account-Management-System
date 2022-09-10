package Login_Sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Discount {
	private String fees;
	private Connection conn=null;
	String scholar(String discount,String srch) {
		
		String Fees = null;
		String Deg_Dep;
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
			String sql = "SELECT `Deg_name`, `D_Name` FROM `students` WHERE `Registeration_Id` = ? ";
			
			PreparedStatement preparedStatement= conn.prepareStatement(sql);
				preparedStatement.setString(1, srch);
			
			ResultSet result = preparedStatement.executeQuery();
			if(!result.next()) {
				JOptionPane.showMessageDialog(null, "Registration ID Not Found");
			}else {
				String degree = String.valueOf(result.getString("Deg_name"));
				String Depat = String.valueOf(result.getString("D_Name"));
				Deg_Dep = degree+" "+Depat;
				//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
				if(Depat.equals("Computer Science (C.S)") || Depat.equals("Software Engineering (S.E)") || Depat.equals("Information Technology (I.T)")) {
					if(Deg_Dep.equals("Bachelor's Computer Science (C.S)") || Deg_Dep.equals("Bachelor's Software Engineering (S.E)") || Deg_Dep.equals("Bachelor's Information Technology (I.T)")) {
						
						fees = "65000";
						//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Master's Computer Science (C.S)") || Deg_Dep.equals("Master's Software Engineering (S.E)") || Deg_Dep.equals("Master's Information Technology (I.T)")) {
						
						fees = "50850";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("ADP Computer Science (C.S)") || Deg_Dep.equals("ADP Software Engineering (S.E)") || Deg_Dep.equals("ADP Information Technology (I.T)")) {
						
						fees = "40000";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Msc Computer Science (C.S)") || Deg_Dep.equals("Msc Software Engineering (S.E)") || Deg_Dep.equals("Msc Information Technology (I.T)")) {
						
						fees = "60000";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Phd Computer Science (C.S)") || Deg_Dep.equals("Phd Software Engineering (S.E)") || Deg_Dep.equals("Phd Information Technology (I.T)")) {
						
						fees = "100000";
						Fees=N_Discount(discount,fees);
					}else {
						
					}
				}else if(Depat.equals("International Relationship (I.R.)")){
					if(Deg_Dep.equals("Bachelor's International Relationship (I.R.)")) {
						
						fees = "50400";
						//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Master's International Relationship (I.R.)")) {
						
						fees = "40850";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("ADP International Relationship (I.R.)")) {
						
						fees = "30000";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Msc International Relationship (I.R.)")) {
						
						fees = "48000";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Phd International Relationship (I.R.)")) {
						
						fees = "90000";
						Fees=N_Discount(discount,fees);
					}else {
						
					}
				}else if(Depat.equals("Maths") || Depat.equals("Psychology")) {
					if(Deg_Dep.equals("Bachelor's Maths") || Deg_Dep.equals("Bachelor's Psychology")) {
						
						fees = "56550";
						//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Master's Maths") || Deg_Dep.equals("Master's Psychology")) {
						
						fees = "45500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("ADP Maths") || Deg_Dep.equals("ADP Psychology")) {
						
						fees = "35050";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Msc Maths") || Deg_Dep.equals("Msc Psychology")) {
						
						fees = "43500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Phd Maths") || Deg_Dep.equals("Phd Psychology")) {
						
						fees = "80000";
						Fees=N_Discount(discount,fees);
					}else {
						
					}
				}else if(Depat.equals("Business (B.B.A.)") || Depat.equals("L.A.W.")) {
					if(Deg_Dep.equals("Bachelor's Business (B.B.A.)") || Deg_Dep.equals("Bachelor's L.A.W.")) {
						
						fees = "40000";
						//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Master's Business (B.B.A.)") || Deg_Dep.equals("Master's L.A.W.")) {
						
						fees = "32500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("ADP Business (B.B.A.)") || Deg_Dep.equals("ADP L.A.W.")) {
						
						fees = "35050";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Msc Business (B.B.A.)") || Deg_Dep.equals("Msc L.A.W.")) {
						
						fees = "38500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Phd Business (B.B.A.)") || Deg_Dep.equals("Phd L.A.W.")) {
						
						fees = "70000";
						Fees=N_Discount(discount,fees);
					}else {
						
					}
				}else {
					if(Deg_Dep.equals("Bachelor's Aviation")) {
						
						fees = "70000";
						//JOptionPane.showMessageDialog(null, Deg_Dep+" "+fees);
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Master's Aviation")) {
						
						fees = "62500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("ADP Aviation")) {
						
						fees = "55050";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Msc Aviation")) {
						
						fees = "48500";
						Fees=N_Discount(discount,fees);
					}else if(Deg_Dep.equals("Phd Aviation")) {
						
						fees = "100000";
						Fees=N_Discount(discount,fees);
					}else {
						
					}
				}
			
			}
			conn.close();
	}catch (Exception e1){
		
		JOptionPane.showMessageDialog(null, e1);
	}
		return Fees;
		
		
	}
	
	String N_Discount(String discount, String fees) {
		long t_Fees = 0;
		String Fees = null;
		if(discount.equals("Need Base")) {
			
			t_Fees =(long) (Long.parseLong(fees)-(Long.parseLong(fees)*(0.1)));
			return Fees = String.valueOf(t_Fees);
		}else if(discount.equals("KeenShip")) {
			
			t_Fees =(long) (Long.parseLong(fees)-(Long.parseLong(fees)*(0.2)));
			return Fees = String.valueOf(t_Fees);
		}else if(discount.equals("Orphan Base")) {
			
			t_Fees =(long) (Long.parseLong(fees)-(Long.parseLong(fees)*(0.3)));
			return Fees = String.valueOf(t_Fees);
		}else if(discount.isBlank()) {
			return Fees = String.valueOf(fees);
		}
		return Fees;
	}

}
