package task4;

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void start(){
        Author author1 = new Author("J.K Rowling", (short) 55);
        Author author2 = new Author("R. Kiyosaki", (short) 73);
        Author author3 = new Author("F. Scott Fitzgerald", (short) 73);

        Book book1 = new Book("The Great Gatsby", new ArrayList<>(Collections.singleton(author3)),100);
        Book book2 = new Book("Harry Potter 1", new ArrayList<>(Collections.singleton(author1)), 250);
        Book book3 = new Book("Harry Potter 2", new ArrayList<>(Collections.singleton(author1)), 400);
        Book book4 = new Book("Rich Dad Poor Dad", new ArrayList<>(Collections.singleton(author2)), 50);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        List<Book> harrysBooks = new ArrayList<>();
        harrysBooks.add(book2);
        harrysBooks.add(book3);
        author1.setBooks(harrysBooks);
        author2.setBooks(new ArrayList<>(Collections.singleton(book4)));
        author3.setBooks(new ArrayList<>(Collections.singleton(book1)));


        //Ищем в стриме книгу с >200 страниц
        System.out.println("Первая попавшаяся книга с >200 страницами");
        Optional<Book> bookWithMore200Pages = bookList.stream()
                .filter(s -> s.getNumberOfPages() > 200)
                .findAny();
        System.out.println(bookWithMore200Pages);

        //Ищем книгу с максимальным кол-вом страниц
        System.out.println("Книга с максимальным колвом страниц");
        Optional<Book> bookWithMaxPages = bookList.stream()
                .max(Comparator.comparing(Book::getNumberOfPages));
        System.out.println(bookWithMaxPages);

        //Ищем книгу с минимальным кол-вом страниц
        System.out.println("Книга с минимальным колвом страниц");
        Optional<Book> bookWithMinPages = bookList.stream()
                .min(Comparator.comparing(Book::getNumberOfPages));
        System.out.println(bookWithMinPages);

        //Ищем книги с одним автором
        System.out.println("Книги с одним автором");
        bookList.stream()
                .filter(s -> s.getAuthors().size() == 1)
                .forEach(System.out::println);

        //Сортируем по кол-ву страниц
        System.out.println("Сортировка по колву страниц");
        List<Book> sortedBookListViaNumOfPages = bookList.stream()
                .sorted(Comparator.comparingInt(Book::getNumberOfPages))
                .collect(Collectors.toList());
        System.out.println(sortedBookListViaNumOfPages);

        //Забираем все тайтлы
        System.out.println("Забираем все тайтлы");
        List<String> titles = bookList.stream()
                .map(s -> s.getTitle())
                .collect(Collectors.toList());
        System.out.println(titles);

        //Ищем всех авторов по книгам
        System.out.println("Ищем всех авторов по книгам");
        List<Author> authors = bookList.stream()
                .map(s -> s.getAuthors().get(0))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(authors);

        //Забираем все тайтлы параллельно
        System.out.println("Забираем все тайтлы");
        List<String> titlesParallel = bookList.parallelStream()
                .map(s -> s.getTitle())
                .collect(Collectors.toList());
        System.out.println(titlesParallel);
    }
}
