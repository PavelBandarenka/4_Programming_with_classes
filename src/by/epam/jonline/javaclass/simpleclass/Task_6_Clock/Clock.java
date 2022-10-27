package by.epam.jonline.javaclass.simpleclass.Task_6_Clock;

public class Clock {

    /*
     *  Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
     *  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
     *  недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
     *  заданное количество часов, минут и секунд.
     */

    private int hour;
    private int minute;
    private int second;

    Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        System.out.println("Clock set to : ");
        if (checkHour(hour)) {
            this.hour = hour;
        }
        if (checkMinute(minute)) {
            this.minute = minute;
        }
        if (checkSecond(second)) {
            this.second = second;
        }
    }

    private boolean checkHour(int hour) {
        int HOUR_MIN = 0;
        int HOUR_MAX = 24;
        return hour < HOUR_MAX && hour >= HOUR_MIN;
    }

    private boolean checkMinute(int minute) {
        int MINUTE_MIN = 0;
        int MINUTE_MAX = 60;
        return minute < MINUTE_MAX && minute >= MINUTE_MIN;
    }

    private boolean checkSecond(int second) {
        int SECOND_MIN = 0;
        int SECOND_MAX = 60;
        return second < SECOND_MAX && second >= SECOND_MIN;
    }
    public int getCLOCK_CAPACITY() {
        return 86400;
    }
}
