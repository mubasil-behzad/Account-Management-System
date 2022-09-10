package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T_Accessories extends JFrame {

	private JPanel contentPane;
	private JTextField search;
	private JTextField name;
	private JTextField special;
	private JTextField tec_id;
	private JTextField user;
	private JTextField dep;
	private JTextField phone;
	private JTextField address;
	private JTextField gender;
	private JTextField uniemail;
	private JTextField S_name;
	private JTextField S_dep;
	private JTextField S_tec_id;
	private JTextField T_salary;
	private ImageIcon icon_1;
	private ImageIcon icon_2;
	private JTabbedPane tabbedPane;
	private JTextField leaves;
	private ImageIcon format=null;
	private JLabel Img; 
	private JLabel S_Img;
	private Connection conn=null;
	private JTextField join;
	private JTextField S_join;
	private String Special;
	private String srch;
	private String holidays;
	private String amount;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T_Accessories frame = new T_Accessories();
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
	public T_Accessories() {
		setTitle("T_Accessories");
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/account_managment_system";
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,"root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		scrollPane.setViewportView(panel);
		ImageIcon icon_3 =new ImageIcon(this.getClass().getResource("/acount_Manage_2.png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 191, 255));
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setIcon(icon_3);
		lblNewLabel_2_1.setBounds(0, 0, 219, 209);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("PROFILE");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tabbedPane.setVisible(true);
				tabbedPane.setSelectedIndex(0);
			}
		});
		lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(255,255,255)));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(1, 289, 218, 38);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("SALARY");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setVisible(true);
				tabbedPane.setSelectedIndex(1);
			}
		});
		lblNewLabel_3_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_3_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(255,255,255)));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(1, 328, 218, 38);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(135, 206, 250));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_1.setBounds(0, 0, 22, 20);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
			int x=219,y=641;
			public void mouseClicked(MouseEvent e) {
				
				if(x==219) {
					panel_1.setSize(219, 626);
					Thread th = new Thread(){
						@Override
						public void run() {
							try {
								for(int i=219;i>=0;i--) {
									Thread.sleep(1);
									panel_1.setSize(i, 641);
									//panel_2.setLocation(panel_2.getLocation().x, panel_2.getLocation().y);
									
								}
							}catch (Exception e1) {
								JOptionPane.showMessageDialog(null, e1);
							}
						}
					};th.start();
					x=0;
					if(x==0) {
						lblNewLabel_1.setIcon(null);
						lblNewLabel_1.setIcon(icon_1);
						
					}
				}else{
					panel_1.setSize(x, 626);
					panel_1.show();
					Thread th = new Thread(){
						@Override
						public void run() {
							try {
								for(int i=0;i<=219;i++) {
									Thread.sleep(1);
									panel_1.setSize(i, 641);
								
									//panel_2.setLocation(panel_2.getLocation().x, panel_2.getLocation().y);
									
								}
							}catch (Exception e1) {
								JOptionPane.showMessageDialog(null, e1);
							}
						}
					};th.start();
					x=219;
					if(x==219) {
						lblNewLabel_1.setIcon(null);
						lblNewLabel_1.setIcon(icon_2);
						
					}
					
				}
				
			}
		});
		icon_1 =new ImageIcon(this.getClass().getResource("/O_C_arrow.png"));
		icon_2 =new ImageIcon(this.getClass().getResource("/O_C_arrow_1.png"));
		lblNewLabel_1.setIcon(icon_2);
		lblNewLabel_1.setBounds(0, 0, 22, 20);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(icon_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBorder(null);
		panel_3.setLayout(null);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBackground(new Color(135, 206, 250));
		panel_9_1.setBounds(1002, 83, 22, 490);
		panel_3.add(panel_9_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(135, 206, 250));
		panel_9.setBounds(70, 83, 22, 490);
		panel_3.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(135, 206, 250));
		panel_10.setBounds(70, 565, 943, 17);
		panel_3.add(panel_10);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(135, 206, 250));
		panel_5_1.setBounds(78, 9, 930, 87);
		panel_3.add(panel_5_1);
		
		search = new JTextField();
		search.setForeground(Color.BLACK);
		search.setFont(new Font("Tahoma", Font.BOLD, 13));
		search.setColumns(10);
		search.setBounds(256, 27, 356, 26);
		panel_5_1.add(search);
		
		JLabel lblNewLabel_4_5 = new JLabel("Search Teacher ID");
		lblNewLabel_4_5.setForeground(Color.BLACK);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_5.setBounds(66, 27, 180, 26);
		panel_5_1.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				srch = search.getText();
				
				try {
					
					
					String sql="SELECT `FirstName`, `LastName`, `Phone_No`, `Address`, `teacher_ID`, `Gender`, `Uni_Email`, `Username`, `Specialization`, `image`, `Department`, `Joining` FROM `teachers` WHERE `teacher_ID`=?";
					
					
					PreparedStatement preparedStatement= conn.prepareStatement(sql);
					
					
					//PreparedStatement.executeQuery();
					//if(!srch.isEmpty()) {
						preparedStatement.setString(1, srch);
						
						//int rows=preparedStatement.executeUpdate();
						ResultSet result= preparedStatement.executeQuery();
						if(!result.next()) {
							JOptionPane.showMessageDialog(null, "Teacher ID Not Found");
						}else {
							
							
							name.setText(String.valueOf(result.getString("FIRSTName")+" "+result.getString("LASTName")));
							S_name.setText(String.valueOf(result.getString("FIRSTName")+" "+result.getString("LASTName")));
							address.setText(String.valueOf(result.getString("Address")));
							uniemail.setText(String.valueOf(result.getString("Uni_Email")));
							phone.setText(String.valueOf(result.getString("Phone_No")));
							user.setText(String.valueOf(result.getString("Username")));
							gender.setText(String.valueOf(result.getString("Gender")));
							tec_id.setText(String.valueOf(result.getString("teacher_ID")));
							S_tec_id.setText(String.valueOf(result.getString("teacher_ID")));
							dep.setText(String.valueOf(result.getString("Department")));
							S_dep.setText(String.valueOf(result.getString("Department")));
							special.setText(String.valueOf(result.getString("Specialization")));
							Special =String.valueOf(result.getString("Specialization"));
							
							
							join.setText(String.valueOf(result.getString("Joining")));
							S_join.setText(String.valueOf(result.getString("Joining")));
							
							
							
							//For Image for profile
							byte[] imagedata=result.getBytes("image");
				               format=new ImageIcon(imagedata);
				               Image img=format.getImage();
				               Image img2=img.getScaledInstance(Img.getWidth(),Img.getHeight(), Image.SCALE_SMOOTH);
				               Image img1=img.getScaledInstance(S_Img.getWidth(),S_Img.getHeight(), Image.SCALE_SMOOTH);
				               ImageIcon image=new ImageIcon(img2);
				               ImageIcon image1=new ImageIcon(img1);
				               Img.setIcon(image);
				               S_Img.setIcon(image1);
				               
								
									String sql_2="SELECT `Specialization`, `salary` FROM `specialization_salary` WHERE 1";
									Statement statement = conn.createStatement();
									ResultSet result1 = statement.executeQuery(sql_2);
									while(result1.next()) {
										String special = result1.getString("Specialization");
										String Salary = result1.getString("salary");
										if(Special.equals(special)) {
										 T_salary.setText(Salary);
										 amount = Salary;
										}
									}	
				            
						}
						//conn.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		lblNewLabel_8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblNewLabel_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_8.setBounds(611, 27, 33, 26);
		ImageIcon icon4 =new ImageIcon(this.getClass().getResource("/search.png"));
		lblNewLabel_8.setIcon(icon4);
		panel_5_1.add(lblNewLabel_8);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(135, 206, 250));
		tabbedPane.setBounds(78, 68, 930, 505);
		tabbedPane.setVisible(false);
		panel_3.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4_1.setBackground(new Color(135, 206, 250));
		panel_4_1.setBounds(789, 96, 126, 129);
		panel_4.add(panel_4_1);
		panel_4_1.setLayout(new BorderLayout(0, 0));
		
		Img = new JLabel("");
		Img.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4_1.add(Img, BorderLayout.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 128));
		separator.setBounds(237, 68, 450, 10);
		panel_4.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("PROFILE");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_6.setBounds(202, 11, 520, 76);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(25, 89, 118, 26);
		panel_4.add(lblNewLabel_4);
		
		name = new JTextField();
		name.setEditable(false);
		name.setColumns(10);
		name.setBounds(153, 89, 159, 26);
		panel_4.add(name);
		
		JLabel lblNewLabel_4_8 = new JLabel("Username");
		lblNewLabel_4_8.setForeground(Color.BLACK);
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_8.setBounds(25, 172, 118, 26);
		panel_4.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_6 = new JLabel("Teacher ID");
		lblNewLabel_4_6.setForeground(Color.BLACK);
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6.setBounds(25, 255, 118, 26);
		panel_4.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_3 = new JLabel("Specilaization");
		lblNewLabel_4_3.setForeground(Color.BLACK);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(25, 421, 126, 26);
		panel_4.add(lblNewLabel_4_3);
		
		special = new JTextField();
		special.setEditable(false);
		special.setColumns(10);
		special.setBounds(153, 421, 159, 26);
		panel_4.add(special);
		
		tec_id = new JTextField();
		tec_id.setEditable(false);
		tec_id.setColumns(10);
		tec_id.setBounds(153, 255, 159, 26);
		panel_4.add(tec_id);
		
		user = new JTextField();
		user.setEditable(false);
		user.setColumns(10);
		user.setBounds(153, 172, 159, 26);
		panel_4.add(user);
		
		JLabel lblNewLabel_4_9 = new JLabel("Phone #");
		lblNewLabel_4_9.setForeground(Color.BLACK);
		lblNewLabel_4_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_9.setBounds(410, 172, 118, 26);
		panel_4.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_4_2 = new JLabel("Department");
		lblNewLabel_4_2.setForeground(Color.BLACK);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(410, 89, 118, 26);
		panel_4.add(lblNewLabel_4_2);
		
		dep = new JTextField();
		dep.setEditable(false);
		dep.setColumns(10);
		dep.setBounds(538, 89, 159, 26);
		panel_4.add(dep);
		
		phone = new JTextField();
		phone.setEditable(false);
		phone.setColumns(10);
		phone.setBounds(538, 172, 159, 26);
		panel_4.add(phone);
		
		JLabel lblNewLabel_4_7 = new JLabel("Address");
		lblNewLabel_4_7.setForeground(Color.BLACK);
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_7.setBounds(410, 255, 118, 26);
		panel_4.add(lblNewLabel_4_7);
		
		address = new JTextField();
		address.setEditable(false);
		address.setColumns(10);
		address.setBounds(538, 255, 159, 26);
		panel_4.add(address);
		
		gender = new JTextField();
		gender.setEditable(false);
		gender.setColumns(10);
		gender.setBounds(538, 338, 159, 26);
		panel_4.add(gender);
		
		JLabel lblNewLabel_4_4 = new JLabel("Gender");
		lblNewLabel_4_4.setForeground(Color.BLACK);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(410, 338, 118, 26);
		panel_4.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Email");
		lblNewLabel_4_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4_1.setBounds(410, 421, 118, 26);
		panel_4.add(lblNewLabel_4_4_1);
		
		uniemail = new JTextField();
		uniemail.setEditable(false);
		uniemail.setColumns(10);
		uniemail.setBounds(538, 421, 159, 26);
		panel_4.add(uniemail);
		
		JLabel lblNewLabel_4_4_1_1 = new JLabel("Joining");
		lblNewLabel_4_4_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4_1_1.setBounds(25, 338, 118, 26);
		panel_4.add(lblNewLabel_4_4_1_1);
		
		join = new JTextField();
		join.setEditable(false);
		join.setColumns(10);
		join.setBounds(153, 338, 159, 26);
		panel_4.add(join);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(237, 68, 450, 10);
		panel_5.add(separator_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("SALARY");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_6_1.setBounds(202, 11, 520, 67);
		panel_5.add(lblNewLabel_6_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4_1_1.setBackground(new Color(135, 206, 250));
		panel_4_1_1.setBounds(399, 98, 126, 129);
		panel_5.add(panel_4_1_1);
		
		S_Img = new JLabel("");
		S_Img.setHorizontalAlignment(SwingConstants.CENTER);
		S_Img.setBounds(0, 0, 126, 129);
		panel_4_1_1.add(S_Img);
		
		JLabel lblNewLabel_4_10 = new JLabel("Name");
		lblNewLabel_4_10.setForeground(Color.BLACK);
		lblNewLabel_4_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10.setBounds(122, 265, 118, 26);
		panel_5.add(lblNewLabel_4_10);
		
		S_name = new JTextField();
		S_name.setEditable(false);
		S_name.setColumns(10);
		S_name.setBounds(250, 265, 159, 26);
		panel_5.add(S_name);
		
		JLabel lblNewLabel_4_10_1_1 = new JLabel("Leaves");
		lblNewLabel_4_10_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10_1_1.setBounds(122, 398, 126, 26);
		panel_5.add(lblNewLabel_4_10_1_1);
		
		JLabel lblNewLabel_4_10_2 = new JLabel("Department");
		lblNewLabel_4_10_2.setForeground(Color.BLACK);
		lblNewLabel_4_10_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10_2.setBounds(507, 265, 118, 26);
		panel_5.add(lblNewLabel_4_10_2);
		
		S_dep = new JTextField();
		S_dep.setEditable(false);
		S_dep.setColumns(10);
		S_dep.setBounds(635, 265, 159, 26);
		panel_5.add(S_dep);
		
		JLabel lblNewLabel_4_6_1 = new JLabel("Teacher ID");
		lblNewLabel_4_6_1.setForeground(Color.BLACK);
		lblNewLabel_4_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6_1.setBounds(507, 335, 118, 26);
		panel_5.add(lblNewLabel_4_6_1);
		
		S_tec_id = new JTextField();
		S_tec_id.setEditable(false);
		S_tec_id.setColumns(10);
		S_tec_id.setBounds(635, 335, 159, 26);
		panel_5.add(S_tec_id);
		
		JLabel lblNewLabel_4_6_1_1 = new JLabel("Total Salary");
		lblNewLabel_4_6_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6_1_1.setBounds(507, 398, 118, 26);
		panel_5.add(lblNewLabel_4_6_1_1);
		
		T_salary = new JTextField();
		T_salary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		T_salary.setEditable(false);
		T_salary.setColumns(10);
		T_salary.setBounds(635, 398, 159, 26);
		panel_5.add(T_salary);
		
		leaves = new JTextField();
		leaves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				holidays = leaves.getText();
				try {
					String sql_1 = "UPDATE `teachers` SET  `Holidays`=? WHERE `teacher_ID`=?";
					//Statement statement_1 = conn.createStatement();
					PreparedStatement preparedstatement =conn.prepareStatement(sql_1);
					preparedstatement.setString(1, holidays);
					preparedstatement.setString(2, srch);
					preparedstatement.executeUpdate();
					T_Discount T_dis = new T_Discount();
					String Amount = T_dis.Leaves(holidays,srch,amount);
					T_salary.setText(null);
					T_salary.setText(Amount);
				}catch (Exception e3) {
					JOptionPane.showMessageDialog(null, e3);
				}
			}
		});
		leaves.setColumns(10);
		leaves.setBounds(250, 398, 159, 26);
		panel_5.add(leaves);
		
		S_join = new JTextField();
		S_join.setEditable(false);
		S_join.setColumns(10);
		S_join.setBounds(250, 335, 159, 26);
		panel_5.add(S_join);
		
		JLabel lblNewLabel_4_4_1_1_1 = new JLabel("Joining");
		lblNewLabel_4_4_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4_1_1_1.setBounds(122, 335, 118, 26);
		panel_5.add(lblNewLabel_4_4_1_1_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_7.setBackground(new Color(135, 206, 250));
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1338, 91);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/uskt_1.png"));
		lblNewLabel.setIcon(icon);
		panel_7.add(lblNewLabel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 1338, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(1090))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(163)
							.addComponent(lblNewLabel_2))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
