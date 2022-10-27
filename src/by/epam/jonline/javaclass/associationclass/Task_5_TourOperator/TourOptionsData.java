package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TourOptionsData {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    static List<String> tourType =Arrays.asList("vacation", "excursion", "treatment", "shopping", "cruise");
    static List<String> tourNutrition = Arrays.asList("at your own", "three times a day", "all included");
    static List<String> tourTransport = Arrays.asList("train","airplane","bus");
    static List<Double> tourCost = Arrays.asList(500.00, 1000.00, 1500.00, 2000.00);
    static List<Integer> tourDays = Arrays.asList(3, 5, 7, 10, 20);
    static List<String> Country = Arrays.asList("Turkey","Italy","France");
    static HashMap<String, String []> tourDestination = new HashMap<>() {
        {
            put("Turkey", new String[]{"Istanbul", "Ankara", "Izmir"});
            put("Italy", new String[]{"Rome", "Milan", "Naples"});
            put("France", new String[]{"Paris", "Marseille", "Nice"});
        }
    };
}

