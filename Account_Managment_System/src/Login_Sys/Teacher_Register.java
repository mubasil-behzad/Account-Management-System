package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Teacher_Register extends JFrame {

	private JPanel contentPane;
	private JTextField F_name;
	private JTextField P_email;
	private JTextField phoneNo;
	private JTextField L_name;
	private JTextField loction;
	private JPasswordField pass;
	private JTextField Teacher_id;
	private String filename=null;
	private byte[] person_img=null;
	private Connection conn=null;
	private String teacher_id;
	private JLabel img_s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_Register frame = new Teacher_Register();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
	}
	
	public void Teacher_id(String t_id) {
		
		long result = Math.round(Math.random()*100);
		teacher_id = t_id +"uskt"+ result;
		
		try {
			String sql = "SELECT `teacher_ID` FROM `teachers` WHERE 1";
			Statement statement=  conn.createStatement();
			ResultSet result2 = statement.executeQuery(sql);
		while(result2.next()) {
			String uname = result2.getString("teacher_ID");
			if(uname==null)
			{
				continue;
			}
			if(uname.matches(teacher_id)){
				Teacher_id(t_id);
			}
			
		}
	}catch (Exception e1){
		
		JOptionPane.showMessageDialog(null, e1);
	}
		
	}

	/**
	 * Create the frame.
	 */
	public Teacher_Register() {
		setTitle("Teacher Register");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
		);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		scrollPane.setViewportView(panel);
		
		JLabel lblTeachersRegister = new JLabel("TEACHER'S  REGISTER");
		lblTeachersRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeachersRegister.setFont(new Font("Impact", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setVisible(false);
		panel_1.setLayout(null);
		
		JComboBox Spl = new JComboBox();
		Spl.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Spl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Spl.setToolTipText("NOTE : \r\n\t\tTeacher must have done Mphil ");
		Spl.setModel(new DefaultComboBoxModel(new String[] {"", "C/ C++", "C#/ JAVA/ Python", "Web Development", "Mathematics", "Physics", "Chemistry", "Electrical Engineering", "Machenical Engineering", "Aviation", "Business", "Psychology"}));
		Spl.setFont(new Font("Tahoma", Font.BOLD, 9));
		Spl.setBackground(Color.LIGHT_GRAY);
		Spl.setBounds(202, 413, 115, 22);
		panel_1.add(Spl);
		
		JComboBox Dep = new JComboBox();
		Dep.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Dep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Dep.setModel(new DefaultComboBoxModel(new String[] {"", "Computer Science (C.S)", "Software Engineering (S.E)", "Information Technology (I.T)", "Business (B.B.A.)", "L.A.W.", "International Relationship (I.R.)", "Maths", "Psychology", "Aviation"}));
		Dep.setToolTipText("");
		Dep.setFont(new Font("Tahoma", Font.BOLD, 9));
		Dep.setBackground(Color.LIGHT_GRAY);
		Dep.setBounds(202, 326, 115, 22);
		panel_1.add(Dep);
		
		JLabel lblNewLabel_2 = new JLabel("First name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(61, 65, 80, 22);
		panel_1.add(lblNewLabel_2);
		
		F_name = new JTextField();
		F_name.setColumns(10);
		F_name.setBounds(202, 65, 115, 22);
		panel_1.add(F_name);
		
		JLabel lblNewLabel_2_2 = new JLabel("Personal Email");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(61, 152, 99, 22);
		panel_1.add(lblNewLabel_2_2);
		
		P_email = new JTextField();
		P_email.setToolTipText("@gmail.com");
		P_email.setColumns(10);
		P_email.setBounds(202, 152, 115, 22);
		panel_1.add(P_email);
		
		JLabel lblNewLabel_2_3 = new JLabel("Phone #");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(61, 239, 80, 22);
		panel_1.add(lblNewLabel_2_3);
		
		phoneNo = new JTextField();
		phoneNo.setColumns(10);
		phoneNo.setBounds(202, 239, 115, 22);
		panel_1.add(phoneNo);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Department");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_1.setBounds(61, 326, 99, 22);
		panel_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Specialization");
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_1_1.setBounds(61, 413, 99, 22);
		panel_1.add(lblNewLabel_2_3_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(135, 206, 250));
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 92, 327, 319);
		lblNewLabel_1.setVisible(false);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/13_1.png"));
		
		lblNewLabel_1.setIcon(icon);
		panel_1_1.add(lblNewLabel_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(135, 206, 250));
		panel_1_2.setVisible(false);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_2_4 = new JLabel("Last name");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(61, 65, 80, 22);
		panel_1_2.add(lblNewLabel_2_4);
		
		L_name = new JTextField();
		L_name.setColumns(10);
		L_name.setBounds(202, 65, 115, 22);
		panel_1_2.add(L_name);
		
		JLabel lblNewLabel_2_5 = new JLabel("Gender");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(61, 153, 80, 22);
		panel_1_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Address");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6.setBounds(61, 239, 80, 22);
		panel_1_2.add(lblNewLabel_2_6);
		
		loction = new JTextField();
		loction.setColumns(10);
		loction.setBounds(202, 239, 115, 22);
		panel_1_2.add(loction);
		
		JLabel lblNewLabel_2_6_1 = new JLabel("Date Of Birth");
		lblNewLabel_2_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6_1.setBounds(61, 328, 90, 22);
		panel_1_2.add(lblNewLabel_2_6_1);
		
		JDateChooser BirthDate = new JDateChooser();
		BirthDate.getCalendarButton().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				BirthDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		BirthDate.getCalendarButton().setBackground(new Color(135, 206, 250));
		BirthDate.setBackground(new Color(135, 206, 250));
		BirthDate.setBounds(202, 328, 115, 22);
		panel_1_2.add(BirthDate);
		
		JRadioButton maleB = new JRadioButton("Male");
		maleB.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				maleB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		maleB.setBackground(new Color(135, 206, 250));
		maleB.setFont(new Font("Tahoma", Font.BOLD, 11));
		maleB.setBounds(184, 152, 53, 22);
		panel_1_2.add(maleB);
		
		JRadioButton femaleB = new JRadioButton("Female");
		femaleB.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				femaleB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		femaleB.setBackground(new Color(135, 206, 250));
		femaleB.setFont(new Font("Tahoma", Font.BOLD, 11));
		femaleB.setBounds(239, 152, 67, 22);
		panel_1_2.add(femaleB);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleB);
		group.add(femaleB);
		
		JButton Reg = new JButton("Register");
		Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String first= F_name.getText();
				String last= L_name.getText();
				String email= P_email.getText();
				String uni_email = email.replace("@gmail.com", "@uskt.edu.pk");
				SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
				String date=sdf.format(BirthDate.getDate());
				String address= loction.getText();
				String phone= phoneNo.getText();
				
				String Gender;
				if(maleB.isSelected()) {
					Gender="Male";
				}else{
					Gender="Female";
				}
				String specialization= Spl.getSelectedItem().toString();
				String department=Dep.getSelectedItem().toString();
				String t_id= Teacher_id.getText();
				Teacher_id(t_id);
				String p_word = pass.getText();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				String time_date = dtf.format(now);
				
				String sql = "INSERT INTO `teachers`(`FirstName`, `LastName`, `Phone_No`, `P_Email`, `Address`, `teacher_ID`, `Gender`, `Birth_Date`, `PASSWORD`, `Specialization`, `image`,  `Department`, `Joining`, `Uni_Email`, `Username`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				try {
					PreparedStatement preparedStatement =conn.prepareStatement(sql);
					if(!first.isEmpty()){	
						preparedStatement.setString(1, first);
					}
					if(!last.isEmpty()){
						preparedStatement.setString(2, last);
					}
					if(!phone.isEmpty()){
						preparedStatement.setString(3, phone);
					}
					if(!email.isEmpty() && email.endsWith("@gmail.com")){
						preparedStatement.setString(4, email);
					}
					if(!address.isEmpty()){
						preparedStatement.setString(5, address);
					}
					preparedStatement.setString(6, teacher_id);
					preparedStatement.setString(7, Gender);
					if(!date.isEmpty()){
						preparedStatement.setString(8, date);
					}
					preparedStatement.setString(9,p_word);
					preparedStatement.setString(10,specialization);
					preparedStatement.setBytes(11, person_img);
					preparedStatement.setString(12,department);
					preparedStatement.setString(13,time_date);
					preparedStatement.setString(14,uni_email);
					preparedStatement.setString(15,"uskt123");
					
					int rows = preparedStatement.executeUpdate();
					if(rows>0) {
						
						JOptionPane.showMessageDialog(null, "Your Uni-Email is "+uni_email+" and your default Username is \"uskt123\" and your ID is "+teacher_id);
						int opinion=JOptionPane.showConfirmDialog(null, "Do you want to change username","",JOptionPane.YES_NO_OPTION);
						if(opinion==0) {
							Change_Username change = new Change_Username();
							change.setVisible(true);
							setVisible(false);
						}
						
					}
					conn.close();
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		Reg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Reg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Reg.setForeground(Color.BLACK);
		Reg.setFont(new Font("Tahoma", Font.BOLD, 11));
		Reg.setBackground(Color.LIGHT_GRAY);
		Reg.setBounds(279, 465, 89, 28);
		panel_1_2.add(Reg);
		
		JLabel lblNewLabel_2_6_2 = new JLabel("Password");
		lblNewLabel_2_6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6_2.setBounds(61, 413, 80, 22);
		panel_1_2.add(lblNewLabel_2_6_2);
		
		pass = new JPasswordField();
		pass.setBounds(202, 413, 115, 22);
		panel_1_2.add(pass);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		
		panel_3.setLayout(null);
		
		img_s = new JLabel("");
		img_s.setBounds(0, 0, 126, 129);
		panel_3.add(img_s);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setVisible(false);
		panel_4.setBounds(0, 0, 126, 129);
		panel_3.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel image_s = new JLabel("");
		panel_4.add(image_s, BorderLayout.CENTER);
		//panel_2.setLayout(null);
		
		JButton img_choose = new JButton("Choose");
		img_choose.setVisible(false);
		img_choose.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
				img_choose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		img_choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser= new JFileChooser();
				chooser.showOpenDialog(null);
				File f =chooser.getSelectedFile();
				filename =f.getAbsolutePath();
				ImageIcon icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img_s.getWidth(),img_s.getHeight(),Image.SCALE_SMOOTH));
				image_s.setIcon(icon);
				try {
					File image = new File(filename);
					FileInputStream fis = new FileInputStream(image);
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					byte[] buf = new byte[1024];
					for(int readnum;(readnum= fis.read(buf))!= -1;) {
						bos.write(buf, 0 , readnum);
						
					}
					person_img = bos.toByteArray();
					
				}catch (Exception e1){
					JOptionPane.showMessageDialog(null, e);
					
				}
			}
		});
		img_choose.setForeground(Color.BLACK);
		img_choose.setFont(new Font("Tahoma", Font.BOLD, 11));
		img_choose.setBackground(Color.LIGHT_GRAY);
		img_choose.setBounds(160, 83, 89, 28);
		panel_3.add(img_choose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Teacher ID");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(61, 8, 80, 22);
		panel_2.add(lblNewLabel_2_1);
		
		Teacher_id = new JTextField();
		Teacher_id.setToolTipText("Enter Short Form Of Your Department (Like Computer Science as \"CS\" )");
		Teacher_id.setColumns(10);
		Teacher_id.setBounds(202, 8, 115, 22);
		panel_2.add(Teacher_id);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(135, 206, 250));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Qualifications");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(61, 8, 98, 22);
		panel_2_1.add(lblNewLabel_2_1_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
					.addGap(64)
					.addComponent(lblTeachersRegister, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
					.addGap(150)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addGap(83)
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addGap(84)
					.addComponent(panel_1_2, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblTeachersRegister)
							.addGap(44))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(27)
									.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
							.addGap(18)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 504, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		
		JComboBox Quali = new JComboBox();
		Quali.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Quali.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Quali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qualification=Quali.getSelectedItem().toString();
				if(qualification=="Phd" || qualification== "M.phill" || qualification== "MS" || qualification=="Msc") {
					panel_2.setVisible(true);
					panel_1.setVisible(true);
					panel_1_2.setVisible(true);
					panel_4.setVisible(true);
					img_choose.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}else if(qualification==""){
					panel_2.setVisible(false);
					panel_1.setVisible(false);
					img_choose.setVisible(false);
					panel_1_2.setVisible(false);
					panel_4.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Unable To Get Job In University...!");
					panel_2.setVisible(false);
					panel_1.setVisible(false);
					panel_1_2.setVisible(false);
					panel_4.setVisible(false);
					img_choose.setVisible(false);
					lblNewLabel_1.setVisible(false);
				}
			}
		});
		Quali.setModel(new DefaultComboBoxModel(new String[] {"", "Phd", "M.phill", "MS", "Msc", "Bsc", "BS"}));
		Quali.setToolTipText("NOTE : \r\n\t\tTeacher must have done Mphil ");
		
		Quali.setFont(new Font("Tahoma", Font.BOLD, 9));
		Quali.setBackground(Color.LIGHT_GRAY);
		Quali.setBounds(202, 8, 115, 22);
		panel_2_1.add(Quali);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
