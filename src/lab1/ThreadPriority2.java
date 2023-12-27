package lab1;

class PriorityThreads extends Thread {
    public PriorityThreads(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " with priority " + getPriority() + " is running.");
    }
}

public class ThreadPriority2 {
    public static void main(String[] args) {
        PriorityThread lowPriorityThread = new PriorityThread("LowPriorityThread", Thread.MIN_PRIORITY);
        PriorityThread normalPriorityThread = new PriorityThread("NormalPriorityThread", Thread.NORM_PRIORITY);
        PriorityThread highPriorityThread = new PriorityThread("HighPriorityThread", Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}
