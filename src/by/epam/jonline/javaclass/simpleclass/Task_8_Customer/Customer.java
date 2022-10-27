package by.epam.jonline.javaclass.simpleclass.Task_8_Customer;

public class Customer {

    /*
     *  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
     *  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     *  Найти и вывести:
     *  a) список покупателей в алфавитном порядке;
     *  b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
     */

    private final int id;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final int creditCard;
    private final int bankAccount;

    private static int uniqueID = 1;

    public Customer(String surname, String name, String patronymic, int creditCard, int bankAccount) {
        this.id = uniqueID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
        uniqueID++;
    }

    public String getSurname() {
        return surname;
    }

    public int getCreditCard() {
        return creditCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", creditCard=" + creditCard +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
