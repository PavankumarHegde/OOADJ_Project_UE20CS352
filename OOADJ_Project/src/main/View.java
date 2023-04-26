package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Rectangle;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import login.LoginPanel;

// View
public class View {

    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    JPasswordField passwordField1;
    private JButton button1;
    private Controller controller;

    public View() {
        frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Username:");
        label2 = new JLabel("Password:");
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton("Login");

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(passwordField1);
        frame.add(button1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the login button click.
                controller.handleLogin();
            }
        });
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public JTextField getTextField1() {
        return textField1;
    }

}