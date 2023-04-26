package user;
import user.UserLogin;
import user.UserLoginModel;
import user.UserLoginView;

import javax.swing.*;

public class UserLoginController {

    private UserLoginModel model;
    private UserLoginView view;

    public UserLoginController(UserLoginModel model, UserLoginView view) {
        this.model = model;
        this.view = view;

        // Add a listener to the login button.
        view.loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the username and password from the view.
        String username = view.getUsername();
        String password = view.getPassword();

        // Validate the username and password.
        boolean validUsername = model.validateUsername(username);
        boolean validPassword = model.validatePassword(password);

        // If the username and password are valid, log the user in.
        if (validUsername && validPassword) {
            model.login(username, password);
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(view, "Invalid username or password.");
        }
    }

}