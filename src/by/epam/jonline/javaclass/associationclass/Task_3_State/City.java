package by.epam.jonline.javaclass.associationclass.Task_3_State;

public class City {

    /*
     *  Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
     *  столицу, количество областей, площадь, областные центры.
     */

    private String cityName;
    private boolean isRegionalCenter = false;
    private boolean isCapital = false;

    City(String name, boolean isRegionalCenter, boolean isCapital) {
        cityName = name;
        this.isRegionalCenter = isRegionalCenter;
        this.isCapital = isCapital;
    }
    City(String name){
        cityName = name;
    }

    public String getCityName() {
        return cityName;
    }
    public boolean isRegionalCenter() {
        return isRegionalCenter;
    }
    public boolean isCapital() {
        return isCapital;
    }
    public void setCityName(String cityName) {this.cityName = cityName;}
    public void setRegionalCenter(boolean regionalCenter) {isRegionalCenter = regionalCenter;}
    public void setCapital(boolean capital) {isCapital = capital;}
}
