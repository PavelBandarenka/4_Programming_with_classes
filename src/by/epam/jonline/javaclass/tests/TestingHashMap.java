package by.epam.jonline.javaclass.tests;

import java.util.*;

public class TestingHashMap {
    static HashMap<String, String []> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Privet", new String[] {"Pavel", "Olka", "Klitor"});
        map.put("Poka", new String[] {"Vaza", "Jopa", "Stol"});

       // for(Map.Entry<String, String []> each : map.entrySet()) {
            String [] values = map.get("Privet");
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);


    }

}
