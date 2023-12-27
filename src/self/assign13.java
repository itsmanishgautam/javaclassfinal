package self;

public class assign13 {

    static class PriorityThread extends Thread {
        public PriorityThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }


        public static void main(String[] args) {
            PriorityThread thread1 = new PriorityThread("Thread 1");
            PriorityThread thread2 = new PriorityThread("Thread 2");
            PriorityThread thread3 = new PriorityThread("Thread 3");

            // Set thread priorities
            thread1.setPriority(Thread.MIN_PRIORITY); // 1
            thread2.setPriority(Thread.NORM_PRIORITY); // 5 (default)
            thread3.setPriority(Thread.MAX_PRIORITY); // 10

            // Start the threads
            thread1.start();
            thread2.start();
            thread3.start();
        }



}
