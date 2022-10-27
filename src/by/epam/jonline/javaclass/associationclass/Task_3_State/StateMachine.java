package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateMachine {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */



    public void setCapital (City city){
        city.setCapital(true);
    }

    public void setRegionalCenter(City city){
        city.setRegionalCenter(true);
    }
    public void getCapital(State state){
        int count = 0;
        for (int i = 0; i < state.getRegionList().size(); i++){
            if (state.getRegionList().get(i).getDistrictList() != null )
                for (int j = 0; j < state.getRegionList().get(i).getDistrictList().size(); j++){

                    for (int k = 0; k < state.getRegionList().get(i).getDistrictList().get(j).getCityList().size(); k++){

                        if (state.getRegionList().get(i).getDistrictList().get(j).getCityList().get(k).isCapital()){
                        System.out.println("____________________________________");
                        System.out.println("Capital is: " + state.getRegionList().get(i).getDistrictList().get(j).getCityList().get(k).getCityName());
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("____________________________________");
            System.out.println("No capital yet!");
        }
    }

    public void countRegions(State state){
        System.out.println("____________________________________");
        System.out.println("Coyntry consists of: " + state.getRegionList().size() + " regions");
    }

    public void printArea(State state){
        int area = 0;
        System.out.println("____________________________________");
        for (int i = 0; i < state.getRegionList().size(); i ++) {
            area+=state.getRegionList().get(i).getArea();
            System.out.println("Region: " + state.getRegionList().get(i).getRegionName()
                    + " Area: " + state.getRegionList().get(i).getArea());
        }
        System.out.println("Whole area is : " + area);
    }

    public void printRegionalCenter(State state){
        System.out.println("____________________________________");
        for (int i = 0; i < state.getRegionList().size(); i++){
            if (state.getRegionList().get(i).getDistrictList() != null )
                for (int j = 0; j < state.getRegionList().get(i).getDistrictList().size(); j++){

                    for (int k = 0; k < state.getRegionList().get(i).getDistrictList().get(j).getCityList().size(); k++){

                        if (state.getRegionList().get(i).getDistrictList().get(j).getCityList().get(k).isRegionalCenter()){

                            System.out.println(
                                    "Region: " + state.getRegionList().get(i).getRegionName() +
                                    " Regional center is: " + state.getRegionList().get(i).getDistrictList().get(j).getCityList().get(k).getCityName());
                        }
                    }
                }
        }
    }
}
