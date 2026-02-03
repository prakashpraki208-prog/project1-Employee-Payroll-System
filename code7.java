class Book {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "Alice";
        b1.price = 500;

        Book b2 = new Book();
        b2.title = "Python Guide";
        b2.author = "Bob";
        b2.price = 600;

        Book b3 = new Book();
        b3.title = "Data Structures";
        b3.author = "Charlie";
        b3.price = 700;

        System.out.println(b1.title + ", " + b1.author + ", " + b1.price);
        System.out.println(b2.title + ", " + b2.author + ", " + b2.price);
        System.out.println(b3.title + ", " + b3.author + ", " + b3.price);
    }
}
