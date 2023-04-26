package login;


//Observer Pattern

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import admin.AdminPanel;
import teacher.TeacherPanel;
import user.UserLogin;
import main.MainFrame;
import main.Panel1;

public class LoginPanel extends JPanel {
	private JButton btnUser;
	
	public LoginPanel() {
		
		setLayout(null);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new Panel1());
			}
		});
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setFocusable(false);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new AdminPanel());
			}
		});
		btnAdmin.setForeground(new Color(75, 0, 130));
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnAdmin.setBounds(256, 222, 478, 99);
		add(btnAdmin);


		JButton btnTeacher = new JButton("TEACHER");
		btnTeacher.setFocusable(false);
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new TeacherPanel());
			}
		});
		btnTeacher.setForeground(new Color(75, 0, 130));
		btnTeacher.setBackground(Color.GREEN);
		btnTeacher.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnTeacher.setBounds(256, 332, 478, 99);
		add(btnTeacher);
		
		btnUser = new JButton("STUDENT");
		btnUser.setFocusable(false);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new UserLogin());
			}
		});
		//btnUser.setForeground(new Color(75, 0, 130));
		btnUser.setBackground(Color.ORANGE);
		btnUser.setFont(new Font("Times New Roman", Font.BOLD, 30));
		btnUser.setBounds(256, 112, 478, 99);
		add(btnUser);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(new Color(135, 206, 235));
		//btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton.setBounds(10, 511, 89, 36);
		add(btnNewButton);
		
		JLabel lblOnlineExamination = new JLabel("LOGIN");
		lblOnlineExamination.setForeground(new Color(0, 0, 0));
		lblOnlineExamination.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlineExamination.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblOnlineExamination.setBounds(388, 26, 214, 105);
		add(lblOnlineExamination);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\images\\PIC33.PNG"));
		lblNewLabel.setBorder(new LineBorder(new Color(64, 224, 208), 4));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(0, 0, 990, 558);
		add(lblNewLabel);

	}

}
