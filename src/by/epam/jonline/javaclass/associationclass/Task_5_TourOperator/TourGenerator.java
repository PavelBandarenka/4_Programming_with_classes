package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.*;

public class TourGenerator {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    private TouristVoucher generateTour(){

        TouristVoucher touristVoucher = new TouristVoucher() {};
        Random random = new Random();

        touristVoucher.setTourType(TourOptionsData.tourType.get(random.nextInt(TourOptionsData.tourType.size())));
        touristVoucher.setTourNutrition(TourOptionsData.tourNutrition.get(random.nextInt(TourOptionsData.tourNutrition.size())));
        touristVoucher.setTourTransport(TourOptionsData.tourTransport.get(random.nextInt(TourOptionsData.tourTransport.size())));
        touristVoucher.setTourCost(TourOptionsData.tourCost.get(random.nextInt(TourOptionsData.tourCost.size())));
        touristVoucher.setTourDays(TourOptionsData.tourDays.get(random.nextInt(TourOptionsData.tourDays.size())));


        String country = randomHashMapKey(TourOptionsData.tourDestination);
        touristVoucher.setCountry(country);

        touristVoucher.setCity(randomHashMapValue(TourOptionsData.tourDestination, country));

    return touristVoucher;
    }

    private String randomHashMapValue(HashMap<String, String []> hashMap, String key){
        Random random = new Random();
        String [] value = hashMap.get(key);
        return value[random.nextInt(value.length)];
    }

    private String randomHashMapKey(HashMap<String, String []> hashMap){
    Random random = new Random();
    ArrayList <String> keyCopy = new ArrayList<>(hashMap.keySet());
    return keyCopy.get(random.nextInt(keyCopy.size()));
    }

    public TouristVoucher [] touristVouchersSet (int qauntity) {
        TouristVoucher [] set = new TouristVoucher[qauntity];
        for (int i = 0; i < qauntity; i++ ) {
            set[i] = generateTour();
        }
        return set;
    }
}
