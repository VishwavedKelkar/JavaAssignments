package com.ass3.ass3;
import java.util.ArrayList;

public class BookManagement {
    private ArrayList<Book> books;

    public BookManagement() {
        this.books = new ArrayList<>();
    }

    // Display all books
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Find a particular book by ISBN
    public Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book by ISBN
    public boolean removeBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            books.remove(book);
            return true;
        }
        return false;
    }

    // Edit book details (only quantity for simplicity)
    public boolean editBookDetails(String isbn, int quantity) {
        Book book = findBook(isbn);
        if (book != null) {
            book.setQuantity(quantity);
            return true;
        }
        return false;
    }
}
