package generalTasksForOOP.libraryManagement;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(this.title + " borrowed");
        } else {
            System.out.println("Book has already been borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println("Book has been returned " + "(" + title + ")");
            isAvailable = true;
        } else {
            System.out.println("Book has already been returned.");
        }

    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

}
