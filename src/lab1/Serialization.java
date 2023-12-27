package lab1;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version compatibility
    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade=" + grade +
                '}';
    }
}

public class Serialization {
    public static void main(String[] args) {
        // Serialization
        serializeStudents();

        // Deserialization
        deserializeStudents();
    }

    private static void serializeStudents() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            Student student1 = new Student("Alice", 101, 'A');
            Student student2 = new Student("Bob", 102, 'B');
            Student student3 = new Student("Charlie", 103, 'A');

            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);

            System.out.println("Students serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeStudents() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"))) {
            Student student1 = (Student) ois.readObject();
            Student student2 = (Student) ois.readObject();
            Student student3 = (Student) ois.readObject();

            System.out.println("Students deserialized:");
            System.out.println(student1);
            System.out.println(student2);
            System.out.println(student3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
