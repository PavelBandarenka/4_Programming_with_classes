package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

public class Main_Task4 {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
     */

    public static void main(String[] args) {

        View view = new View();
        Logic logic = new Logic();
        int trainNumber;

        Depot depot = new Depot();

        depot.addTrains(new Train("Minsk", 100, new Clock(11, 50)),
                new Train("Berlin", 55, new Clock(22, 45)),
                new Train("Minsk", 11, new Clock(11, 10)),
                new Train("Moscow", 90, new Clock(17, 10)),
                new Train("Kiev", 30, new Clock(5, 15)));


        view.printListOfTrains(depot.getDepotTrainList());

        view.printTrainsByNumber(
                logic.sortTrainsByNumber(depot.getDepotTrainList()));

        view.printByDestinationAndTime(
                logic.sortTrainsByDestinationAndTime(depot.getDepotTrainList()));

        trainNumber = logic.enterFromConsole("Enter train number>>  ");
        view.printTrain(
                logic.checkTrainByNumber(depot.getDepotTrainList()
                        , eachTrain -> eachTrain.getTrainNumber() == trainNumber));
    }
}

