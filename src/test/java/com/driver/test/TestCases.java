package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import com.driver.*;

public class TestCases {
	 @Test
	    public void testAddBookToLibrary() {
	        // Arrange
	        Library library = new Library("Test Library");
	        Author author = new Author("Test Author", 30);
	        Book book = new Book("Test Book", "ISBN123", author);

	        // Act
	        library.addBook(book);

	        // Assert
	        assertEquals(1, library.getBooks().size());
	        assertEquals(book, library.getBooks().get(0));
	    }
	 
	 @Test
	    public void testAddMultipleBooksToLibrary() {
	        // Arrange
	        Library library = new Library("Test Library");
	        Author author1 = new Author("Author 1", 25);
	        Author author2 = new Author("Author 2", 40);

	        Book book1 = new Book("Book 1", "ISBN111", author1);
	        Book book2 = new Book("Book 2", "ISBN222", author2);

	        // Act
	        library.addBook(book1);
	        library.addBook(book2);

	        // Assert
	        assertEquals(2, library.getBooks().size());
	        assertTrue(library.getBooks().contains(book1));
	        assertTrue(library.getBooks().contains(book2));
	    }
	 
	 @Test
	    public void testGetAuthorDetailsFromBook() {
	        // Arrange
	        Author author = new Author("Test Author", 30);
	        Book book = new Book("Test Book", "ISBN123", author);

	        // Act
	        String authorName = book.getAuthor().getName();
	        int authorAge = book.getAuthor().getAge();

	        // Assert
	        assertEquals("Test Author", authorName);
	        assertEquals(30, authorAge);
	    }
	 
	 @Test
	    public void testDisplayLibraryEmpty() {
	        // Arrange
	        Library library = new Library("Empty Library");

	        // Act
	        List<Book> books = library.getBooks();

	        // Assert
	        assertTrue(books.isEmpty());
	    }
	 
	 @Test
	    public void testLibraryInitialization() {
	        // Arrange
	        Library library = new Library("New Library");

	        // Act
	        List<Book> booksInLibrary = library.getBooks();

	        // Assert
	        assertNotNull(booksInLibrary);
	        assertTrue(booksInLibrary.isEmpty());
	        assertEquals("New Library", library.getName());
	    }
}
