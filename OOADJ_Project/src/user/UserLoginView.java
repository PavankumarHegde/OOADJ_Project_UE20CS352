package user;
import javax.swing.*;

public class UserLoginView extends JFrame {

    private JTextField usernameTextField;
    private JPasswordField passwordField;
    JButton loginButton;

    public UserLoginView() {
        super("User Login");

        // Create the username and password text fields.
        usernameTextField = new JTextField();
        passwordField = new JPasswordField();

        // Create the login button.
        loginButton = new JButton("Login");

        // Add the text fields and button to the frame.
        add(usernameTextField);
        add(passwordField);
        add(loginButton);

        // Set the frame's layout to a FlowLayout.
        setLayout(new FlowLayout());

        // Set the frame's size.
        setSize(400, 300);

        // Set the frame's default close operation to exit the application.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame.
        setVisible(true);
    }

    public String getUsername() {
        return usernameTextField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public void handleLoginButtonClick() {
        // TODO: Implement this method.
    }

}