package by.epam.jonline.javaclass.simpleclass.Task_5_DecimalCounter;

public class Logic {

    /*
     *  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     *  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     *  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     *  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
     */

    public void checkPerformanceClockwise(DecimalCounter dc, int spinTimes) {

        do {dc.printCounterStateInMethods();
            dc.increaseCounter();
                spinTimes--;
            if (spinTimes==0) dc.printCounterStateInMethods();

        } while (spinTimes>0);
        System.out.println();
    }

    public void checkPerformanceCounterclockwise(DecimalCounter dc, int spinTimes) {
        do {dc.printCounterStateInMethods();
            dc.decreaseCounter();
            spinTimes--;
            if (spinTimes==0) dc.printCounterStateInMethods();

        } while (spinTimes>0);
        System.out.println();
    }
}