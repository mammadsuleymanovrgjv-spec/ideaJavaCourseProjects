package generalTasksForOOP.libraryManagement;

public class Main {
    public static void main(String[] args) {
        Library books = new Library();
        books.addBook(new Book("Les Misérables", "Viktor Hugo", 1862));
        books.addBook(new Book("Hamlet", "William Shakespeare", 1600));
        books.addBook(new Book("Around the World in Eighty Days", "Jules Verne", 1872));
        books.addBook(new Book("The Lord of the Rings", "Juan Martin", 1872));
        books.showAvailableBooks();
        books.borrowBook("Hamlet");
        books.showAvailableBooks();
        books.returnBook("Hamlet");


    }
}
