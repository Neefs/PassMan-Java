import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Client {


    private static void runMainGui() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
            JFrame.setDefaultLookAndFeelDecorated(true);
        }
        new Gui();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> runMainGui());
    }
}