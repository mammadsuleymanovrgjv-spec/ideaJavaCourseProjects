package generalTasksForOOP.libraryManagement;

public class Library {
    private final Book[] books;

    public Library() {
        books = new Book[15];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added - " + book.getTitle());
                return;
            }

        }
        System.out.println("Here is no space for addbook.");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books :");
        for (Book book : books) {
            if (book != null && book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                book.borrow();
                return;
            }

        }
        System.out.println("Book (" + title + ") not found.");

    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book (" + title + ") not found.");
    }


}
