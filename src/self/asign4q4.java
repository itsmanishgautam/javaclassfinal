package self;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class asign4q4 {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // SQL query to retrieve names of students in Kathmandu district
        String query = "SELECT name FROM student WHERE district = 'Kathmandu'";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Display the names of students in Kathmandu district
            while (resultSet.next()) {
                String studentName = resultSet.getString("name");
                System.out.println("Student Name: " + studentName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
