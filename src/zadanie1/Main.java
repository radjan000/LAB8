package zadanie1;

import java.util.Arrays;

import static zadanie1.Author.Sex.*;

public class Main {

    public static void main(String[] args) {

        Author card = new Author("Orson", "Scott Card", MALE);
        Author budzynski = new Author("Wojciech", "Budzynski", MALE);
        Author wilamowska = new Author("Malgorzata", "Wilamowska", FEMALE);

        Book fantasy = new Book("Pozoga", 50, 2014, Arrays.asList(card), Book.Genre.FANTASY);
        Book podrecznik = new Book("Poradnik elektryka", 75, 1995, Arrays.asList(budzynski), Book.Genre.PODRECZNIK);
        Book poradnik = new Book("Szkola budowania", 100, 2002, Arrays.asList(wilamowska), Book.Genre.PORADNIK);

        BookService bookService = new BookService();

        bookService.add(fantasy);
        bookService.add(podrecznik);
        bookService.add(poradnik);

        System.out.println("ALL");
        System.out.println(bookService.getBooks());

        System.out.println("FANTASY");
        System.out.println(bookService.getFantasyBooks());

        System.out.println("2004");
        System.out.println(bookService.getBooksBefore2004());

        System.out.println("CHEAP");
        System.out.println(bookService.getCheapestBook());

        System.out.println("EXPENSIVE");
        System.out.println(bookService.getMostExpensiveBook());

        System.out.println("REMOVING");
        bookService.remove(poradnik);
        System.out.println(bookService.getBooks());
    }
}
