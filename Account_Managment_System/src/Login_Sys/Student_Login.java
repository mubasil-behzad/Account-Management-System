package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JPasswordField;

public class Student_Login extends JFrame {

	private JPanel contentPane;
	private JTextField S_name;
	private Connection conn =null;
	private JPasswordField S_pass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Login frame = new Student_Login();
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
	public Student_Login() {
		setTitle("Student Login");
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
			//throw new RuntimeException("Something Went Worng");
			JOptionPane.showMessageDialog(null, E);
			//System.out.println(E);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 580, 407);
		panel.setBackground(SystemColor.controlShadow);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 140, 407);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/12.png"));
		lblNewLabel.setIcon(icon1);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(140, 0, 440, 407);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ImageIcon icon= new ImageIcon(this.getClass().getResource("/4.png"));
		
		S_name = new JTextField();
		S_name.setBounds(202, 151, 167, 23);
		panel_1.add(S_name);
		S_name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(87, 151, 70, 23);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(87, 192, 70, 23);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT LOGIN");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Impact", Font.BOLD, 40));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(39, 26, 372, 83);
		panel_1.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 120, 422, 7);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 265, 422, 7);
		panel_1.add(separator_1);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				S_name.setText(null);
				S_pass.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(86, 304, 91, 36);
		panel_1.add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=S_name.getText();
				String Pass=S_pass.getText();
				try {
					
					String sql = "SELECT `Username`,`PASSWORD` FROM `students` WHERE 1";
					Statement statement = conn.createStatement();
					ResultSet result = statement.executeQuery(sql);
					while(result.next()) {
						String uname = result.getString("Username");
						String pass = result.getString("PASSWORD");
						if(Pass.equals(pass) && name.equals(uname)) {
							
							JOptionPane.showMessageDialog(null, "Login Sucessfully...!");
							Accessories access = new Accessories();
							setVisible(false);
							access.setVisible(true);	
						}
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Invaid Username or Password...!");
					S_name.setText(null);
					S_pass.setText(null);
					JOptionPane.showMessageDialog(null, e1);
				}
				
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(263, 304, 91, 36);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_5 = new JLabel("Click Here For ' REGISTER '");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Student_Register S_R = new Student_Register();
				S_R.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(119, 365, 202, 31);
		panel_1.add(lblNewLabel_5);
		
		S_pass = new JPasswordField();
		S_pass.setBounds(202, 192, 167, 23);
		panel_1.add(S_pass);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 440, 407);
		lblNewLabel_1.setIcon(icon);
		panel_1.add(lblNewLabel_1);
		contentPane.add(panel);
	}
}
