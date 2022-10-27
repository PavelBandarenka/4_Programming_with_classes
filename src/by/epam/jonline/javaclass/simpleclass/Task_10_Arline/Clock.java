package by.epam.jonline.javaclass.simpleclass.Task_10_Arline;

public class Clock {

    /*
     *  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     *  и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
     *  методами. Задать критерии выбора данных и вывести эти данные на консоль.
     *  Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     *  Найти и вывести:
     *  a) список рейсов для заданного пункта назначения;
     *  b) список рейсов для заданного дня недели;
     *  c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
     */

    private final int hour;
    private final int minute;

    private static final int MAX_HOUR = 24;
    private static final int MIN_HOUR = 0;
    private static final int MAX_MINUTE = 60;
    private static final int MIN_MINUTE = 0;

    Clock(int hour, int minute) {
        if (checkHour(hour)) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("Hour input is out of range. Hour set by default to '0'");
        }
        if (checkMinute(minute)) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("Minute input is out of range. Minute set by default to '0'");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public boolean checkHour(int hour) {
        return (hour >= MIN_HOUR && hour <= MAX_HOUR);
    }

    public boolean checkMinute(int minute) {
        return (minute >= MIN_MINUTE && minute <= MAX_MINUTE);
    }
}