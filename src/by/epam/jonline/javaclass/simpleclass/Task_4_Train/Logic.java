package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

import java.util.*;
import java.util.function.Predicate;

public class Logic {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
     */
    public int enterFromConsole(String st) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(st);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(st);
        }
        number = sc.nextInt();
        return number;
    }

    public List<Train> sortTrainsByNumber(List<Train> trains) {
        trains.sort(Comparator.comparingInt(Train::getTrainNumber));
        return trains;
    }

    public List<Train> sortTrainsByDestinationAndTime(List<Train> trains) {
        trains.sort(Comparator.comparing(Train::getDestination));
        Comparator.comparing(Train::getDestination)
                .thenComparingInt(Train::getDepartureHour)
                .thenComparingInt(Train::getDepartureMinute);
        return trains;
    }

    public Train checkTrainByNumber(List<Train> trains, Predicate<Train> check) {
        Train train = new Train("No train", 0, new Clock(0, 0));
        for (Train each : trains) {
            if (check.test(each)) {
                train = each;
            }
        }
        return train;
    }
}
