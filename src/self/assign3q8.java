package self;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class assign3q8 extends JFrame {
    private JTextField idField, titleField, genreField, languageField, lengthField;

    public assign3q8() {
        setTitle("Movie Rental System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        idField = new JTextField(10);
        titleField = new JTextField(10);
        genreField = new JTextField(10);
        languageField = new JTextField(10);
        lengthField = new JTextField(10);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertMovieData();
            }
        });

        setLayout(new GridLayout(6, 2, 5, 5));
        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Genre:"));
        add(genreField);
        add(new JLabel("Language:"));
        add(languageField);
        add(new JLabel("Length:"));
        add(lengthField);
        add(new JLabel());
        add(okButton);

        setVisible(true);
    }

    private void insertMovieData() {
        try {
            // Establish the database connection (modify the connection URL, username, and password accordingly)
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

            // Prepare the SQL statement for insertion (modify the query based on your table structure)
            String query = "INSERT INTO Movie (id, Title, Genre, Language, Length) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, idField.getText());
                preparedStatement.setString(2, titleField.getText());
                preparedStatement.setString(3, genreField.getText());
                preparedStatement.setString(4, languageField.getText());
                preparedStatement.setString(5, lengthField.getText());

                // Execute the insertion
                preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error inserting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(assign3q8::new);
    }
}
