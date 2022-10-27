package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.function.Predicate;

public class TourChoiseSelector {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    private void showTourFiltered(TouristVoucher [] touristVouchers, Predicate <TouristVoucher> check) {
        int count = 0;
        TouristVoucher[] tV1 = new TouristVoucher[touristVouchers.length];
        for (TouristVoucher each : touristVouchers) {
            if (check.test(each)) {
                tV1[count] = each;
                count++;
            }
        }
        printResult(tV1,count);
    }

    private void printResult (TouristVoucher [] touristVouchers, int count){
            if (count > 0) {
                for (TouristVoucher each : touristVouchers) {
                    if (each!=null)System.out.println(each);
                }
            } else System.out.println("No tours");
        }


    public void showTourTypeFiltered(TouristVoucher [] touristVouchers, String type) {
        showTourFiltered(touristVouchers, each -> each.getTourType().equals(type));
    }
    public void showNutritionFiltered(TouristVoucher [] touristVouchers, String nutrition) {
        showTourFiltered(touristVouchers, each -> each.getTourNutrition().equals(nutrition));
    }
    public void showTransportFiltered(TouristVoucher [] touristVouchers, String transport) {
        showTourFiltered(touristVouchers, each -> each.getTourTransport().equals(transport));
    }
    public void showCountryFiltered(TouristVoucher [] touristVouchers, String country) {
        showTourFiltered(touristVouchers, each -> each.getCountry().equals(country));
    }
    public void showCityFiltered(TouristVoucher [] touristVouchers, String city) {
        showTourFiltered(touristVouchers, each -> each.getCity().equals(city));
    }
}
