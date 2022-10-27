package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.Scanner;

public class UserInteraction {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    TourSort tourSort;
    TourGenerator tourGenerator;
    TourChoiseSelector tourChoiseSelector;
    TouristVoucher[] touristVouchers;

    UserInteraction(int toursQuantity) {
        tourSort = new TourSort();
        tourGenerator = new TourGenerator();
        tourChoiseSelector = new TourChoiseSelector();
        touristVouchers = tourGenerator.touristVouchersSet(toursQuantity);
    }

    private int menu(Scanner key) {
        System.out.println();
        System.out.println("TOUR OPERATOR");
        System.out.println("1. Show tours");
        System.out.println("2. Sort tours");
        System.out.println("3. Set search parameter");
        System.out.println("4. Exit");

        int choice;

        do {
            System.out.print("Enter your choice: ");
            choice = key.nextInt();

        } while (choice < 1 || choice > 4);
        return choice;
    }

    public void scannerWait(Scanner key) {
        int choice;
        do {
            choice = menu(key);
            System.out.println();
            if (choice == 1) {
                showTours(touristVouchers);
            }
            if (choice == 2) {
                setTourSort(key);
            }
            if (choice == 3) {
                setTourChoiceSelector(key);
            }
            if (choice == 4) {
                System.out.println("Good bye");
            }
        } while (choice != 4);
    }

    private void showTours(TouristVoucher[] touristVouchers) {
        System.out.println("Tours: ");
        for (TouristVoucher each : touristVouchers) {
            System.out.println(each);

        }
    }
    private void setTourChoiceSelector(Scanner key){
        System.out.println("1. Filter by tour type");
        System.out.println("2. Filter by nutrition");
        System.out.println("3. Filter by transport");
        System.out.println("4. Filter by country");
        System.out.println("5. Filter by city");

        int choice;

        do {
            System.out.print("Select filter: ");
            choice = key.nextInt();

            if(choice == 1) {
                System.out.println("Enter exact tour type: vacation, excursion, treatment, shopping, cruise");
                String st = key.next();
                tourChoiseSelector.showTourTypeFiltered(touristVouchers, st);
            }
            if(choice == 2) {
                System.out.println("Enter exact nutrition : at your own, three times a day, all included");
                String st = key.next();
                tourChoiseSelector.showNutritionFiltered(touristVouchers, st);
            }
            if(choice == 3) {
                System.out.println("Enter exact transport type: train, airplane, bus");
                String st = key.next();
                tourChoiseSelector.showTransportFiltered(touristVouchers, st);
            }
            if(choice == 4) {
                System.out.println("Enter exact Country: Turkey, Italy, France");
                String st = key.next();
                tourChoiseSelector.showCountryFiltered(touristVouchers, st);
            }
            if(choice == 5) {
                System.out.println("Enter exact city: Istanbul, Ankara, Izmir, Rome, Milan, Naples, Paris, Marseille, Nice");
                String st = key.next();
                tourChoiseSelector.showCityFiltered(touristVouchers, st);
            }
        } while (choice<1 || choice >5);

    }

    private void setTourSort(Scanner key){
        System.out.println("1. Sort by cost");
        System.out.println("2. Sort by tour duration in days");
        System.out.println("3. Sort by city name (natural order)");

        int choice;

        do{
            System.out.print("Make your choice: ");
            choice = key.nextInt();

            if (choice ==1){
                tourSort.sortByCost(touristVouchers);
            }
            if (choice ==2){
                tourSort.sortByDays(touristVouchers);
            }
            if (choice ==3){
                tourSort.sortByCityName(touristVouchers);
            }
        } while (choice<1 || choice>3);
    }
}
