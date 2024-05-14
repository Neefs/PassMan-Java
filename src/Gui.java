import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
    JFrame frame;
    JPanel mainPanel, topPanel, websiteListPanel;


    public Gui() {
        frame = new JFrame("Password Manager");
        mainPanel = new JPanel();
        topPanel = new JPanel();
        websiteListPanel = new JPanel();
        frame.add(mainPanel);
        frame.setSize(1920, 1050);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
