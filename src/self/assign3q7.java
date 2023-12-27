package self;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class assign3q7 extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public assign3q7() {
        setTitle("Sum Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        num2Field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                calculateSum();
            }
        });

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(num1Field);
        add(num2Field);
        add(resultField);

        setVisible(true);
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultField.setText("Sum: " + sum);
        } catch (NumberFormatException ignored) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(assign3q7::new);
    }
}
