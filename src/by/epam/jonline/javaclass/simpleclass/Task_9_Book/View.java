package by.epam.jonline.javaclass.simpleclass.Task_9_Book;

public class View {

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

    public static void printBookList (Library library) {
        System.out.println("List of books in library:");
        library.getBookList().forEach(System.out::println);
        System.out.println();
    }
}
