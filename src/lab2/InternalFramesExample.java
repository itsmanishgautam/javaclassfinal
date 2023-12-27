package lab2;
import javax.swing.*;
import java.awt.*;

public class InternalFramesExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame parentFrame = new JFrame("Parent Frame");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        parentFrame.setContentPane(desktopPane);

        createInternalFrame("Internal Frame 1", desktopPane, 20, 20);
        createInternalFrame("Internal Frame 2", desktopPane, 100, 100);

        parentFrame.setSize(400, 300);
        parentFrame.setLocationRelativeTo(null);
        parentFrame.setVisible(true);
    }

    private static void createInternalFrame(String title, JDesktopPane desktopPane, int x, int y) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);



        internalFrame.setLocation(x, y);

        JLabel label = new JLabel("This is " + title);
        internalFrame.add(label);

        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);
    }
}
