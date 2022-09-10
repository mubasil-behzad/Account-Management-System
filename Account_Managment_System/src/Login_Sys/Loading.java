package Login_Sys;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Color;
import javax.swing.JProgressBar;

public class Loading extends JFrame {

	private JPanel contentPane;
	public  JProgressBar progressBar;
	public JLabel lblNewLabel_1;
	private static Loading frame;
	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		
					int x;
					frame = new Loading();
					frame.setVisible(true);
					
					try {
						for(x=0;x<=100;x++) {
							frame.progressBar.setValue(x);
							Thread.sleep(50);
							frame.lblNewLabel_1.setText(Integer.toString(x)+" %");
							if(x==100) {
								frame.dispose();
							}
						}
					} catch (Exception e) {
					// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e);
					}
					
		
	}
	

	/**
	 * Create the frame.
	 */
	public Loading() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 453);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 29, 48));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/firefly2.gif"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setIcon(icon);
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(48, 97, 500, 259);
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(new Color(32, 178, 170));
		progressBar.setBounds(24, 391, 549, 20);
		contentPane.add(progressBar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(135, 206, 250));
		lblNewLabel_1.setBounds(267, 367, 62, 20);
		contentPane.add(lblNewLabel_1);
		
	}
}
