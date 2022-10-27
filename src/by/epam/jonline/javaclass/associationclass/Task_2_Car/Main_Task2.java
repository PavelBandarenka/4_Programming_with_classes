package by.epam.jonline.javaclass.associationclass.Task_2_Car;

public class Main_Task2 {

    /*
     *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     *  менять колесо, вывести на консоль марку автомобиля.
     */

    public static void main(String[] args) {
    Car car = new Car("Mustang");
    car.getCarControlBlock().showCarModel(car);
    car.getCarControlBlock().driveDistance(10, car);
    car.getCarControlBlock().driveDistance(1, car);
    car.getCarControlBlock().refuelCar(car, 15);
    car.getCarControlBlock().driveDistance(5, car);
    car.getCarControlBlock().changeWheel(car);
    car.getCarControlBlock().driveDistance(10, car);
    }
}
