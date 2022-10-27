package by.epam.jonline.javaclass.simpleclass.Task_6_Clock;

public class Logic {

    /*
     *  Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
     *  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
     *  недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
     *  заданное количество часов, минут и секунд.
     */


    public void addTimeInterval(Clock clock, int hour, int min, int sec) {
        System.out.println("Clock : " + hour + " hours, " + min + " minutes, " + sec + " seconds," + " interval added");
        countTime(clock, intervalInSeconds(hour, min, sec));
    }

    private int intervalInSeconds(int hour, int min, int sec) {
        return 3600 * hour + 60 * min + sec;
    }

    public void addHours(Clock clock, int hour) {
        System.out.println("Clock : " + hour + " hours added" );
        countTime(clock, 3600 * hour);
    }

    public void addMinutes(Clock clock, int minute) {
        System.out.println("Clock : " + minute + " minutes added" );
        countTime(clock, 60 * minute);
    }

    public void addSeconds(Clock clock, int second) {
        System.out.println("Clock : " + second + " seconds added" );
        countTime(clock, second);
    }

    private void countTime(Clock clock, int seconds) {
        int totalSeconds;
        int hour;
        int min;
        int sec;

        totalSeconds = clockTimeInSeconds(clock) + seconds;
        if (totalSeconds <= clock.getCLOCK_CAPACITY()) {
            hour = totalSeconds / 3600;
            min = (totalSeconds - hour * 3600) / 60;
            sec = (totalSeconds - hour * 3600 - min * 60);
            clock.setTime(hour, min, sec);
        } else {
            setDefault(clock);
        }
    }

    private int clockTimeInSeconds(Clock clock) {
        return clock.getHour() * 3600 +
               clock.getMinute() * 60 +
               clock.getSecond();
    }

    private void setDefault(Clock clock) {
        System.out.println("Too large values. Watches overflow. Values set to default");
        clock.setTime(0, 0, 0);
    }
}