package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.*;

//display login screen
public class LoginPage extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    private LoginController loginController;

    public LoginPage(LoginController loginController) {
        this.loginController = loginController;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        messageLabel = new JLabel("");
        add(messageLabel);

        loginButton = new JButton("Login");
        loginButton.addActionListener(e -> handleLogin());
        add(loginButton);

        messageLabel= new JLabel("");
        add(messageLabel);

        setLocationRelativeTo(null);
    }

    private void handleLogin() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        boolean isAuthenticated = loginController.login(email, password);
        if (isAuthenticated) {
            messageLabel.setText("Login successful!");
            // Proceed to the next screen or functionality
        } else {
            messageLabel.setText("Invalid email or password.");
        }
    }
}