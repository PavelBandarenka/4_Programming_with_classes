package by.epam.jonline.javaclass.simpleclass.Task_8_Customer;

public class Main_Task8 {

    /*
     *  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
     *  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     *  Найти и вывести:
     *  a) список покупателей в алфавитном порядке;
     *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
     */

    public static void main(String[] args) {

        Customers customerBase = new Customers();

        customerBase.addCustomer(new Customer("Bond", "Pavel", "Gomelskiy", 2573, 7073));
        customerBase.addCustomer(new Customer("Swed", "Jack", "Jackovich", 4044, 7075));
        customerBase.addCustomer(new Customer("Tongue", "Katy", "Andreevna", 3322, 2028));
        customerBase.addCustomer(new Customer("Lock", "Ann", "Artemovna", 617, 5064));
        customerBase.addCustomer(new Customer("Boss", "Lewis", "Lewisovich", 2525, 1011));

        View.printCustomersBase(customerBase.sortByAlphabetic(customerBase));

        customerBase.showByCreditCardRange(1000, 3000);

    }
}




