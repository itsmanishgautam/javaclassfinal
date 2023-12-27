package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class assign3q4 extends JFrame {
    private JTextField principalField, rateField, timeField, resultField;

    public assign3q4() {
        // Set up the frame
        setTitle("Simple Interest Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create components
        JLabel principalLabel = new JLabel("Principal Amount:");
        JLabel rateLabel = new JLabel("Rate of Interest:");
        JLabel timeLabel = new JLabel("Time (in years):");
        JLabel resultLabel = new JLabel("Simple Interest:");

        principalField = new JTextField(10);
        rateField = new JTextField(10);
        timeField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });

        // Set layout
        setLayout(new GridLayout(5, 2, 5, 5));

        // Add components to the frame
        add(principalLabel);
        add(principalField);
        add(rateLabel);
        add(rateField);
        add(timeLabel);
        add(timeField);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // Empty space for layout
        add(calculateButton);

        // Make the frame visible
        setVisible(true);
    }

    private void calculateSimpleInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            double simpleInterest = (principal * rate * time) / 100;

            resultField.setText(String.format("%.2f", simpleInterest));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new assign3q4();
            }
        });
    }
}
