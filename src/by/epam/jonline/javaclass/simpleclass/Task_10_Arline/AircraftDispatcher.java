package by.epam.jonline.javaclass.simpleclass.Task_10_Arline;

import java.util.ArrayList;
import java.util.List;

public class AircraftDispatcher {

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

    private List<Airline> airlineDispatcher;

    AircraftDispatcher() {
        airlineDispatcher = new ArrayList<>();
    }

    public void addAirline(Airline airline) {
        airlineDispatcher.add(airline);
    }

    public List<Airline> getAirlinesList() {
        return airlineDispatcher;
    }

    public void showAirlinesByDestination(String destination) {
        System.out.println("List of airlines by destination: " + destination);
        for (Airline each : this.getAirlinesList()) {
            if (each.getDestination().equals(destination)) {
                System.out.println(each);
            }
        }
        System.out.println();
    }

    public void showAirlinesByWeekDay(String weekDay) {
        System.out.println("List of airlines by week day: " + weekDay);
        for (Airline each : this.getAirlinesList()) {
            if (each.getWeekDay().equals(weekDay)) {
                System.out.println(each);
            }
        }
        System.out.println();
    }

    public void showAirlinesByWeekDayAndTime(String weekDay, int hour, int minute) {

        System.out.println("List of airlines by week day: " + weekDay + ", time after " + String.format("%02d", hour) + ":" + String.format("%02d", minute));
        boolean airlinesExist = false;
        for (Airline each : this.getAirlinesList()) {
            if (each.getWeekDay().equals(weekDay)) {
                if (each.getDepartureHour() > hour) {
                    System.out.println(each);
                    airlinesExist = true;
                } else if (each.getDepartureHour() == hour) {
                    if (each.getDepartureMinute() > minute) {
                        System.out.println(each);
                        airlinesExist = true;
                    }
                }
            }
        }
        if (!airlinesExist) {
            System.out.println("No airlines on " + weekDay + " after " + String.format("%02d", hour) + ":" + String.format("%02d", minute));
        }
        System.out.println();
    }
}
