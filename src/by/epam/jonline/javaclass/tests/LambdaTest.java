package by.epam.jonline.javaclass.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("privet");
        list.add("ok");
        list.add("kak dela?");

        int [] array = {3,2,2,5,6};
        array = Arrays.stream(array).map(el -> el+3).toArray();
        System.out.println(Arrays.toString(array));

       // System.out.println(list.stream().map(listElement ->listElement +"1").collect(Collectors.toList()));
    }
}
