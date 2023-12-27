package self;

public class assign8 {

    static class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getId() + " Value " + i);
            }
        }
    }


        public static void main(String args[]) {
            MyThread thread1 = new MyThread();
            MyThread thread2 = new MyThread();

            thread1.start(); // Starts the first thread
            thread2.start(); // Starts the second thread
        }



}
