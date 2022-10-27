package by.epam.jonline.javaclass.simpleclass.Task_8_Customer;

public class View {

    /*
     *  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
     *  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     *  Найти и вывести:
     *  a) список покупателей в алфавитном порядке;
     *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
     */

    public static void printCustomersBase(Customers customers) {
        System.out.println("Customers base: ");
        customers.getCustomerBase().forEach(System.out::println);
        System.out.println();
    }

}
