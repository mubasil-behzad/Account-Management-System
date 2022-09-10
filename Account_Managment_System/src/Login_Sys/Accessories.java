package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;



import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;


import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseMotionAdapter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Accessories extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel Img;
	private JLabel F_Img;
	private ImageIcon format=null;
	private ImageIcon icon_1,icon_2;
	private JPanel panel_6;
	private JPanel panel_7;
	private JTabbedPane tabbedPane;
	private JTextField name;
	private JTextField rollno;
	private JTextField uniemail;
	private JTextField deg_dep;
	private JTextField gender;
	private Connection conn=null;
	private JTextField reg_id;
	private JTextField address;
	private JTextField user;
	private JTextField phone;
	private JTextField F_name;
	private JTextField F_rollno;
	private JTextField F_D_D;
	private JTextField F_reg_id;
	private JTextField T_fees;
	private JComboBox scholar;
	private String discount;
	private String fees;
	private String srch;
	private String Name;
	private String Address;
	private String Unimail ;
	private String Phone;
	private String RollNo;
	private String User;
	private String Gender;
	private String RegId;
	private String DEP_DEG;
	//private ImageIcon image1;
	private String path;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accessories frame = new Accessories();
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
	public Accessories() {
		setTitle("Accessories");
		Discount dis= new Discount();
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 191, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 2, 0, 0, (Color) new Color(0, 0, 0)));
		panel_2.setBackground(new Color(135, 206, 250));
		ImageIcon icon =new ImageIcon(this.getClass().getResource("/acount_Manage.png"));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		
		
		lblNewLabel_1 = new JLabel("");
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
		
		panel_2.setLayout(null);
		
		
		//lblNewLabel_1.setVisible(false);
		
		panel_2.add(lblNewLabel_1);
		ImageIcon icon_3 =new ImageIcon(this.getClass().getResource("/acount_Manage_2.png"));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("PROFILE");
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//panel_7.setVisible(false);
				//panel_6.setVisible(true);
				//tabbedPane.setSelectedIndex(-1);
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
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(255,255,255)));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(1, 289, 218, 38);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("FEES");
		
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//panel_6.setVisible(false);
				//panel_7.setVisible(true);
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
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBorder(new MatteBorder(2, 0, 2, 0, (Color) new Color(255,255,255)));
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(1, 328, 218, 38);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(icon_3);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 219, 209);
		lblNewLabel_2_1.setIcon(icon_3);
		panel_1.add(lblNewLabel_2_1);
		panel_4.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(135, 206, 250));
		panel_10.setBounds(70, 565, 943, 17);
		panel_4.add(panel_10);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(new Color(135, 206, 250));
		panel_9_1.setBounds(1002, 83, 22, 490);
		panel_4.add(panel_9_1);
		panel_9_1.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(135, 206, 250));
		panel_9.setBounds(70, 83, 22, 490);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 250));
		panel_5.setBounds(78, 11, 930, 87);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		ImageIcon icon2= new ImageIcon(this.getClass().getResource("/uskt.png"));
		
		JTextField search =new JTextField();
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String Search = search.getText().trim();
				if(Search.equals("")) {
					
				}
			}
		});
		search.setForeground(Color.BLACK);
		search.setFont(new Font("Tahoma", Font.BOLD, 13));
		search.setBounds(256, 27, 356, 26);
		panel_5.add(search);
		search.setColumns(10);
		
		
		
		
		
		JLabel lblNewLabel_4_5 = new JLabel("Search Reg ID #");
		lblNewLabel_4_5.setForeground(Color.BLACK);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_5.setBounds(66, 27, 180, 26);
		panel_5.add(lblNewLabel_4_5);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(135, 206, 250));
		tabbedPane.setBackground(new Color(135, 206, 250));
		tabbedPane.setBounds(78, 68, 930, 505);
		tabbedPane.setVisible(false);
		
		if(!tabbedPane.isDisplayable()) {
			
		}
		panel_4.add(tabbedPane);
		
		panel_6 = new JPanel();
		panel_6.setForeground(new Color(30, 144, 255));
		panel_6.setBackground(new Color(135, 206, 250));
		panel_6.setVisible(false);
		tabbedPane.addTab("New tab", null, panel_6, null);
		tabbedPane.setForegroundAt(0, new Color(30, 144, 255));
		tabbedPane.setBackgroundAt(0, new Color(30, 144, 255));
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(25, 89, 118, 26);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Roll #");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(25, 338, 118, 26);
		panel_6.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Deg/Dpt");
		lblNewLabel_4_2.setForeground(Color.BLACK);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(410, 89, 118, 26);
		panel_6.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Email");
		lblNewLabel_4_3.setForeground(Color.BLACK);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(249, 423, 118, 26);
		panel_6.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Gender");
		lblNewLabel_4_4.setForeground(Color.BLACK);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_4.setBounds(410, 338, 118, 26);
		panel_6.add(lblNewLabel_4_4);
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 128));
		separator.setBounds(237, 68, 450, 10);
		panel_6.add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("PROFILE");
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_6.setBounds(202, 11, 520, 76);
		panel_6.add(lblNewLabel_6);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(135, 206, 250));
		panel_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4_1.setBounds(789, 96, 126, 129);
		panel_6.add(panel_4_1);
		panel_4_1.setLayout(new BorderLayout(0, 0));
		
		Img = new JLabel("");
		Img.setBackground(new Color(30, 144, 255));
		Img.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4_1.add(Img, BorderLayout.CENTER);
		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 11));
		name.setEditable(false);
		name.setBounds(153, 89, 187, 26);
		panel_6.add(name);
		name.setColumns(10);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.BOLD, 11));
		rollno.setEditable(false);
		rollno.setColumns(10);
		rollno.setBounds(153, 338, 187, 26);
		panel_6.add(rollno);
		
		uniemail = new JTextField();
		uniemail.setFont(new Font("Tahoma", Font.BOLD, 11));
		uniemail.setEditable(false);
		uniemail.setColumns(10);
		uniemail.setBounds(377, 423, 187, 26);
		panel_6.add(uniemail);
		
		deg_dep = new JTextField();
		deg_dep.setFont(new Font("Tahoma", Font.BOLD, 11));
		deg_dep.setEditable(false);
		deg_dep.setColumns(10);
		deg_dep.setBounds(538, 89, 187, 26);
		panel_6.add(deg_dep);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.BOLD, 11));
		gender.setEditable(false);
		gender.setColumns(10);
		gender.setBounds(538, 338, 184, 26);
		panel_6.add(gender);
		
		JLabel lblNewLabel_4_6 = new JLabel("Reg ID");
		lblNewLabel_4_6.setForeground(Color.BLACK);
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6.setBounds(25, 255, 118, 26);
		panel_6.add(lblNewLabel_4_6);
		
		reg_id = new JTextField();
		reg_id.setFont(new Font("Tahoma", Font.BOLD, 11));
		reg_id.setEditable(false);
		reg_id.setColumns(10);
		reg_id.setBounds(153, 255, 187, 26);
		panel_6.add(reg_id);
		
		JLabel lblNewLabel_4_7 = new JLabel("Address");
		lblNewLabel_4_7.setForeground(Color.BLACK);
		lblNewLabel_4_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_7.setBounds(410, 255, 118, 26);
		panel_6.add(lblNewLabel_4_7);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.BOLD, 11));
		address.setEditable(false);
		address.setColumns(10);
		address.setBounds(538, 255, 184, 26);
		panel_6.add(address);
		
		JLabel lblNewLabel_4_8 = new JLabel("Username");
		lblNewLabel_4_8.setForeground(Color.BLACK);
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_8.setBounds(25, 172, 118, 26);
		panel_6.add(lblNewLabel_4_8);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.BOLD, 11));
		user.setEditable(false);
		user.setColumns(10);
		user.setBounds(153, 172, 187, 26);
		panel_6.add(user);
		
		JLabel lblNewLabel_4_9 = new JLabel("Phone #");
		lblNewLabel_4_9.setForeground(Color.BLACK);
		lblNewLabel_4_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_9.setBounds(410, 172, 118, 26);
		panel_6.add(lblNewLabel_4_9);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.BOLD, 11));
		phone.setEditable(false);
		phone.setColumns(10);
		phone.setBounds(538, 172, 184, 26);
		panel_6.add(phone);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				srch = search.getText();
				 
					
				try {
					
					
					String sql="SELECT `FIRSTName`, `Address`, `LASTName`, `Phone_No`, `RollNo`, `Username`, `Gender`, `Uni_Email`, `Registeration_Id`, `images`, `file_N`, `Deg_name`, `D_Name` FROM `students` WHERE `Registeration_Id` = ? ";
					//Statement statement = conn.createStatement();
					PreparedStatement preparedStatement= conn.prepareStatement(sql);
					//if(!srch.isEmpty()) {
						preparedStatement.setString(1, srch);
						//int rows=preparedStatement.executeUpdate();
						ResultSet result= preparedStatement.executeQuery();
						if(!result.next()) {
							JOptionPane.showMessageDialog(null, "Registration ID Not Found");
						}else {
							
							name.setText(String.valueOf(result.getString("FIRSTName")+" "+result.getString("LASTName")));
							F_name.setText(String.valueOf(result.getString("FIRSTName")+" "+result.getString("LASTName")));
							Name = String.valueOf(result.getString("FIRSTName")+" "+result.getString("LASTName"));
							
							address.setText(String.valueOf(result.getString("Address")));
							Address=String.valueOf(result.getString("Address"));
							
							uniemail.setText(String.valueOf(result.getString("Uni_Email")));
							Unimail= String.valueOf(result.getString("Uni_Email"));
							
							phone.setText(String.valueOf(result.getString("Phone_No")));
							Phone=String.valueOf(result.getString("Phone_No"));
							
							rollno.setText(String.valueOf(result.getString("RollNo")));
							F_rollno.setText(String.valueOf(result.getString("RollNo")));
							RollNo=String.valueOf(result.getString("RollNo"));
							
							user.setText(String.valueOf(result.getString("Username")));
							User=String.valueOf(result.getString("Username"));
							
							gender.setText(String.valueOf(result.getString("Gender")));
							Gender=String.valueOf(result.getString("Gender"));
							
							reg_id.setText(String.valueOf(result.getString("Registeration_Id")));
							F_reg_id.setText(String.valueOf(result.getString("Registeration_Id")));
							RegId=String.valueOf(result.getString("Registeration_Id"));
							
							deg_dep.setText(String.valueOf(result.getString("Deg_name")+" "+result.getString("D_Name")));
							F_D_D.setText(String.valueOf(result.getString("Deg_name")+" "+result.getString("D_Name")));
							DEP_DEG=String.valueOf(result.getString("Deg_name")+" "+result.getString("D_Name"));
							
							//For Image for profile
							byte[] imagedata=result.getBytes("images");
				               format=new ImageIcon(imagedata);
				               
				               Image img=format.getImage();
				             
				               Image img2=img.getScaledInstance(Img.getWidth(),Img.getHeight(), Image.SCALE_SMOOTH);
				               Image img1=img.getScaledInstance(F_Img.getWidth(),F_Img.getHeight(), Image.SCALE_SMOOTH);
				               ImageIcon image=new ImageIcon(img2);
				               ImageIcon image1=new ImageIcon(img1);
				               Img.setIcon(image);
				               F_Img.setIcon(image1);
				               //image = s 
				            
						}
						conn.close();
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
		panel_5.add(lblNewLabel_8);
		
		
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(135, 206, 250));
		panel_7.setVisible(false);
		tabbedPane.addTab("New tab", null, panel_7, null);
		panel_7.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(237, 68, 450, 10);
		panel_7.add(separator_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("FEES");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_6_1.setBounds(202, 11, 520, 67);
		panel_7.add(lblNewLabel_6_1);
		
		
		JLabel lblNewLabel_4_10 = new JLabel("Name");
		lblNewLabel_4_10.setForeground(Color.BLACK);
		lblNewLabel_4_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10.setBounds(122, 265, 118, 26);
		panel_7.add(lblNewLabel_4_10);
		
		F_name = new JTextField();
		F_name.setFont(new Font("Tahoma", Font.BOLD, 11));
		F_name.setEditable(false);
		F_name.setColumns(10);
		F_name.setBounds(250, 265, 187, 26);
		panel_7.add(F_name);
		
		F_rollno = new JTextField();
		F_rollno.setFont(new Font("Tahoma", Font.BOLD, 11));
		F_rollno.setEditable(false);
		F_rollno.setColumns(10);
		F_rollno.setBounds(250, 335, 187, 26);
		panel_7.add(F_rollno);
		
		JLabel lblNewLabel_4_10_1 = new JLabel("Roll #");
		lblNewLabel_4_10_1.setForeground(Color.BLACK);
		lblNewLabel_4_10_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10_1.setBounds(122, 335, 118, 26);
		panel_7.add(lblNewLabel_4_10_1);
		
		F_D_D = new JTextField();
		F_D_D.setFont(new Font("Tahoma", Font.BOLD, 11));
		F_D_D.setEditable(false);
		F_D_D.setColumns(10);
		F_D_D.setBounds(635, 265, 187, 26);
		panel_7.add(F_D_D);
		
		JLabel lblNewLabel_4_10_2 = new JLabel("Deg/Dpt");
		lblNewLabel_4_10_2.setForeground(Color.BLACK);
		lblNewLabel_4_10_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10_2.setBounds(507, 265, 118, 26);
		panel_7.add(lblNewLabel_4_10_2);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4_1_1.setBackground(new Color(135, 206, 250));
		panel_4_1_1.setBounds(399, 98, 126, 129);
		panel_7.add(panel_4_1_1);
		panel_4_1_1.setLayout(null);
		
		F_Img = new JLabel("");
		F_Img.setHorizontalAlignment(SwingConstants.CENTER);
		F_Img.setBounds(0, 0, 126, 129);
		panel_4_1_1.add(F_Img);
		
		JLabel lblNewLabel_4_6_1 = new JLabel("Reg ID");
		lblNewLabel_4_6_1.setForeground(Color.BLACK);
		lblNewLabel_4_6_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6_1.setBounds(507, 335, 118, 26);
		panel_7.add(lblNewLabel_4_6_1);
		
		F_reg_id = new JTextField();
		F_reg_id.setFont(new Font("Tahoma", Font.BOLD, 11));
		F_reg_id.setEditable(false);
		F_reg_id.setColumns(10);
		F_reg_id.setBounds(635, 335, 187, 26);
		panel_7.add(F_reg_id);
		
		scholar = new JComboBox();
		scholar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				discount = scholar.getSelectedItem().toString();
				fees=dis.scholar(discount,srch);
				T_fees.setText(fees);
			}
		});
		scholar.setFont(new Font("Tahoma", Font.BOLD, 11));
		scholar.setModel(new DefaultComboBoxModel(new String[] {"", "Need Base", "KeenShip", "Orphan Base"}));
		scholar.setBounds(250, 398, 187, 26);
		panel_7.add(scholar);
		
		JLabel lblNewLabel_4_10_1_1 = new JLabel("Scholarship's");
		lblNewLabel_4_10_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_10_1_1.setBounds(122, 398, 126, 26);
		panel_7.add(lblNewLabel_4_10_1_1);
		
		JLabel lblNewLabel_4_6_1_1 = new JLabel("Total Fees");
		lblNewLabel_4_6_1_1.setForeground(Color.BLACK);
		lblNewLabel_4_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_6_1_1.setBounds(507, 398, 118, 26);
		panel_7.add(lblNewLabel_4_6_1_1);
		
		T_fees = new JTextField();
		T_fees.setFont(new Font("Tahoma", Font.BOLD, 11));
		T_fees.setEditable(false);
		T_fees.setColumns(10);
		T_fees.setBounds(635, 398, 187, 26);
		panel_7.add(T_fees);
		ImageIcon icon3= new ImageIcon(this.getClass().getResource("/uskt.png"));
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		panel_7_1.setBackground(new Color(135, 206, 250));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1338, 91);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/uskt_1.png"));
		lblNewLabel.setIcon(icon1);
		panel_7_1.add(lblNewLabel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_7_1, GroupLayout.DEFAULT_SIZE, 1338, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(1090))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_7_1, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(163)
							.addComponent(lblNewLabel_2))
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)))
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
