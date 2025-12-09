package objectClassConstrucktors.BookClass;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Book book2 = new Book("Romeo and Juliet", "Shakespeare");
        Book book3 = new Book("Robinson", "Daniel Depho", 13.99);
    }
}
