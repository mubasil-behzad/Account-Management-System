package database;
import java.sql.*;
public class Conection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CS bs =new CS();
		bs.ComputerScience(1);
		/*Connection conn=null;
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/permission";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
			System.out.println("connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("Select Query => ");
		
		
		try {
			String sql = "SELECT * FROM `login` WHERE 1";
			Statement statement=  conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			System.out.println("username" +" "+ "Password");
			while(result.next()) {
				int pass_word = result.getInt("password");
				String name = result.getString("username");
				System.out.println(name +" "+ pass_word);
			}
		}catch (Exception e){
			
		}
		System.out.println(3+4);*/
	}
}
