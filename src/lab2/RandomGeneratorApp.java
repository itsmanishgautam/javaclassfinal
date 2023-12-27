package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RandomGeneratorApp {

    private JTextField outputText;
    private JPanel outputArea;

    public RandomGeneratorApp() {
        JFrame frame = new JFrame("Random Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        outputText = new JTextField();
        outputArea = new JPanel();
        outputArea.setPreferredSize(new Dimension(200, 100));
        outputArea.setBackground(Color.LIGHT_GRAY);

        frame.setLayout(new FlowLayout());
        frame.add(outputText);
        frame.add(outputArea);

        outputText.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                generateRandomInt();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                generateRandomDouble();
            }
        });

        frame.setVisible(true);
    }

    private void generateRandomInt() {
        int randomInt = new Random().nextInt(100) + 1;
        outputText.setText(String.valueOf(randomInt));
        displayOutputArea("Mouse Pressed");
    }

    private void generateRandomDouble() {
        double randomDouble = Math.round(Math.random() * 100.0 * 100.0) / 100.0;
        outputText.setText(String.valueOf(randomDouble));
        displayOutputArea("Mouse Released");
    }

    private void displayOutputArea(String message) {
        outputArea.removeAll();
        JLabel label = new JLabel(message);
        label.setFont(new Font("Helvetica", Font.PLAIN, 12));
        label.setForeground(Color.BLUE);
        outputArea.add(label);
        outputArea.revalidate();
        outputArea.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomGeneratorApp::new);
    }
}
