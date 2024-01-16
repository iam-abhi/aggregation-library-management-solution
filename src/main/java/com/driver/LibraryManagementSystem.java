package com.driver;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an author
	        System.out.print("Enter author name: ");
	        String authorName = scanner.nextLine();
	        System.out.print("Enter author age: ");
	        int authorAge = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        Author author = new Author(authorName, authorAge);

	        // Create a book
	        System.out.print("Enter book title: ");
	        String bookTitle = scanner.nextLine();
	        System.out.print("Enter book ISBN: ");
	        String bookIsbn = scanner.nextLine();

	        Book book = new Book(bookTitle, bookIsbn, author);

	        // Create a library
	        System.out.print("Enter library name: ");
	        String libraryName = scanner.nextLine();

	        Library library = new Library(libraryName);
	        library.addBook(book);

	        // Display library books
	        List<Book> booksInLibrary = library.getBooks();
	        System.out.println("\nBooks in " + library.getName() + " Library:");
	        for (Book b : booksInLibrary) {
	            System.out.println("Title: " + b.getTitle());
	            System.out.println("ISBN: " + b.getIsbn());
	            System.out.println("Author: " + b.getAuthor().getName());
	            System.out.println("----------------------");
	        }

	        scanner.close();
	    }
}
