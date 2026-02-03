class Book {
    private String title;
    private boolean available = true;

    void borrowBook() {
        if (available) available = false;
    }

    void returnBook() {
        available = true;
    }

    boolean isAvailable() {
        return available;
    }

    void setTitle(String t) { title = t; }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.borrowBook();
        System.out.println("Available: " + b.isAvailable());
        b.returnBook();
        System.out.println("Available: " + b.isAvailable());
    }
}
