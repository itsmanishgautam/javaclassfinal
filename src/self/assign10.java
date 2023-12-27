package self;
import java.io.*;

public class assign10 {



        public static void main(String[] args) {
            // Specify the file path
            String filePath = "C:\\Users\\shyma\\IdeaProjects\\javaclassfinal\\out\\production\\javaclassfinal\\self\\example.txt";


            // Write to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write("Hello, FileWriter!");
                System.out.println("File written successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Read from the same file
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                System.out.println("File content:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


