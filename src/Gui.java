import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
    JFrame frame;
    JPanel mainPanel;


    public Gui() {
        frame = new JFrame("Password Manager");
        mainPanel = new JPanel();
        frame.add(mainPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
