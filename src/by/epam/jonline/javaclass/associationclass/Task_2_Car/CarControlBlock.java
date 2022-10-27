package by.epam.jonline.javaclass.associationclass.Task_2_Car;

public class CarControlBlock {

    /*
     *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
     *  менять колесо, вывести на консоль марку автомобиля.
     */

    private void startEngine (Car car) {
        if(!car.getEngine().checkEngineStatus())System.out.println("Engine started");
        car.getEngine().runEngine();
    }

    private void turnOffEngine (Car car) {
        if(car.getEngine().checkEngineStatus())System.out.println("Engine stopped");
        car.getEngine().stopEngine();
    }

    private boolean checkFuel(Car car){
        if(car.getEngine().getFuel() > 0);
        else System.out.println("car is out of fuel!");
        return car.getEngine().getFuel() > 0;
    }
    private boolean checkTires(Car car){
        return car.getWheels().isNewTire();
    }

    public void changeWheel(Car car){
        car.getWheels().setNewTire(true);
        car.getWheels().setWheelSource(car.getWheels().getMAX_WHEEL_SOURCE());
        System.out.println("Wheel changed!");
    }

    public void refuelCar(Car car, int amount){
        if (amount>car.getEngine().getFUEL_MAX_CAPACITY()){
            car.getEngine().setFuel(car.getEngine().getFUEL_MAX_CAPACITY());
            System.out.println("Fuel added: "+ car.getEngine().getFUEL_MAX_CAPACITY());
        } else if (amount>0){
            car.getEngine().setFuel(amount);
            System.out.println("Fuel added: "+ amount);
        } else car.getEngine().setFuel(0);
    }

    public void driveDistance(int distance, Car car) {
        System.out.println("Trying to start engine...");
        if (car.getEngine().getFuel() == 0) {
            System.out.println("Cant drive, no fuel!");
            return;
        }
        if (!checkTires(car)) {
            System.out.println("Cant drive, change wheel!");
            return;
        }

        if(!car.getEngine().checkEngineStatus()) startEngine(car);
        System.out.println("Amount of fuel: " + car.getEngine().getFuel());
        int count = 1;
        while (checkFuel(car) && checkTires(car)){
            car.getWheels().setWheelSource(car.getWheels().getWheelSource()-1);
            if (car.getWheels().getWheelSource() == 0) car.getWheels().setNewTire(false);
            car.getEngine().setFuel(car.getEngine().getFuel()-1);
            System.out.println("Distance driven: " + (count++) );
        }
        if (!checkTires(car)) System.out.println("Cant drive, change wheel!");
        if (car.getEngine().getFuel() == 0 | !checkTires(car)) turnOffEngine(car);
    }
    public void showCarModel(Car car){
        System.out.println("Car model: " + car.getName());
        System.out.println("_____________________________");
    }
}
