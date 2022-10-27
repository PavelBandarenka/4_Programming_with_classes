package by.epam.jonline.javaclass.simpleclass.Task_9_Book;

public class Main_Task9 {

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

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("The Master and Margarita","Bulgakov Mihail", "EKSMO", 2021,416, 11, "softcover"));
        library.addBook(new Book("Transhumanism","Pelevin Victor", "EKSMO", 2021,608, 52, "hardcover"));
        library.addBook(new Book("A dog's heart","Bulgakov Mihail", "EKSMO", 2014,160, 13, "hardcover"));
        library.addBook(new Book("Bicentennial man","Isaac Asimov", "AST", 1994,16, 5, "softcover"));
        library.addBook(new Book("I, Robot","Isaac Asimov", "AST", 2019,320, 16, "softcover"));

        View.printBookList(library);

        library.showBooksByAuthor("Bulgakov Mihail");

        library.showBooksByPublisher("EKSMO");

        library.showBooksAfterYear(2020);

    }
}