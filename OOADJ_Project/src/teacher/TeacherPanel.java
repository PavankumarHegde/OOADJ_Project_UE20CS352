package teacher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import login.LoginPanel;
import main.MainFrame;

import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class TeacherPanel extends JPanel implements FocusListener{
	private JTextField txtUsername;

	static String password="teacher";
	public TeacherPanel() {
		setLayout(null);
		setBackground(Color.CYAN);		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(Color.LIGHT_GRAY);
		pwdPassword.setEchoChar('*');
		pwdPassword.setFont(new Font("Century Gothic", Font.BOLD, 18));
		pwdPassword.setText("Password");
		pwdPassword.setBounds(388, 191, 215, 36);
		add(pwdPassword);
		pwdPassword.addFocusListener(this);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtUsername.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txtUsername.setText("USERNAME");
		txtUsername.setBounds(388, 137, 215, 36);
		add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.addFocusListener(this);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(txtUsername.getText().equals("teacher") && pwdPassword.getText().equals(password))
				{
					//goto Main Admin Panel
					MainFrame.AddPanel(new MainTeacher());
				}
				else
				{
					//Show error popup message
					JOptionPane.showMessageDialog(null, "Only for Teacher");
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogin.setBackground(Color.GREEN);
		btnLogin.setBounds(415, 246, 160, 56);
		add(btnLogin);
		
	
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new LoginPanel());
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 511, 89, 36);
		add(btnNewButton);
		
		JLabel lblOnlineExamination = new JLabel("TEACHER LOGIN");
		lblOnlineExamination.setForeground(Color.BLACK);
		lblOnlineExamination.setBackground(new Color(102, 255, 255));
		lblOnlineExamination.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlineExamination.setFont(new Font("Times New Roman", Font.BOLD, 31));
		lblOnlineExamination.setBounds(327, 57, 338, 44);
		add(lblOnlineExamination);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(135, 206, 235), 4));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("..\\images\\PIC31.PNG"));
		lblNewLabel.setBounds(0, 0, 990, 558);
		add(lblNewLabel);
	}

	private JPasswordField pwdPassword;
	
	public void focusGained(FocusEvent arg0) {
		if(arg0.getSource()==pwdPassword && pwdPassword.getForeground()==Color.LIGHT_GRAY)
		{
			pwdPassword.setText("");
			pwdPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			pwdPassword.setForeground(Color.black);
		}
		if(arg0.getSource()==txtUsername && txtUsername.getForeground()==Color.LIGHT_GRAY)
		{
			txtUsername.setText("");
			txtUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
			txtUsername.setForeground(Color.black);
		}
		
	}

	@SuppressWarnings("deprecation")
	public void focusLost(FocusEvent arg0) {
		if(pwdPassword.getText().equals(""))
		{
			pwdPassword.setFont(new Font("Century Gothic", Font.BOLD, 20));
			pwdPassword.setText("Password");
			pwdPassword.setForeground(Color.LIGHT_GRAY);
		}
		if(txtUsername.getText().equals(""))
		{
			txtUsername.setFont(new Font("Century Gothic", Font.BOLD, 20));
			txtUsername.setText("USERNAME");
			txtUsername.setForeground(Color.LIGHT_GRAY);
		}
	}
}
