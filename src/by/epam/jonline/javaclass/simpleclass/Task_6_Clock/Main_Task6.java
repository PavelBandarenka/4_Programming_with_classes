package by.epam.jonline.javaclass.simpleclass.Task_6_Clock;

public class Main_Task6 {

    /*
     *  Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
     *  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
     *  недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
     *  заданное количество часов, минут и секунд.
     */

    public static void main(String[] args) {

        View view = new View();
        Logic logic = new Logic();
        Clock clock = new Clock();

        clock.setTime(1,22 ,5);

        view.printTime(clock);
        System.out.println("___________________");

        logic.addSeconds(clock,57);

        view.printTime(clock);
        System.out.println("___________________");

        logic.addMinutes(clock,45);
        view.printTime(clock);
        System.out.println("___________________");

        logic.addHours(clock,10);
        view.printTime(clock);
        System.out.println("___________________");

        logic.addTimeInterval(clock,1,58,21);
        view.printTime(clock);
        System.out.println("___________________");

        logic.addTimeInterval(clock,22,99,21);
        view.printTime(clock);
        System.out.println("___________________");
    }
}

