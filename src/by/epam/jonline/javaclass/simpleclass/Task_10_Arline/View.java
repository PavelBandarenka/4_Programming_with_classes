package by.epam.jonline.javaclass.simpleclass.Task_10_Arline;

public class View {

    /*
     *  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
     *  методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     *  Найти и вывести:
     *  a) список рейсов для заданного пункта назначения;
     *  b) список рейсов для заданного дня недели;
     *  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
     */

    public static void printAirlinesList (AircraftDispatcher dispatcher) {
        System.out.println("List of Airlines:");
        dispatcher.getAirlinesList().forEach(System.out::println);
        System.out.println();
    }
}
