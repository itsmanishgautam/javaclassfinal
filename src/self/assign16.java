package self;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assign16 {




        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter a string: ");
                String inputString = scanner.nextLine();

                writeToFile(inputString, "VOWEL.txt", "CONSONANT.txt");

                System.out.println("Files created successfully!");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void writeToFile(String inputString, String vowelFileName, String consonantFileName) throws IOException {
            try (FileWriter vowelWriter = new FileWriter(vowelFileName);
                 FileWriter consonantWriter = new FileWriter(consonantFileName)) {

                for (char ch : inputString.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        (isVowel(ch) ? vowelWriter : consonantWriter).write(ch);
                    }
                }
            }
        }

        private static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }



