package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Depot {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
     */

    private static final int NUMBER_OF_TRAINS = 5;
    private final List<Train> depot;

    public Depot() {

        this.depot = new ArrayList<>(5);
    }

    public void addTrains(Train... train) {
        if (depot.size() <= NUMBER_OF_TRAINS) {
            depot.addAll(Arrays.asList(train).subList(0, NUMBER_OF_TRAINS));
        }
    }

    public List<Train> getDepotTrainList() {
        return depot;
    }
}

