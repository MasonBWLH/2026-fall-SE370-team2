package view;

import model.UserProfile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// Allows the user to enter their profile information
public class UserProfileForm extends JFrame {

    private JTextField ageField;
    private JTextField heightField;
    private JTextField weightField;

    private JComboBox<String> activityLevelBox;

    private JButton saveButton;
    private JLabel messageLabel;

    private int userId;

    // Receives the ID of the currently logged-in user
    public UserProfileForm(int userId) {

        this.userId = userId;

        initializeUI();
    }

    private void initializeUI() {

        // ---------------- WINDOW SETTINGS ----------------

        setTitle("Health and Fitness Tracker - User Profile");
        setSize(500, 620);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // ---------------- BACKGROUND ----------------

        JPanel backgroundPanel =
                new JPanel(new GridBagLayout());

        backgroundPanel.setBackground(
                new Color(11, 31, 58)
        );

        // ---------------- PROFILE CARD ----------------

        JPanel profileCard = new JPanel();

        profileCard.setPreferredSize(
                new Dimension(390, 500)
        );

        profileCard.setBackground(
                new Color(235, 235, 235)
        );

        profileCard.setBorder(
                new EmptyBorder(30, 35, 30, 35)
        );

        profileCard.setLayout(
                new BoxLayout(
                        profileCard,
                        BoxLayout.Y_AXIS
                )
        );

        // ---------------- TITLE ----------------

        JLabel titleLabel =
                new JLabel("User Profile");

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
                new JLabel(
                        "Enter your health information"
                );

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

        formPanel.setAlignmentX(
                Component.CENTER_ALIGNMENT
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

        // ---------------- AGE ----------------

        JLabel ageLabel =
                new JLabel("Age");

        ageLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        gbc.insets =
                new Insets(0, 0, 6, 0);

        formPanel.add(
                ageLabel,
                gbc
        );

        gbc.gridy++;

        ageField =
                createInputField();

        gbc.insets =
                new Insets(0, 0, 0, 0);

        formPanel.add(
                ageField,
                gbc
        );

        // ---------------- HEIGHT ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(18, 0, 6, 0);

        JLabel heightLabel =
                new JLabel("Height (inches)");

        heightLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                heightLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        heightField =
                createInputField();

        formPanel.add(
                heightField,
                gbc
        );

        // ---------------- WEIGHT ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(18, 0, 6, 0);

        JLabel weightLabel =
                new JLabel("Weight (lbs)");

        weightLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                weightLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        weightField =
                createInputField();

        formPanel.add(
                weightField,
                gbc
        );

        // ---------------- ACTIVITY LEVEL ----------------

        gbc.gridy++;

        gbc.insets =
                new Insets(18, 0, 6, 0);

        JLabel activityLabel =
                new JLabel("Activity Level");

        activityLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        formPanel.add(
                activityLabel,
                gbc
        );

        gbc.gridy++;

        gbc.insets =
                new Insets(0, 0, 0, 0);

        String[] activityLevels = {

                "Select activity level",
                "Sedentary",
                "Lightly Active",
                "Moderately Active",
                "Very Active"
        };

        activityLevelBox =
                new JComboBox<>(
                        activityLevels
                );

        activityLevelBox.setPreferredSize(
                new Dimension(
                        300,
                        40
                )
        );

        formPanel.add(
                activityLevelBox,
                gbc
        );

        // ---------------- SAVE BUTTON ----------------

        saveButton =
                new JButton("SAVE PROFILE");

        saveButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                )
        );

        saveButton.setForeground(
                Color.WHITE
        );

        saveButton.setBackground(
                new Color(11, 31, 58)
        );

        // Helps the button display correctly on macOS
        saveButton.setOpaque(true);
        saveButton.setContentAreaFilled(true);
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);

        saveButton.setPreferredSize(
                new Dimension(
                        300,
                        42
                )
        );

        saveButton.setMaximumSize(
                new Dimension(
                        300,
                        42
                )
        );

        saveButton.setMinimumSize(
                new Dimension(
                        300,
                        42
                )
        );

        saveButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        saveButton.addActionListener(
                e -> saveProfile()
        );

        // ---------------- MESSAGE LABEL ----------------

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

        profileCard.add(
                titleLabel
        );

        profileCard.add(
                Box.createVerticalStrut(7)
        );

        profileCard.add(
                subtitleLabel
        );

        profileCard.add(
                Box.createVerticalStrut(25)
        );

        profileCard.add(
                formPanel
        );

        profileCard.add(
                Box.createVerticalStrut(25)
        );

        profileCard.add(
                saveButton
        );

        profileCard.add(
                Box.createVerticalStrut(12)
        );

        profileCard.add(
                messageLabel
        );

        // Add card to background
        backgroundPanel.add(
                profileCard
        );

        // Add background to window
        add(
                backgroundPanel
        );
    }

    // Creates matching input fields
    private JTextField createInputField() {

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

    // Validates and creates the user's profile
    private void saveProfile() {

        try {

            int age =
                    Integer.parseInt(
                            ageField
                                    .getText()
                                    .trim()
                    );

            double height =
                    Double.parseDouble(
                            heightField
                                    .getText()
                                    .trim()
                    );

            double weight =
                    Double.parseDouble(
                            weightField
                                    .getText()
                                    .trim()
                    );

            String activityLevel =
                    (String)
                            activityLevelBox
                                    .getSelectedItem();

            // Check for invalid numbers
            if (
                    age <= 0
                            ||
                    height <= 0
                            ||
                    weight <= 0
            ) {

                showError(
                        "Please enter valid positive values."
                );

                return;
            }

            // Make sure activity level was selected
            if (
                    activityLevelBox
                            .getSelectedIndex()
                            == 0
            ) {

                showError(
                        "Please select an activity level."
                );

                return;
            }

            // Temporary profile ID
            int profileId = 1;

            // Create the UserProfile object
            UserProfile profile =
                    new UserProfile(
                            profileId,
                            userId,
                            age,
                            height,
                            weight,
                            activityLevel
                    );

            // Success message
            messageLabel.setForeground(
                    new Color(
                            30,
                            130,
                            70
                    )
            );

            messageLabel.setText(
                    "Profile saved successfully!"
            );

            // Temporary testing output
            System.out.println(
                    "Profile created for User ID: "
                            + profile.getUserId()
            );

            System.out.println(
                    "Age: "
                            + profile.getAge()
            );

            System.out.println(
                    "Height: "
                            + profile.getHeight()
            );

            System.out.println(
                    "Weight: "
                            + profile.getWeight()
            );

            System.out.println(
                    "Activity Level: "
                            + profile.getActivityLevel()
            );

        } catch (NumberFormatException exception) {

            showError(
                    "Age, height, and weight must be numbers."
            );
        }
    }

    // Displays validation errors
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