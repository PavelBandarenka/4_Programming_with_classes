package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.util.ArrayList;
import java.util.List;

public class District {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */


    private String districtName;
    private List<City> cityList;

    District(String name, List<City> cityList) {
        districtName = name;
        this.cityList = cityList;
    }
    District(String name){
        districtName = name;
        cityList = new ArrayList<>();
    }

    District(){}

    public String getDistrictName() {return districtName;}
    public List<City> getCityList() {return cityList;}
    public void setDistrictName(String districtName) {this.districtName = districtName;}
    public void setCityList(List<City> cityList) {this.cityList = cityList;}
}



