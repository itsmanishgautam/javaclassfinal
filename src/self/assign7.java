package self;

public class assign7 {


    // First interface
    interface Printable {
        void print();
    }

    // Second interface
    interface Showable {
        void show();
    }

    // Class implementing both interfaces
    static class Display implements Printable, Showable {
        @Override
        public void print() {
            System.out.println("Printing...");
        }

        @Override
        public void show() {
            System.out.println("Showing...");
        }



        public static void main(String[] args)
        {
            Display display = new Display();
            display.print();
            display.show();
        }



}}