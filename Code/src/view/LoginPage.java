package view;

import controller.LoginController;
import controller.RegisterController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// Displays the login screen
public class LoginPage extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;

    private JButton loginButton;
    private JButton createAccountButton;

    private JLabel messageLabel;
    private JCheckBox showPasswordBox;

    private LoginController loginController;
    private RegisterController registerController;

    public LoginPage(
            LoginController loginController,
            RegisterController registerController
    ) {

        this.loginController = loginController;
        this.registerController = registerController;

        initializeUI();
    }

    private void initializeUI() {

        // ---------------- WINDOW ----------------

        setTitle("Health and Fitness Tracker");
        setSize(500, 590);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // ---------------- BACKGROUND ----------------

        JPanel backgroundPanel =
                new JPanel(new GridBagLayout());

        backgroundPanel.setBackground(
                new Color(11, 31, 58)
        );

        // ---------------- LOGIN CARD ----------------

        JPanel loginCard =
                new JPanel();

        loginCard.setPreferredSize(
                new Dimension(390, 465)
        );

        loginCard.setBackground(
                new Color(235, 235, 235)
        );

        loginCard.setBorder(
                new EmptyBorder(30, 35, 30, 35)
        );

        loginCard.setLayout(
                new BoxLayout(
                        loginCard,
                        BoxLayout.Y_AXIS
                )
        );

        // ---------------- TITLE ----------------

        JLabel titleLabel =
                new JLabel(
                        "Health and Fitness Tracker"
                );

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        23
                )
        );

        titleLabel.setForeground(
                new Color(11, 31, 58)
        );

        titleLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ---------------- WELCOME ----------------

        JLabel welcomeLabel =
                new JLabel("Welcome Back");

        welcomeLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        17
                )
        );

        welcomeLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ---------------- FORM ----------------

        JPanel formPanel =
                new JPanel(
                        new GridBagLayout()
                );

        formPanel.setBackground(
                new Color(235, 235, 235)
        );

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weightx = 1.0;

        gbc.fill =
                GridBagConstraints.HORIZONTAL;

        gbc.anchor =
                GridBagConstraints.WEST;

        // ---------------- EMAIL ----------------

        JLabel emailLabel =
                new JLabel("Email");

        emailLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        gbc.insets =
                new Insets(0, 0, 6, 0);

        formPanel.add(
                emailLabel,
                gbc
        );

        gbc.gridy++;

        emailField =
                new JTextField();

        emailField.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        emailField.setPreferredSize(
                new Dimension(
                        300,
                        40
                )
        );

        emailField.setBorder(
                BorderFactory.createLineBorder(
                        Color.BLACK,
                        1
                )
        );

        gbc.insets =
                new Insets(0, 0, 0, 0);

        formPanel.add(
                emailField,
                gbc
        );

        // ---------------- PASSWORD ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(20, 0, 6, 0);

        JLabel passwordLabel =
                new JLabel("Password");

        passwordLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                passwordLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        passwordField =
                new JPasswordField();

        passwordField.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        passwordField.setPreferredSize(
                new Dimension(
                        300,
                        40
                )
        );

        passwordField.setBorder(
                BorderFactory.createLineBorder(
                        Color.BLACK,
                        1
                )
        );

        formPanel.add(
                passwordField,
                gbc
        );

        // ---------------- SHOW PASSWORD ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(8, 0, 0, 0);

        showPasswordBox =
                new JCheckBox(
                        "Show password"
                );

        showPasswordBox.setBackground(
                new Color(235, 235, 235)
        );

        showPasswordBox.addActionListener(
                e -> togglePasswordVisibility()
        );

        formPanel.add(
                showPasswordBox,
                gbc
        );

        // ---------------- LOGIN BUTTON ----------------

        loginButton =
                new JButton("LOG IN");

        loginButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        loginButton.setForeground(
                Color.WHITE
        );

        loginButton.setBackground(
                new Color(11, 31, 58)
        );

        loginButton.setOpaque(true);
        loginButton.setContentAreaFilled(true);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);

        loginButton.setPreferredSize(
                new Dimension(
                        300,
                        42
                )
        );

        loginButton.setMaximumSize(
                new Dimension(
                        300,
                        42
                )
        );

        loginButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        loginButton.addActionListener(
                e -> handleLogin()
        );

        // Press Enter to login
        getRootPane().setDefaultButton(
                loginButton
        );

        // ---------------- CREATE ACCOUNT BUTTON ----------------

        createAccountButton =
                new JButton(
                        "CREATE ACCOUNT"
                );

        createAccountButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        createAccountButton.setForeground(
                new Color(11, 31, 58)
        );

        createAccountButton.setBackground(
                Color.WHITE
        );

        createAccountButton.setOpaque(true);
        createAccountButton.setContentAreaFilled(true);

        createAccountButton.setBorder(
                BorderFactory.createLineBorder(
                        new Color(11, 31, 58),
                        1
                )
        );

        createAccountButton.setFocusPainted(
                false
        );

        createAccountButton.setPreferredSize(
                new Dimension(
                        300,
                        42
                )
        );

        createAccountButton.setMaximumSize(
                new Dimension(
                        300,
                        42
                )
        );

        createAccountButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        createAccountButton.addActionListener(
                e -> openRegisterPage()
        );

        // ---------------- MESSAGE ----------------

        messageLabel =
                new JLabel(" ");

        messageLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        messageLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ---------------- ADD COMPONENTS ----------------

        loginCard.add(
                titleLabel
        );

        loginCard.add(
                Box.createVerticalStrut(8)
        );

        loginCard.add(
                welcomeLabel
        );

        loginCard.add(
                Box.createVerticalStrut(30)
        );

        loginCard.add(
                formPanel
        );

        loginCard.add(
                Box.createVerticalStrut(22)
        );

        loginCard.add(
                loginButton
        );

        loginCard.add(
                Box.createVerticalStrut(10)
        );

        loginCard.add(
                createAccountButton
        );

        loginCard.add(
                Box.createVerticalStrut(12)
        );

        loginCard.add(
                messageLabel
        );

        backgroundPanel.add(
                loginCard
        );

        add(
                backgroundPanel
        );
    }

    // ---------------- SHOW PASSWORD ----------------

    private void togglePasswordVisibility() {

        if (showPasswordBox.isSelected()) {

            passwordField.setEchoChar(
                    (char) 0
            );

        } else {

            passwordField.setEchoChar(
                    '•'
            );
        }
    }

    // ---------------- LOGIN ----------------

    private void handleLogin() {

        String email =
                emailField
                        .getText()
                        .trim();

        String password =
                new String(
                        passwordField
                                .getPassword()
                );

        if (
                email.isEmpty()
                        ||
                password.isEmpty()
        ) {

            showError(
                    "Please enter your email and password."
            );

            return;
        }

        boolean isAuthenticated =
                loginController.login(
                        email,
                        password
                );

        if (isAuthenticated) {

            messageLabel.setForeground(
                    new Color(
                            30,
                            130,
                            70
                    )
            );

            messageLabel.setText(
                    "Login successful!"
            );

            /*
             * Later:
             *
             * DashboardPage dashboard =
             *         new DashboardPage();
             *
             * dashboard.setVisible(true);
             *
             * dispose();
             */

        } else {

            showError(
                    "Invalid email or password."
            );
        }
    }

    // ---------------- OPEN REGISTER ----------------

    private void openRegisterPage() {

        RegisterPage registerPage =
                new RegisterPage(
                        registerController
                );

        registerPage.setVisible(true);
    }

    // ---------------- ERROR MESSAGE ----------------

    private void showError(
            String message
    ) {

        messageLabel.setForeground(
                new Color(
                        180,
                        40,
                        40
                )
        );

        messageLabel.setText(
                message
        );
    }
}