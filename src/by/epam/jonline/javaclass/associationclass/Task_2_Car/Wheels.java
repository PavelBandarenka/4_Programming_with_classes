package by.epam.jonline.javaclass.associationclass.Task_2_Car;

public class Wheels {

    /*
     *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     *  менять колесо, вывести на консоль марку автомобиля.
     */

    private boolean isNewTire;
    private final int MAX_WHEEL_SOURCE = 5;
    private int wheelSource;

    Wheels(){
        isNewTire = true;
        wheelSource = MAX_WHEEL_SOURCE;
    }
    public int getMAX_WHEEL_SOURCE() {
        return MAX_WHEEL_SOURCE;
    }
    public boolean isNewTire() {
        return isNewTire;
    }
    public int getWheelSource() {
        return wheelSource;
    }
    public void setNewTire(boolean newTire) {
        isNewTire = newTire;
    }

    public void setWheelSource(int wheelSource) {
        this.wheelSource = wheelSource;
    }
}
