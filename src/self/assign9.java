package self;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class assign9 {



    public static class FileReadWriteExample {
        public static void main(String[] args) {
            // Write to a file
            try (FileWriter writer = new FileWriter("example.txt")) {
                writer.write("Hello, FileWriter!");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Read from the same file
            try (FileReader reader = new FileReader("example.txt")) {
                int data;
                while ((data = reader.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
