package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        frame.setContentPane(panel);

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResult(num1Field, num2Field, "Sum", "Addition Result");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResult(num1Field, num2Field, "Difference", "Subtraction Result");
            }
        });

        panel.add(new JLabel("Enter Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Enter Number 2:"));
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);

        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void calculateAndShowResult(JTextField num1Field, JTextField num2Field, String operation, String resultDialogTitle) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            double result = (operation.equals("Sum")) ? num1 + num2 : num1 - num2;

            JOptionPane.showMessageDialog
                    (null, operation + ": " + result,
                            resultDialogTitle, JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. " +
                    "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
