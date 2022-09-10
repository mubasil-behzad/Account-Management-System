package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teacher_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private Connection conn=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_Login frame = new Teacher_Login();
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
	public Teacher_Login() {
		setTitle("Teacher Login");
		setResizable(false);
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
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(10, 11, 580, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(140, 0, 440, 407);
		panel.add(panel_1);
		panel_1.setLayout(null);
		ImageIcon icon= new ImageIcon(this.getClass().getResource("/4.png"));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 265, 422, 7);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 120, 422, 7);
		panel_1.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("TEACHER LOGIN");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Impact", Font.BOLD, 40));
		lblNewLabel_4.setBounds(39, 26, 372, 83);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(87, 151, 70, 23);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 151, 167, 23);
		panel_1.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(87, 192, 70, 23);
		panel_1.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 192, 167, 23);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText(null);
				textField.setText(null);
			}
		});
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(86, 304, 91, 36);
		panel_1.add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String Pass=passwordField.getText();
				try {
					
					String sql = "SELECT `Username`, `PASSWORD` FROM `teachers` WHERE 1";
					Statement statement = conn.createStatement();
					ResultSet result = statement.executeQuery(sql);
					while(result.next()) {
						String uname = result.getString("Username");
						String pass = result.getString("PASSWORD");
						if(Pass.equals(pass) && name.equals(uname)) {
							
							JOptionPane.showMessageDialog(null, "Login Sucessfully...!");
							T_Accessories access = new T_Accessories();
							access.setVisible(true);
							setVisible(false);
						}
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Login Invalid Username or Password...!");
					passwordField.setText(null);
					textField.setText(null);
					JOptionPane.showMessageDialog(null, e1);
				}
				T_Accessories login = new T_Accessories();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(263, 304, 91, 36);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_5 = new JLabel("Click Here For ' REGISTER '");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Teacher_Register register = new Teacher_Register();
				register.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(119, 365, 202, 31);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 440, 407);
		lblNewLabel.setIcon(icon);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 139, 407);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/12.png"));
		lblNewLabel_1.setIcon(icon1);
		panel.add(lblNewLabel_1);
	}

}
