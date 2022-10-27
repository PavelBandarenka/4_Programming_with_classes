package by.epam.jonline.javaclass.simpleclass.Task_5_DecimalCounter;

public class DecimalCounter {

    /*
     *  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     *  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     *  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     *  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
     */

    private int counter;
    private int max;
    private int min;

    public DecimalCounter() {
        this.counter = 0;
        this.min = 0;
        this.max = 9;
        System.out.println("Default DC initialized");
        printTable();
    }

    public DecimalCounter(int min, int max, int counter) {

        if (checkIfSame(min, max)) {
            this.min = checkMin(min, max);
            this.max = checkMax(min, max);
            this.counter = checkCounter(counter);
            System.out.println("Custom DC initialized");
            printTable();
        }
    }

    private int checkCounter(int counter) {
        if (counter > max) {
            return this.counter = min;
        } else if (counter < min) {
            return this.counter = max;
        } else {
            return this.counter = counter;
        }
    }

    private int checkMax(int min, int max) {
        return Math.max(max, min);
    }

    private int checkMin(int min, int max) {
        return Math.min(max, min);
    }

    private boolean checkIfSame(int min, int max) {
        return min != max;
    }

    public void increaseCounter() {
        this.counter++;
        checkCounter(this.counter);
    }

    public void decreaseCounter() {
        this.counter--;
        checkCounter(this.counter);
    }

    public void printCounterStateInMethods() {
        System.out.print("" + "'" + counter + "'");
    }

    public void printCounterStateDemo() {
        System.out.println();
        System.out.print("DC state: " + "'" + counter + "'");
        System.out.println();
    }

    public void printTable() {
        System.out.println("DC Table:" + "\n" +
                           "Min value = " + min + "\n" +
                           "Counter   = " + counter + "\n" +
                           "Max value = " + max + "\n" +
                           "---------------");
    }
}


