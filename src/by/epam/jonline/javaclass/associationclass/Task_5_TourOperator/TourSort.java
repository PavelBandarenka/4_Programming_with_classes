package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.Arrays;
import java.util.Comparator;

public class TourSort {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    public void sortByCost(TouristVoucher [] touristVoucher){
        Arrays.sort(touristVoucher, Comparator.comparingDouble(TouristVoucher ::getTourCost));
        printResult(touristVoucher);
    }
    public void sortByDays(TouristVoucher [] touristVoucher) {
        Arrays.sort(touristVoucher, Comparator.comparingDouble(TouristVoucher::getTourDays));
        printResult(touristVoucher);
    }
    public void sortByCityName(TouristVoucher [] touristVoucher) {
        Arrays.sort(touristVoucher, Comparator.comparing(TouristVoucher::getCity));
        printResult(touristVoucher);
    }

    private void printResult (TouristVoucher [] touristVoucher){
        for (TouristVoucher each : touristVoucher) {
            System.out.println(each);
        }
    }
}
