package lab1;

class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " with priority " + getPriority() + " is running.");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        PriorityThread lowPriorityThread = new PriorityThread("LowPriorityThread", Thread.MIN_PRIORITY);
        PriorityThread normalPriorityThread = new PriorityThread("NormalPriorityThread", Thread.NORM_PRIORITY);
        PriorityThread highPriorityThread = new PriorityThread("HighPriorityThread", Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}
