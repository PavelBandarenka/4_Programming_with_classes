package by.epam.jonline.javaclass.simpleclass.Task_6_Clock;

public class View {

    /*
     *  Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
     *  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
     *  недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
     *  заданное количество часов, минут и секунд.
     */

    public void printTime(Clock clock) {
        System.out.printf("H:mm:ss  " + "%02d" + ":" + "%02d" + ":" + "%02d", clock.getHour(), clock.getMinute(),clock.getSecond());
        System.out.println();
    }

}
