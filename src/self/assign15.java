package self;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class assign15 {




        public static void main(String[] args) {
            // Specify the file path
            String filePath = "C:\\Users\\shyma\\IdeaProjects\\javaclassfinal\\out\\production\\javaclassfinal\\self\\example.txt";

            // Read and display the file contents
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
