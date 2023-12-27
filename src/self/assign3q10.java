package self;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class assign3q10 extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public assign3q10() {
        setTitle("Mouse Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Press mouse to calculate");

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        };

        num1Field.addMouseListener(mouseAdapter);
        num2Field.addMouseListener(mouseAdapter);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(num1Field);
        add(num2Field);
        add(resultLabel);

        setVisible(true);
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultLabel.setText("Sum: " + sum);
        } catch (NumberFormatException ignored) {
            resultLabel.setText("Invalid Input");
        }
    }

    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double difference = num1 - num2;
            resultLabel.setText("Difference: " + difference);
        } catch (NumberFormatException ignored) {
            resultLabel.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(assign3q10::new);
    }
}
