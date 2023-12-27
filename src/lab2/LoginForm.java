package lab2;

import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginForm::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = frame.getContentPane();
        container.setLayout(null);

        JLabel titleLabel = new JLabel("Login Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(120, 10, 150, 30);
        container.add(titleLabel);

        addLabel(container, "Username:", 30, 50);
        addTextField(container, 120, 50, 150, 20);

        addLabel(container, "Password:", 30, 80);
        addPasswordField(container, 120, 80, 150, 20);

        addCheckBox(container, "Remember Me", 30, 110, 150, 20);
        addButton(container, "Login", 30, 140, 100, 30);

        frame.setSize(300, 220);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void addLabel(Container container, String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 80, 20);
        container.add(label);
    }

    private static void addTextField(Container container, int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        container.add(textField);
    }

    private static void addPasswordField(Container container, int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, width, height);
        container.add(passwordField);
    }

    private static void addCheckBox(Container container, String text, int x, int y, int width, int height) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setBounds(x, y, width, height);
        container.add(checkBox);
    }

    private static void addButton(Container container, String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        container.add(button);
    }
}
