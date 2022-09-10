package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Forget_U extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField N_user;
	private JTextField C_user;
	private Connection conn=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forget_U frame = new Forget_U();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Forget_U() {
		setResizable(false);
		setTitle("Forget User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/account_managment_system";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
			
		} catch (Exception E) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Something Went Worng");
			//System.out.println(E);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 580, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/5.png"));
		
		JLabel lblNewLabel_1 = new JLabel("FORGET USERNAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Impact", Font.BOLD, 40));
		lblNewLabel_1.setBounds(118, 43, 343, 52);;
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(87, 171, 76, 28);
		panel.add(lblNewLabel_2);
		
		email = new JTextField();
		email.setBounds(247, 171, 135, 28);
		panel.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("New Username");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(87, 243, 111, 28);
		panel.add(lblNewLabel_2_1);
		
		N_user = new JTextField();
		N_user.setColumns(10);
		N_user.setBounds(247, 243, 135, 28);
		panel.add(N_user);
		
		JLabel lblNewLabel_2_2 = new JLabel("Confirm Username");
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(87, 315, 135, 28);
		panel.add(lblNewLabel_2_2);
		
		C_user = new JTextField();
		C_user.setColumns(10);
		C_user.setBounds(247, 315, 135, 28);
		panel.add(C_user);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Email=email.getText();
				String user=N_user.getText();
				String confirm=C_user.getText();
				int flag=0;
				try {
					String sql = "SELECT `email` FROM `register` WHERE 1";
					Statement statement=  conn.createStatement();
					ResultSet search = statement.executeQuery(sql);
					while(search.next()) {
						String Demail = search.getString("email");
						if(Demail.equals(Email) && !Email.isBlank())
						{
							flag=1;
							try {
								String sql_1 = "UPDATE `register` SET `username`=? WHERE email=?";
								PreparedStatement preparedStatement = conn.prepareStatement(sql_1);
								if(user.equals(confirm) && !user.isBlank())
								{
									preparedStatement.setString(1, user);
									preparedStatement.setString(2, Email);
								}
								int rows = preparedStatement.executeUpdate();
								
								if(rows>0){
									JOptionPane.showMessageDialog(null, "Update Successfully..!");
									Login_System login =new Login_System();
									login.main(null);
									setVisible(false);
								}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, e1);
							}
							
						}	
					}
					if(flag==0) {
						JOptionPane.showMessageDialog(null, "Invalid Email..!");
						email.setText(null);
						N_user.setText(null);
						C_user.setText(null);
					}
				}catch (Exception e1){
					
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(451, 357, 86, 28);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 580, 407);
		lblNewLabel.setIcon(icon);
		panel.add(lblNewLabel);
	}
}
