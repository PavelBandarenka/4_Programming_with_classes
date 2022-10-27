package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.util.ArrayList;
import java.util.List;

public class State {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */

    private String stateName;
    private List<Region> regionList;

    State(String name) {
        stateName = name;
        regionList = new ArrayList<>();
    }
    State(){}

    //public void setStateName(String stateName) {this.stateName = stateName;}
    public void setRegionList(List<Region> regionList) {this.regionList = regionList;}
    public String getStateName() {return stateName;}
    public List<Region> getRegionList() {return regionList;}
}


