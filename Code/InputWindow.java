import javax.swing.*;
import java.awt.*;

public class InputWindow extends JFrame {//subclass of JFrame(window)

    InputWindow(String title, String[] fields) {

        setTitle(title);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main panel
        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 15));
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // Create input fields
        JTextField[] inputs = new JTextField[fields.length];

        for (int i = 0; i < fields.length; i++) {

            JLabel label = new JLabel(fields[i]);
            JTextField input = new JTextField();

            inputs[i] = input;

            panel.add(label);
            panel.add(input);
        }

        // Submit and Cancel buttons
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        panel.add(submitButton);
        panel.add(cancelButton);

        // Submit action CURRENTLY JUST PRINTS INPUT
        submitButton.addActionListener(e -> {

            for (int i = 0; i < fields.length; i++) {
                System.out.println(
                    fields[i] + ": " + inputs[i].getText()
                );
            }

            dispose();
        });

        // Cancel action
        cancelButton.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
