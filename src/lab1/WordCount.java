package lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        // Use the absolute path or adjust as needed
        String fileName = "C:\\Users\\shyma\\OneDrive\\Desktop\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                // Split each line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");

                // Update word count
                wordCount += words.length;
            }

            System.out.println("Total words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
