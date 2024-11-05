package Verisoft.IteratorPatternExample;

/**
 * Represents a book entity with basic book information.
 */
public class Book {
    private String title;
    private String author;
    private int year;

    /**
     * Constructs a new Book with the specified details.
     *
     * @param title  The title of the book
     * @param author The author of the book
     * @param year   The publication year of the book
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return A string containing the book's details
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}

