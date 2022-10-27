package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.Scanner;

public class Main_Task5 {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */


    public static void main(String[] args) {
        UserInteraction uI = new UserInteraction(15);

        Scanner scanner = new Scanner(System.in);

        uI.scannerWait(scanner);

    }
}
