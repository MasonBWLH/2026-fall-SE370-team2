import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MyFrame extends JFrame {

    MyFrame() {

        NavPanel navigation = new NavPanel();
        ContentPanel content = new ContentPanel();

        this.setTitle("H&F Tracker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1300, 800);

        // Set layout
        this.setLayout(new BorderLayout());

        // Add panels
        this.add(navigation, BorderLayout.WEST);
        this.add(content, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}


