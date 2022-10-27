package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

import java.util.List;

public class View {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
     */

    void printTrain(Train train) {
        System.out.println(train);
    }

    void printListOfTrains(List<Train> trains) {
        System.out.println("List of trains: ");
        trains.forEach(System.out::println);
    }

    void printTrainsByNumber(List<Train> trains) {
        System.out.println("List of trains sorted by number: ");
        trains.forEach(System.out::println);
    }

    void printByDestinationAndTime(List<Train> trains) {
        System.out.println("List of trains sorted by destination and time : ");
        trains.forEach(System.out::println);
    }
}
