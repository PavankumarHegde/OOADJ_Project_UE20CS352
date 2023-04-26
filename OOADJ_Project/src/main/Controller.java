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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import login.LoginPanel;
import main.View;
import main.Model;

// Controller
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void handleLogin() {
        // Get the username and password from the user input.
        String username = view.getTextField1().getText();
        String password = view.passwordField1.getText();

        // Check if the username and password are valid.
        if (model.checkLogin(username, password)) {
            // Login successful.
            System.out.println("Login successful!");
            view.frame.dispose();
        } else {
            // Login failed.
            System.out.println("Login failed!");
        }
    }

}