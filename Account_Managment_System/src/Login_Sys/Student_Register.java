package Login_Sys;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import com.toedter.calendar.JDateChooser;

//import database.CS;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Student_Register extends JFrame {

	private JPanel contentPane;
	private JTextField F_Name;
	private JTextField P_Email;
	private JTextField Phone;
	private JTextField L_Name;
	private JTextField Address;
	private Connection conn=null;
	private JTextField regid;
	private String filename=null;
	private byte[] person_img=null;
	private JPasswordField pass;
	private JLabel img_s;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Register frame = new Student_Register();
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
	public Student_Register() {
		setTitle("Student Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0 , 0, 1366, 768);
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
		
		JLabel lblNewLabel = new JLabel("STUDENT'S  REGISTER");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(135, 206, 250));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(135, 206, 250));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(83)
							.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
							.addGap(84)
							.addComponent(panel_1_2, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(64)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
							.addGap(150)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(57)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(95)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		panel_3.setLayout(null);
		
		img_s = new JLabel("");
		img_s.setBounds(0, 0, 126, 129);
		panel_3.add(img_s);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(0, 0, 126, 129);
		panel_3.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel image_s = new JLabel("");
		panel_4.add(image_s, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JButton img_choose = new JButton("Choose");
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
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Reg #");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(61, 8, 80, 22);
		panel_2.add(lblNewLabel_2_1);
		
		regid = new JTextField();
		regid.setToolTipText("Enter Short Form Of Your Department (Like Computer Science as \"CS\" )");
		regid.setColumns(10);
		regid.setBounds(202, 8, 115, 22);
		panel_2.add(regid);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_2_4 = new JLabel("Last name");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_4.setBounds(61, 65, 80, 22);
		panel_1_2.add(lblNewLabel_2_4);
		
		L_Name = new JTextField();
		L_Name.setColumns(10);
		L_Name.setBounds(202, 65, 115, 22);
		panel_1_2.add(L_Name);
		
		JLabel lblNewLabel_2_5 = new JLabel("Gender");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_5.setBounds(61, 153, 80, 22);
		panel_1_2.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Address");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6.setBounds(61, 239, 80, 22);
		panel_1_2.add(lblNewLabel_2_6);
		
		Address = new JTextField();
		Address.setColumns(10);
		Address.setBounds(202, 239, 115, 22);
		panel_1_2.add(Address);
		
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
		
		JComboBox Dep = new JComboBox();
		Dep.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Dep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Dep.setBounds(202, 413, 115, 22);
		panel_1.add(Dep);
		Dep.setBackground(Color.LIGHT_GRAY);
		Dep.setFont(new Font("Tahoma", Font.BOLD, 9));
		Dep.setModel(new DefaultComboBoxModel(new String[] {"", "Computer Science (C.S)", "Software Engineering (S.E)", "Information Technology (I.T)", "Business (B.B.A.)", "L.A.W.", "International Relationship (I.R.)", "Maths", "Psychology", "Aviation"}));
		
		JComboBox Deg = new JComboBox();
		Deg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Deg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Deg.setBackground(Color.LIGHT_GRAY);
		Deg.setFont(new Font("Tahoma", Font.BOLD, 9));
		Deg.setModel(new DefaultComboBoxModel(new String[] {"", "Bachelor's", "Master's", "ADP", "Msc", "Phd"}));
		Deg.setBounds(202, 326, 115, 22);
		panel_1.add(Deg);
		panel_1_1.setLayout(null);
		
		
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
		
		JRadioButton otherB = new JRadioButton("Other");
		otherB.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				otherB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		otherB.setBackground(new Color(135, 206, 250));
		otherB.setFont(new Font("Tahoma", Font.BOLD, 11));
		otherB.setBounds(309, 152, 59, 22);
		panel_1_2.add(otherB);
		panel_1.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleB);
		group.add(femaleB);
		group.add(otherB);
		
		JButton Reg = new JButton("Register");
		Reg.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Reg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		Reg.setBounds(279, 465, 89, 28);
		panel_1_2.add(Reg);
		Reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CS cs =new CS();
				SE se =new SE();
				IT it =new IT();
				BBA bba =new BBA();
				LAW law =new LAW();
				IR ir =new IR();
				Maths mth =new Maths();
				Psychology psycho = new Psychology();
				Aviation avtion =new Aviation();
				//String Name="";
				String first= F_Name.getText();
				String last= L_Name.getText();
				String email= P_Email.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
				String date=sdf.format(BirthDate.getDate());
				String address= Address.getText();
				String phone= Phone.getText();
				
				String Gender;
				if(maleB.isSelected()) {
					Gender="Male";
				}else if(femaleB.isSelected()){
					Gender="Female";
				}else {
					Gender="Other";
				}
				String department= Dep.getSelectedItem().toString();
				String degree=Deg.getSelectedItem().toString();
				String reg= regid.getText();
				String p_word = pass.getText();
				
				String sql = "INSERT INTO `students`(`FIRSTName`, `Address`, `EmailAddress`, `LASTName`, `Phone_No`, `Birth_Date`, `Gender`,`Registeration_Id`,`file_N`,`images`,`PASSWORD`,`Deg_name`, `D_Name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
				try {
					PreparedStatement preparedStatement =conn.prepareStatement(sql);
					if(!first.isEmpty()){	
						preparedStatement.setString(1, first);
					}
					if(!address.isEmpty()){
						preparedStatement.setString(2, address);
					}
					if(!email.isEmpty() && email.endsWith("@gmail.com")){
						preparedStatement.setString(3, email);
					}
					if(!last.isEmpty()){
						preparedStatement.setString(4, last);
					}
					if(!phone.isEmpty()){
						preparedStatement.setString(5, phone);
					}
					if(!date.isEmpty()){
						preparedStatement.setString(6, date);
					}
					
					preparedStatement.setString(7, Gender);
					
					
					preparedStatement.setString(8, reg);
					preparedStatement.setString(9,filename);
					preparedStatement.setBytes(10, person_img);
					preparedStatement.setString(11,p_word);
					preparedStatement.setString(12,degree);
					preparedStatement.setString(13,department);
						//String Gendr = gender.getText();
					
					
					
					
					int rows = preparedStatement.executeUpdate();
					
				
					if(rows>0){
						//JOptionPane.showMessageDialog(null, "Register Successfully..!");
						if(department.equals("Computer Science (C.S)")) {
							if(degree.equals("Bachelor's")) {
								cs.ComputerScience(1,email,reg);
								
							}else if(degree.equals("Master's")) {
								cs.ComputerScience(2,email,reg);
							}else if(degree.equals("ADP")) {
								cs.ComputerScience(3,email,reg);
							}else if(degree.equals("Msc")) {
								cs.ComputerScience(4,email,reg);
							}else if(degree.equals("Phd")){
								cs.ComputerScience(5,email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
							
						}
						else if(department.equals("Software Engineering (S.E)")){
							if(degree.equals("Bachelor's")) {
								se.SoftwareEngineering(1, email,reg);
								
							}else if(degree.equals("Master's")) {
								se.SoftwareEngineering(2, email,reg);
							}else if(degree.equals("ADP")) {
								se.SoftwareEngineering(3, email,reg);
							}else if(degree.equals("Msc")) {
								se.SoftwareEngineering(4, email,reg);
							}else if(degree.equals("Phd")){
								se.SoftwareEngineering(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}
						else if(department.equals("Information Technology (I.T)")){
							if(degree.equals("Bachelor's")) {
								it.InformationTechnology(1, email,reg);
								
							}else if(degree.equals("Master's")) {
								it.InformationTechnology(2, email,reg);
							}else if(degree.equals("ADP")) {
								it.InformationTechnology(3, email,reg);
							}else if(degree.equals("Msc")) {
								it.InformationTechnology(4, email,reg);
							}else if(degree.equals("Phd")){
								it.InformationTechnology(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("Business (B.B.A.)")){
							if(degree.equals("Bachelor's")) {
								bba.Business(1, email,reg);
							}else if(degree.equals("Master's")) {
								bba.Business(2, email,reg);
							}else if(degree.equals("ADP")) {
								bba.Business(3, email,reg);
							}else if(degree.equals("Msc")) {
								bba.Business(4, email,reg);
							}else if(degree.equals("Phd")){
								bba.Business(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("L.A.W.")){
							if(degree.equals("Bachelor's")) {
								law.Law(1, email,reg);
							}else if(degree.equals("Master's")) {
								law.Law(2, email,reg);
							}else if(degree.equals("ADP")) {
								law.Law(3, email,reg);
							}else if(degree.equals("Msc")) {
								law.Law(4, email,reg);
							}else if(degree.equals("Phd")){
								law.Law(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("International Relationship (I.R.)")){
							if(degree.equals("Bachelor's")) {
								ir.InternationalRelationship(1, email,reg);
							}else if(degree.equals("Master's")) {
								ir.InternationalRelationship(2, email,reg);
							}else if(degree.equals("ADP")) {
								ir.InternationalRelationship(3, email,reg);
							}else if(degree.equals("Msc")) {
								ir.InternationalRelationship(4, email,reg);
							}else if(degree.equals("Phd")){
								ir.InternationalRelationship(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("Maths")){
							if(degree.equals("Bachelor's")) {
								mth.Math(1, email,reg);
							}else if(degree.equals("Master's")) {
								mth.Math(2, email,reg);
							}else if(degree.equals("ADP")) {
								mth.Math(3, email,reg);
							}else if(degree.equals("Msc")) {
								mth.Math(4, email,reg);
							}else if(degree.equals("Phd")){
								mth.Math(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("Psychology")){
							if(degree.equals("Bachelor's")) {
								psycho.psychology(1, email,reg);
							}else if(degree.equals("Master's")) {
								psycho.psychology(2, email,reg);
							}else if(degree.equals("ADP")) {
								psycho.psychology(3, email,reg);
							}else if(degree.equals("Msc")) {
								psycho.psychology(4, email,reg);
							}else if(degree.equals("Phd")){
								psycho.psychology(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}else if(department.equals("Aviation")){
							if(degree.equals("Bachelor's")) {
								avtion.aviation(1, email,reg);
							}else if(degree.equals("Master's")) {
								avtion.aviation(2, email,reg);
							}else if(degree.equals("ADP")) {
								avtion.aviation(3, email,reg);
							}else if(degree.equals("Msc")) {
								avtion.aviation(4, email,reg);
							}else if(degree.equals("Phd")){
								avtion.aviation(5, email,reg);
							}else {
								//JOptionPane.showMessageDialog(null, e);
							}
						}
						JOptionPane.showMessageDialog(null, "Successfully Recoded Data...!!!");
						Student_Login login =new Student_Login();
						login.setVisible(true);
						setVisible(false);
					}
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1);
				}
				
				

			}
		});
		Reg.setFont(new Font("Tahoma", Font.BOLD, 11));
		Reg.setForeground(Color.BLACK);
		Reg.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_2_6_2 = new JLabel("Password");
		lblNewLabel_2_6_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_6_2.setBounds(61, 413, 80, 22);
		panel_1_2.add(lblNewLabel_2_6_2);
		
		pass = new JPasswordField();
		pass.setBounds(202, 413, 115, 22);
		panel_1_2.add(pass);
		
		JLabel lblNewLabel_2 = new JLabel("First name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(61, 65, 80, 22);
		panel_1.add(lblNewLabel_2);
		
		F_Name = new JTextField();
		F_Name.setBounds(202, 65, 115, 22);
		panel_1.add(F_Name);
		F_Name.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Personal Email");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(61, 152, 99, 22);
		panel_1.add(lblNewLabel_2_2);
		
		P_Email = new JTextField();
		P_Email.setColumns(10);
		P_Email.setBounds(202, 152, 115, 22);
		panel_1.add(P_Email);
		
		JLabel lblNewLabel_2_3 = new JLabel("Phone #");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(61, 239, 80, 22);
		panel_1.add(lblNewLabel_2_3);
		
		Phone = new JTextField();
		Phone.setColumns(10);
		Phone.setBounds(202, 239, 115, 22);
		panel_1.add(Phone);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Degree");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_1.setBounds(61, 326, 80, 22);
		panel_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Department");
		lblNewLabel_2_3_1_1.setBounds(61, 413, 90, 22);
		panel_1.add(lblNewLabel_2_3_1_1);
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 92, 327, 319);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/13_1.png"));
		lblNewLabel_1.setIcon(icon);
		panel_1_1.add(lblNewLabel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
