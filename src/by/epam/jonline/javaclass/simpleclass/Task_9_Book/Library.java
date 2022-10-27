package by.epam.jonline.javaclass.simpleclass.Task_9_Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    /*
     *  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
     *  метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
     *  методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
     *  Найти и вывести:
     *  a) список книг заданного автора;
     *  b) список книг, выпущенных заданным издательством;
     *  c) список книг, выпущенных после заданного года.
     */

    private final List<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return library;
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public void showBooksByAuthor(String author) {
        System.out.println(author + " books"+ ":");
        for (Book each : this.getBookList()) {
            if (each.getAuthor().equals(author)) {
                System.out.println(each);
            }
        }
        System.out.println();
    }

    public void showBooksByPublisher(String publisher) {
        System.out.println(publisher + " books"+ ":");
        for (Book each : this.getBookList()) {
            if (each.getPublisher().equals(publisher)) {
                System.out.println(each);
            }
        }
        System.out.println();
    }

    public void showBooksAfterYear( int year) {
        System.out.println("List of books released after "+year+ ":");

        for (Book each : this.getBookList()) {
            if (each.getYear() >= year) {
                System.out.println(each);
            }
        }
        System.out.println();
    }
}