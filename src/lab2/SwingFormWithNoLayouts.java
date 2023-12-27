package lab2;
import javax.swing.*;
import java.awt.*;

public class SwingFormWithNoLayouts {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e) { e.printStackTrace(); }

        JFrame frame = new JFrame("No Layout Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(120, 10, 150, 30);
        c.add(title);

        addLabel(c, "Username:", 30, 50);
        addTextField(c, 120, 50, 150, 20);

        addLabel(c, "Password:", 30, 80);
        addPasswordField(c, 120, 80, 150, 20);

        addCheckBox(c, "Yes, I agree to terms and conditions", 30, 110, 250, 20);
        addButton(c, "Login", 30, 140, 100, 30);

        frame.setSize(300, 220);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addLabel(Container c, String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 80, 20);
        c.add(label);
    }

    private static void addTextField(Container c, int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        c.add(textField);
    }

    private static void addPasswordField(Container c, int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, width, height);
        c.add(passwordField);
    }

    private static void addCheckBox(Container c, String text, int x, int y, int width, int height) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setBounds(x, y, width, height);
        c.add(checkBox);
    }

    private static void addButton(Container c, String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        c.add(button);
    }
}
