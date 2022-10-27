package by.epam.jonline.javaclass.simpleclass.Task_8_Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customers {

    /*
     *  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
     *  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     *  Найти и вывести:
     *  a) список покупателей в алфавитном порядке;
     *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
     */

    private final List<Customer> customerBase;

    Customers() {
        this.customerBase = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customerBase.add(customer);
    }

    public List<Customer> getCustomerBase() {
        return customerBase;
    }

    public Customers sortByAlphabetic(Customers customers) {
        Customers customerBaseTest = new Customers();
        customerBaseTest.getCustomerBase().addAll(customers.getCustomerBase());
        customerBaseTest.getCustomerBase().sort(Comparator.comparing(Customer::getSurname));
        return customerBaseTest;
    }

    public void showByCreditCardRange(int rangeFrom, int rangeTo) {
        System.out.println("List of customers: with credit cards in range: " + "from " + rangeFrom + ", to " + rangeTo + ";");
        for (Customer each : this.getCustomerBase()) {
            if (each.getCreditCard() >= rangeFrom && each.getCreditCard() <= rangeTo) {
                System.out.println(each);
            }
        }
        System.out.println();
    }

}
