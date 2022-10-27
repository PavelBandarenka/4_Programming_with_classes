package by.epam.jonline.javaclass.associationclass.Task_3_State;

import java.util.ArrayList;
import java.util.List;

public class Region {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */



    private String regionName;
    private double area;
    private List <District> districtList;

    Region(String name, double area, List <District> districtList ) {
        regionName = name;
        this.area = area;
        this.districtList = districtList;
    }
    Region(String name, double area) {
        regionName = name;
        this.area = area;
        districtList = new ArrayList<>();
    }
    Region(){}


    public void setRegionName(String regionName) {this.regionName = regionName;}
    public void setArea(double area) {this.area = area;}
    public void setDistrictList(List<District> districtList) {this.districtList = districtList;}
    public String getRegionName() {
        return regionName;
    }
    public double getArea() {
        return area;
    }
    public List<District> getDistrictList() {
        return districtList;
    }
}
