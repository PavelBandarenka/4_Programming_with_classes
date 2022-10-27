package by.epam.jonline.javaclass.simpleclass.Task_10_Arline;

public class Airline {

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

    private final String destination;
    private final int flightNumber;
    private final String aircraftType;
    private final Clock departureTime;
    private final String weekDay;

    Airline(String destination, int flightNumber, String aircraftType, Clock departureTime, String weekDay) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    public String getDestination() {
        return destination;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public int getDepartureHour() {
        return departureTime.getHour();
    }

    public int getDepartureMinute() {
        return departureTime.getMinute();
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType=" + aircraftType +
                ", departureTime= " + String.format("%02d", getDepartureHour()) + ":" + String.format("%02d", getDepartureMinute()) +
                ", weekDay='" + weekDay + '\'' +
                '}';
    }
}
