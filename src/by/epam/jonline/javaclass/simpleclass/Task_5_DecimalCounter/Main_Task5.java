package by.epam.jonline.javaclass.simpleclass.Task_5_DecimalCounter;

public class Main_Task5 {

    /*
     *  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     *  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     *  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     *  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
     */

    public static void main(String[] args) {
        Logic logic = new Logic();
        DecimalCounter dc0 = new DecimalCounter();
        DecimalCounter dc = new DecimalCounter(0, 9, 3);

        logic.checkPerformanceClockwise(dc, 12);

        logic.checkPerformanceCounterclockwise(dc, 14);

        dc.printCounterStateDemo();

    }
}
