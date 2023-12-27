package lab1;




    interface Borrowable {
        void checkOut();
        void returnItem();
    }

    class Item {
        private String title;
        private int itemID;

        public Item() {}

        public Item(String title, int itemID) {
            this.title = title;
            this.itemID = itemID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getItemID() {
            return itemID;
        }

        public void setItemID(int itemID) {
            this.itemID = itemID;
        }
    }

    class Book extends Item implements Borrowable {
        private boolean isBorrowed;

        public Book() {}

        public Book(String title, int itemID) {
            super(title, itemID);
        }

        @Override
        public void checkOut() {
            if (!isBorrowed) {
                System.out.println("Book checked out: " + getTitle());
                isBorrowed = true;
            } else {
                System.out.println("Book is already borrowed.");
            }
        }

        @Override
        public void returnItem() {
            if (isBorrowed) {
                System.out.println("Book returned: " + getTitle());
                isBorrowed = false;
            } else {
                System.out.println("Book is not currently borrowed.");
            }
        }
    }

    class DVD extends Item implements Borrowable {
        private boolean isBorrowed;

        public DVD() {}

        public DVD(String title, int itemID) {
            super(title, itemID);
        }

        @Override
        public void checkOut() {
            if (!isBorrowed) {
                System.out.println("DVD checked out: " + getTitle());
                isBorrowed = true;
            } else {
                System.out.println("DVD is already borrowed.");
            }
        }

        @Override
        public void returnItem() {
            if (isBorrowed) {
                System.out.println("DVD returned: " + getTitle());
                isBorrowed = false;
            } else {
                System.out.println("DVD is not currently borrowed.");
            }
        }
    }

public class lab1q2 {
        public static void main(String[] args) {
            Book book = new Book("Java Programming", 101);
            DVD dvd = new DVD("Introduction to Java", 201);

            book.checkOut();
            dvd.checkOut();

            book.returnItem();
            dvd.returnItem();
        }





}



