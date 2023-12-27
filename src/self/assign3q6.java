package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class assign3q6 extends JFrame {
    private JTextField inputField;
    private JLabel outputLabel;

    public assign3q6() {
        setTitle("String Manipulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        inputField = new JTextField(20);
        outputLabel = new JLabel("Input any String");

        JButton palindromeButton = new JButton("Check Palindrome");
        palindromeButton.addActionListener(e -> checkPalindrome());

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(e -> reverseString());

        JButton vowelsButton = new JButton("Find Vowels");
        vowelsButton.addActionListener(e -> findVowels());

        setLayout(new GridLayout(4, 1, 5, 5));
        add(inputField);
        add(outputLabel);
        add(palindromeButton);
        add(reverseButton);
        add(vowelsButton);

        setVisible(true);
    }

    private void checkPalindrome() {
        String input = inputField.getText();
        String reversed = new StringBuilder(input).reverse().toString();
        String result = input.equalsIgnoreCase(reversed) ? "Palindrome" : "Not Palindrome";
        outputLabel.setText(result);
    }

    private void reverseString() {
        String input = inputField.getText();
        String reversed = new StringBuilder(input).reverse().toString();
        outputLabel.setText(reversed);
    }

    private void findVowels() {
        String input = inputField.getText();
        String vowels = input.replaceAll("[^aeiouAEIOU]", "");
        outputLabel.setText("Vowels: " + vowels);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new assign3q6());
    }
}

