package by.epam.jonline.javaclass.simpleclass.Task_9_Book;

public class Book {

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

    private final int id;
    private final String name;
    private final String author;
    private final String publisher;
    private final int year;
    private final int pages;
    private final int price;
    private final String bookBinding;

    private static int uniqueID = 1;

    public Book(String name, String author, String publisher, int year, int pages, int price, String bookBinding) {
        this.id = uniqueID;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.bookBinding = bookBinding;
        uniqueID++;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bookBinding='" + bookBinding + '\'' +
                '}';
    }
}
