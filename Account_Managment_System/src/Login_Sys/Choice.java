package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Choice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choice frame = new Choice();
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
	public Choice() {
		setResizable(false);
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 616, 468);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 580, 407);
		panel.setBackground(SystemColor.controlShadow);
		
		JButton btnSalary = new JButton("SALARY");
		btnSalary.setBounds(67, 367, 165, 33);
		btnSalary.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnSalary.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnSalary.setForeground(Color.BLACK);
		btnSalary.setBackground(Color.LIGHT_GRAY);
		btnSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Teacher_Login login_1 = new Teacher_Login();
				login_1.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnSalary_1 = new JButton("FEES");
		btnSalary_1.setBounds(352, 367, 165, 33);
		btnSalary_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnSalary_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		btnSalary_1.setForeground(Color.BLACK);
		btnSalary_1.setBackground(Color.LIGHT_GRAY);
		btnSalary_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student_Login login = new Student_Login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnSalary_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("CHOOSE ONE");
		lblNewLabel.setBounds(180, 110, 216, 45);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(120, 173, 340, 176);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("ACCOUNT  MANAGEMENT  SYSTEM");
		lblNewLabel_2.setBounds(46, 33, 489, 44);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Impact", Font.BOLD, 35));
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/choice_1.png"));
		contentPane.setLayout(null);
		lblNewLabel_1.setIcon(icon);
		contentPane.add(panel);
		panel.setLayout(null);
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/left_arrow.png"));
		panel.add(lblNewLabel);
		panel.add(lblNewLabel_1);
		panel.add(btnSalary);
		panel.add(btnSalary_1);
		panel.add(lblNewLabel_2);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/right_arrow.png"));
		
	}
}
