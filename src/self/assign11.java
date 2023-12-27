package self;
import java.io.*;

public class assign11 {




        public static void main(String[] args) {
            // Specify input and output file paths
            String inputFilePath = "C:\\input.txt";
            String outputFilePath = "C:\\output.txt";

            // Read from one file and write to another
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    // Process the data as needed (here, we simply copy it)
                    writer.write(line);
                    writer.newLine(); // Add a newline for each line
                }

                System.out.println("File copied successfully!");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



