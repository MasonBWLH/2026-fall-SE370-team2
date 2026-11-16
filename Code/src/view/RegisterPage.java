package view;

import controller.RegisterController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// Displays the create account screen
public class RegisterPage extends JFrame {

    private JTextField nameField;
    private JTextField emailField;

    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    private JCheckBox showPasswordBox;

    private JButton createAccountButton;
    private JButton backButton;

    private JLabel messageLabel;

    private RegisterController registerController;

    public RegisterPage(RegisterController registerController) {

        this.registerController = registerController;

        initializeUI();
    }

    private void initializeUI() {

        // ---------------- WINDOW ----------------

        setTitle("Health and Fitness Tracker - Create Account");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // ---------------- BACKGROUND ----------------

        JPanel backgroundPanel =
                new JPanel(new GridBagLayout());

        backgroundPanel.setBackground(
                new Color(11, 31, 58)
        );

        // ---------------- REGISTER CARD ----------------

        JPanel registerCard =
                new JPanel();

        registerCard.setPreferredSize(
                new Dimension(390, 535)
        );

        registerCard.setBackground(
                new Color(235, 235, 235)
        );

        registerCard.setBorder(
                new EmptyBorder(30, 35, 30, 35)
        );

        registerCard.setLayout(
                new BoxLayout(
                        registerCard,
                        BoxLayout.Y_AXIS
                )
        );

        // ---------------- TITLE ----------------

        JLabel titleLabel =
                new JLabel("Create Account");

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        titleLabel.setForeground(
                new Color(11, 31, 58)
        );

        titleLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ---------------- SUBTITLE ----------------

        JLabel subtitleLabel =
                new JLabel("Health and Fitness Tracker");

        subtitleLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        15
                )
        );

        subtitleLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        // ---------------- FORM PANEL ----------------

        JPanel formPanel =
                new JPanel(new GridBagLayout());

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

        // ---------------- NAME ----------------

        JLabel nameLabel =
                new JLabel("Name");

        nameLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        gbc.insets =
                new Insets(0, 0, 6, 0);

        formPanel.add(
                nameLabel,
                gbc
        );

        gbc.gridy++;

        nameField =
                createTextField();

        gbc.insets =
                new Insets(0, 0, 0, 0);

        formPanel.add(
                nameField,
                gbc
        );

        // ---------------- EMAIL ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(16, 0, 6, 0);

        JLabel emailLabel =
                new JLabel("Email");

        emailLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                emailLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        emailField =
                createTextField();

        formPanel.add(
                emailField,
                gbc
        );

        // ---------------- PASSWORD ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(16, 0, 6, 0);

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
                createPasswordField();

        formPanel.add(
                passwordField,
                gbc
        );

        // ---------------- CONFIRM PASSWORD ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(16, 0, 6, 0);

        JLabel confirmPasswordLabel =
                new JLabel("Confirm Password");

        confirmPasswordLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                confirmPasswordLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        confirmPasswordField =
                createPasswordField();

        formPanel.add(
                confirmPasswordField,
                gbc
        );

        // ---------------- SHOW PASSWORD ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(8, 0, 0, 0);

        showPasswordBox =
                new JCheckBox("Show passwords");

        showPasswordBox.setBackground(
                new Color(235, 235, 235)
        );

        showPasswordBox.addActionListener(
                e -> togglePasswords()
        );

        formPanel.add(
                showPasswordBox,
                gbc
        );

        // ---------------- CREATE ACCOUNT BUTTON ----------------

        createAccountButton =
                new JButton("CREATE ACCOUNT");

        createAccountButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        createAccountButton.setForeground(
                Color.WHITE
        );

        createAccountButton.setBackground(
                new Color(11, 31, 58)
        );

        createAccountButton.setOpaque(true);
        createAccountButton.setContentAreaFilled(true);
        createAccountButton.setBorderPainted(false);
        createAccountButton.setFocusPainted(false);

        createAccountButton.setPreferredSize(
                new Dimension(300, 42)
        );

        createAccountButton.setMaximumSize(
                new Dimension(300, 42)
        );

        createAccountButton.setMinimumSize(
                new Dimension(300, 42)
        );

        createAccountButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        createAccountButton.addActionListener(
                e -> handleRegistration()
        );

        // ---------------- BACK BUTTON ----------------

        backButton =
                new JButton("BACK TO LOGIN");

        backButton.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        13
                )
        );

        backButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        backButton.addActionListener(
                e -> dispose()
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

        registerCard.add(
                titleLabel
        );

        registerCard.add(
                Box.createVerticalStrut(7)
        );

        registerCard.add(
                subtitleLabel
        );

        registerCard.add(
                Box.createVerticalStrut(25)
        );

        registerCard.add(
                formPanel
        );

        registerCard.add(
                Box.createVerticalStrut(22)
        );

        registerCard.add(
                createAccountButton
        );

        registerCard.add(
                Box.createVerticalStrut(10)
        );

        registerCard.add(
                backButton
        );

        registerCard.add(
                Box.createVerticalStrut(10)
        );

        registerCard.add(
                messageLabel
        );

        backgroundPanel.add(
                registerCard
        );

        add(
                backgroundPanel
        );
    }

    // Creates matching text fields
    private JTextField createTextField() {

        JTextField field =
                new JTextField();

        field.setPreferredSize(
                new Dimension(
                        300,
                        40
                )
        );

        field.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        field.setBorder(
                BorderFactory.createLineBorder(
                        Color.BLACK,
                        1
                )
        );

        return field;
    }

    // Creates matching password fields
    private JPasswordField createPasswordField() {

        JPasswordField field =
                new JPasswordField();

        field.setPreferredSize(
                new Dimension(
                        300,
                        40
                )
        );

        field.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        field.setBorder(
                BorderFactory.createLineBorder(
                        Color.BLACK,
                        1
                )
        );

        return field;
    }

    // Shows or hides both password fields
    private void togglePasswords() {

        if (showPasswordBox.isSelected()) {

            passwordField.setEchoChar(
                    (char) 0
            );

            confirmPasswordField.setEchoChar(
                    (char) 0
            );

        } else {

            passwordField.setEchoChar('•');

            confirmPasswordField.setEchoChar('•');
        }
    }

    // Validates and creates the account
    private void handleRegistration() {

        String name =
                nameField
                        .getText()
                        .trim();

        String email =
                emailField
                        .getText()
                        .trim();

        String password =
                new String(
                        passwordField.getPassword()
                );

        String confirmPassword =
                new String(
                        confirmPasswordField.getPassword()
                );

        // Empty fields
        if (
                name.isEmpty()
                        ||
                email.isEmpty()
                        ||
                password.isEmpty()
                        ||
                confirmPassword.isEmpty()
        ) {

            showError(
                    "Please complete all fields."
            );

            return;
        }

        // Basic email check
        if (
                !email.contains("@")
                        ||
                !email.contains(".")
        ) {

            showError(
                    "Please enter a valid email address."
            );

            return;
        }

        // Password length
        if (password.length() < 6) {

            showError(
                    "Password must be at least 6 characters."
            );

            return;
        }

        // Confirm passwords match
        if (
                !password.equals(
                        confirmPassword
                )
        ) {

            showError(
                    "Passwords do not match."
            );

            return;
        }

        // Send information to controller
        boolean accountCreated =
                registerController.register(
                        name,
                        email,
                        password
                );

        if (accountCreated) {

            messageLabel.setForeground(
                    new Color(
                            30,
                            130,
                            70
                    )
            );

            messageLabel.setText(
                    "Account created successfully!"
            );

            // Clear fields after successful registration
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");

        } else {

            showError(
                    "An account with this email already exists."
            );
        }
    }

    // Displays errors
    private void showError(String message) {

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