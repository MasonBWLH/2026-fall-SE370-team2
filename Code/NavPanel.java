import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;//action listener for buttons

public class NavPanel extends JPanel {

    private Color backgroundColor = new Color(30, 30, 45);
    private Color buttonColor = new Color(50, 50, 70);

    NavPanel() {

        // Main panel background
        this.setBackground(backgroundColor);
        this.setPreferredSize(new Dimension(300, 700));
        this.setLayout(new BorderLayout());

        // =========================
        // TOP SECTION
        // =========================

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(backgroundColor);

        // Settings icon
        JButton settingsButton = new JButton("\u2699");
        settingsButton.setFont(new Font("Arial", Font.PLAIN, 24));
        settingsButton.setBackground(buttonColor);
        settingsButton.setForeground(Color.BLACK);
        settingsButton.setFocusPainted(false);
        settingsButton.setPreferredSize(new Dimension(45, 45));

        JPanel settingsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        settingsPanel.setBackground(backgroundColor);
        settingsPanel.add(settingsButton);

        topPanel.add(settingsPanel, BorderLayout.SOUTH);

        // Recommendations section
        JPanel recommendationPanel = new JPanel();
        recommendationPanel.setBackground(backgroundColor);
        recommendationPanel.setLayout(new BorderLayout());

        JLabel recommendationTitle =
                new JLabel("Recommendations");

        recommendationTitle.setForeground(Color.WHITE);
        recommendationTitle.setFont(
                new Font("Arial", Font.BOLD, 18));

        recommendationTitle.setBorder(
                BorderFactory.createEmptyBorder(15, 10, 15, 10));

        JLabel recommendationText =
                new JLabel("<html>Recommendations will appear here.</html>");

        recommendationText.setForeground(Color.LIGHT_GRAY);
        recommendationText.setFont(
                new Font("Arial", Font.PLAIN, 14));

        recommendationText.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        recommendationPanel.add(
                recommendationTitle, BorderLayout.NORTH);

        recommendationPanel.add(
                recommendationText, BorderLayout.CENTER);

        topPanel.add(recommendationPanel, BorderLayout.CENTER);

        // =========================
        // BOTTOM SECTION
        // =========================

        JPanel editPanel = new JPanel();
        editPanel.setBackground(backgroundColor);
        editPanel.setLayout(new BorderLayout());

        // Section title
        JLabel editTitle = new JLabel("Edit Information");

        editTitle.setForeground(Color.WHITE);
        editTitle.setFont(new Font("Arial", Font.BOLD, 18));

        editTitle.setBorder(
                BorderFactory.createEmptyBorder(15, 10, 15, 10));

        editPanel.add(editTitle, BorderLayout.NORTH);

        // Edit buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(backgroundColor);
        buttonPanel.setLayout(new GridLayout(3, 1, 0, 15));

        JButton fitnessButton = new JButton("Edit Fitness");
        JButton healthButton = new JButton("Edit Health");
        JButton measurementsButton =
                new JButton("Edit Measurements");

        JButton[] buttons = {
                fitnessButton,
                healthButton,
                measurementsButton
        };

        for (JButton button : buttons) {

            button.setBackground(buttonColor);
            button.setForeground(Color.BLACK);
            button.setFont(new Font("Arial", Font.BOLD, 15));
            button.setFocusPainted(false);

        }
        //Adding listeners for each button
        fitnessButton.addActionListener(e ->
                new InputWindow("Edit Fitness", new String[] {
                "Date",
                "Exercise Type:",
                "Reps",
                "Sets:",
                "Steps"
    })
);

        healthButton.addActionListener(e ->
                new InputWindow("Edit Health", new String[] {
                "Date",
                "Calorie Intake",
                "Sleep (hours):",
                "Weight"
    })
);

        measurementsButton.addActionListener(e ->
                new InputWindow("Edit Measurements", new String[] {
                "Date",
                "Chest",
                "Abdomen",
                "Thigh"
    })
);

        buttonPanel.add(fitnessButton);
        buttonPanel.add(healthButton);
        buttonPanel.add(measurementsButton);

        editPanel.add(buttonPanel, BorderLayout.CENTER);

        editPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 20, 10));

        // =========================
        // SPLIT LEFT PANEL
        // =========================

        JPanel leftPanel = new JPanel(new GridLayout(2, 1));

        leftPanel.setBackground(backgroundColor);

        leftPanel.add(editPanel);
        leftPanel.add(topPanel);

        this.add(leftPanel, BorderLayout.CENTER);

        // Padding
        this.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

    }
}