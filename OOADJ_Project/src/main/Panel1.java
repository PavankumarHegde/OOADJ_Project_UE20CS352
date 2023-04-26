package main;
// MVC Pattern
// View

import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import login.LoginPanel;

public class Panel1 extends JPanel {

	public Panel1() {
		setLayout(null);
		setBackground(Color.PINK);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFocusable(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new LoginPanel());
			}
		});
		//btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNext.setBackground(Color.GREEN);
		btnNext.setBounds(892, 511, 89, 36);
		add(btnNext);
		
		JButton btnNewButton = new JButton("HELP");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.AddPanel(new Help());
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 511, 89, 36);
		add(btnNewButton);

		JLabel label12 = new JLabel();

//add image background
ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.png"));
Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
ImageIcon i3 = new ImageIcon(i2);
label12 = new JLabel(i3);

label12.setBounds(410, 10, 240, 180);
add(label12);
		//add(image);
        // Set the icon property of the JLabel component to an ImageIcon object that contains the image you want to display.
        //ImageIcon icon = new ImageIcon("logo.png");
		//icon.setDescription("hello");
        //label12.setIcon(icon);
		//label12.setText("Hello");
		//label12.setBackground(Color.DARK_GRAY);
		//label12.setHorizontalAlignment(SwingConstants.CENTER);
		//label12.setBounds(198, 30, 603, 105);
		
		
		JLabel lblOnlineExamination = new JLabel("PES University");
		//lblOnlineExamination.setForeground(new Color(240, 255, 240));
		lblOnlineExamination.setBackground(Color.DARK_GRAY);
		lblOnlineExamination.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlineExamination.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblOnlineExamination.setBounds(198, 130, 603, 105);
		add(lblOnlineExamination);
		
		JLabel lblSystem = new JLabel("Object Oriented Analysis And Design");
		//lblSystem.setForeground(new Color(240, 255, 240));
		lblSystem.setBackground(Color.BLACK);
		lblSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystem.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSystem.setBounds(198, 270, 620, 105);
		add(lblSystem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\images\\logo.png"));
		//lblNewLabel.setBorder(new LineBorder(new Color(255, 0, 0), 4));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 990, 558);
		add(lblNewLabel);
	}
}
