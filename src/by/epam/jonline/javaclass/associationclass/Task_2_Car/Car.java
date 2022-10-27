package by.epam.jonline.javaclass.associationclass.Task_2_Car;

import java.util.List;

public class Car {

    /*
     *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     *  менять колесо, вывести на консоль марку автомобиля.
     */

    final private String name;
    final private Engine engine;
    final private Wheels wheels;
    final private CarControlBlock carControlBlock;

    Car (String name) {
        this.name = name;
        engine = new Engine();
        wheels = new Wheels();
        carControlBlock = new CarControlBlock();
    }
    public String getName() {
        return name;
    }
    public Engine getEngine() {
        return engine;
    }
    public Wheels getWheels() {
        return wheels;
    }
    public CarControlBlock getCarControlBlock() {
        return carControlBlock;
    }
}