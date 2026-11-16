
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class ContentPanel extends JPanel {

    private Color backgroundColor = new Color(240, 240, 245);
    private Color panelColor = Color.WHITE;
/*A JPanel is created and split horizontally, a top panel is split into three and placed on the top half to hold 3 graphs
a bottom panel is created and split into 2 collums and placed into the bottom half.
Graph panels are created and added to each grid slot.*/
    ContentPanel() {

        // Main content panel
        this.setBackground(backgroundColor);
        this.setLayout(new GridLayout(2, 1, 10, 10));

        // =========================
        // TOP ROW - 3 PANELS
        // =========================

        JPanel topPanel = new JPanel(new GridLayout(1, 3, 10, 0));
        topPanel.setBackground(backgroundColor);

        JPanel graphPanel1 = createGraphPanel("Steps");
        JPanel graphPanel2 = createGraphPanel("Weight");
        JPanel graphPanel3 = createGraphPanel("Workout");

        topPanel.add(graphPanel1);
        topPanel.add(graphPanel2);
        topPanel.add(graphPanel3);

        // =========================
        // BOTTOM ROW - 2 PANELS
        // =========================

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        bottomPanel.setBackground(backgroundColor);

        JPanel graphPanel4 = createGraphPanel("BodyFat");
        JPanel graphPanel5 = createGraphPanel("Calorie Intake");

        bottomPanel.add(graphPanel4);
        bottomPanel.add(graphPanel5);

        // Add rows to main panel
        this.add(topPanel);
        this.add(bottomPanel);

        // Outer padding
        this.setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
    }
    //THIS WILL BE USED LATER WITH GRAPHS
    // Creates an empty graph panel
    private JPanel createGraphPanel(String title) {

        JPanel panel = new JPanel();

        panel.setBackground(panelColor);

        JLabel graphTitle = new JLabel(title);

        graphTitle.setFont(
            new Font("Arial", Font.BOLD, 16)
        );

        panel.setBorder(
            BorderFactory.createLineBorder(
                new Color(200, 200, 210), 1
            )
        );

        panel.add(graphTitle,BorderLayout.NORTH);

        return panel;
    }
}

