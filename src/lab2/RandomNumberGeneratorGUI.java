package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RandomNumberGeneratorGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Random Number Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField outputField = new JTextField();
        outputField.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(outputField, BorderLayout.CENTER);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Generate and display a random integer
                int randomNumber = (int) (Math.random() * 100);
                outputField.setText("Random Integer: " + randomNumber);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Generate and display a random double
                double randomDouble = Math.random();
                outputField.setText("Random Double: " + randomDouble);
            }
        });

        frame.add(panel);

        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
