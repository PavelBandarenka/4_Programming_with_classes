package by.epam.jonline.javaclass.simpleclass.Task_10_Arline;

public class Main_Task10 {

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

    public static void main(String[] args) {

        AircraftDispatcher dispatcher = new AircraftDispatcher();

        dispatcher.addAirline(new Airline("Moscow", 58, "SuperJet100", new Clock(18, 25), "monday"));
        dispatcher.addAirline(new Airline("Moscow", 99, "А380", new Clock(11, 30), "friday"));
        dispatcher.addAirline(new Airline("Tokyo", 20, "А380", new Clock(13, 45), "monday"));
        dispatcher.addAirline(new Airline("Moscow", 78, "SuperJet100", new Clock(9, 0), "friday"));
        dispatcher.addAirline(new Airline("Singapore", 55, "SuperJet100", new Clock(22, 10), "tuesday"));

        View.printAirlinesList(dispatcher);

        dispatcher.showAirlinesByDestination("Moscow");

        dispatcher.showAirlinesByWeekDay("monday");

        dispatcher.showAirlinesByWeekDayAndTime("friday", 8, 0);

        dispatcher.showAirlinesByWeekDayAndTime("sunday", 18, 0);

    }
}
