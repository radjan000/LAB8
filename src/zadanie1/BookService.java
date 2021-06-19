package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books;

    public BookService() {
        books = new ArrayList<Book>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    public List<Book> getFantasyBooks() {
        List<Book> fantasyBooks = new ArrayList<>();
        for(Book book: books) {
            if (book.getGenre().equals(Book.Genre.PODRECZNIK)) {
                fantasyBooks.add(book);
            }
        }
        return fantasyBooks;
    }
    public List<Book> getBooksBefore2004() {
        List<Book> booksBefore2004 = new ArrayList<>();
        for(Book book: books) {
            if (book.getYear() < 2004) {
                booksBefore2004.add(book);
            }
        }
        return booksBefore2004;
    }

    public Book getCheapestBook() {
        Book cheapestBook = null;
        for (Book book: books){
            if ((cheapestBook == null)
                    || (cheapestBook.getPrice() > book.getPrice())) {
                cheapestBook = book;
            }
        }
        return cheapestBook;
    }

    public Book getMostExpensiveBook() {
        Book mostExpensiveBook = null;
        for (Book book: books){
            if ((mostExpensiveBook == null)
                    || (mostExpensiveBook.getPrice() < book.getPrice())) {
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }
}
