package com.ass3.ass3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.ass3.ass3.Book.Category;

public class Tester {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();

        // Date format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Add books
        try {
            bookManagement.addBook(new Book("12345", Category.FICTION, 29.99, sdf.parse("2020-01-01"), "Author A", 10));
            bookManagement.addBook(new Book("67890", Category.SCIENCE, 39.99, sdf.parse("2021-06-15"), "Author B", 5));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Display all books
        System.out.println("All books:");
        bookManagement.displayBooks();

        // Find a particular book
        System.out.println("Finding book with ISBN 12345:");
        System.out.println(bookManagement.findBook("12345"));

        // Edit book quantity
        bookManagement.editBookDetails("12345", 15);
        System.out.println("Updated book with ISBN 12345:");
        System.out.println(bookManagement.findBook("12345"));

        // Remove a book
        bookManagement.removeBook("67890");
        System.out.println("All books after removing book with ISBN 67890:");
        bookManagement.displayBooks();
    }
}
