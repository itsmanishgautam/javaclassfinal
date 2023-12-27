package lab1;

class Ticket {
    private static int availableTickets = 5;

    // Synchronized method to simulate booking a ticket
    public synchronized void book(String user) {
        if (availableTickets > 0) {
            System.out.println(user + " is booking a ticket...");
            try {
                Thread.sleep((long) (Math.random() * 1000));  // Simulating booking process time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableTickets--;
            System.out.println(user + " booked a ticket. Available tickets: " + availableTickets);
        } else {
            System.out.println("Sorry, " + user + ". No more tickets available.");
        }
    }
}

class UserThread extends Thread {
    private final Ticket ticket;
    private final String userName;

    public UserThread(Ticket ticket, String userName) {
        this.ticket = ticket;
        this.userName = userName;
    }

    @Override
    public void run() {
        ticket.book(userName);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        // Create multiple user threads
        Thread user1 = new UserThread(ticket, "User 1");
        Thread user2 = new UserThread(ticket, "User 2");
        Thread user3 = new UserThread(ticket, "User 3");

        // Start the threads concurrently
        user1.start();
        user2.start();
        user3.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
