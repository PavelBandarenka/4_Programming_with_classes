package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

public class Train {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
     */

    private final String destination;
    private final int trainNumber;
    private final Clock departureTime;

    public Train(String destination, int trainNumber, Clock departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getDepartureHour() {
        return departureTime.getHour();
    }

    public int getDepartureMinute() {
        return departureTime.getMinute();
    }

    @Override
    public String toString() {
        return "Train{" +
               "destination= '" + destination + '\'' +
               ", trainNumber= " + trainNumber +
               ", departureTime= " + departureTime.getHour() + ":" + departureTime.getMinute() +
               '}';
    }
}
