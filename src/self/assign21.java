package self;
import java.io.*;

public class assign21 {


    static class Employee implements Serializable {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
    }


        public static void main(String[] args) {
            Employee employee = new Employee(1, "John Doe", 50000.0);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.doc"))) {
                oos.writeObject(employee);
                System.out.println("Object written to emp.doc");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


