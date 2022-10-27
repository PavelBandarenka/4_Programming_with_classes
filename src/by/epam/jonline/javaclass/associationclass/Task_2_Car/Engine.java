package by.epam.jonline.javaclass.associationclass.Task_2_Car;

public class Engine {

    /*
     *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     *  менять колесо, вывести на консоль марку автомобиля.
     */

    private boolean isRunning;
    private int fuel;

    private final int FUEL_MAX_CAPACITY = 3;

    Engine () {
        isRunning = false;
        fuel = FUEL_MAX_CAPACITY;
    }
    public int getFUEL_MAX_CAPACITY() {
        return FUEL_MAX_CAPACITY;
    }
    public boolean checkEngineStatus () {
        return isRunning;
    }
    public void runEngine() {
        isRunning = true;
    }
    public void stopEngine() {
        isRunning = false;
    }
    public int getFuel() {
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}
