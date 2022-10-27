package by.epam.jonline.javaclass.simpleclass.Task_4_Train;

public class Clock {

    /*
     *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     *  Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     *  номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     *  Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     *  назначения должны быть упорядочены по времени отправления.
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
