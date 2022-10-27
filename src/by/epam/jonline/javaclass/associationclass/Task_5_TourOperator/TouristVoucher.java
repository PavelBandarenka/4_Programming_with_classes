package by.epam.jonline.javaclass.associationclass.Task_5_TourOperator;

import java.util.Objects;

public class TouristVoucher {

    /*
     *  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     *  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     *  возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
     */

    private String tourType;
    private String tourNutrition;
    private String tourTransport;
    private double tourCost;
    private int tourDays;
    private String Country;
    private String City;

    public TouristVoucher(String tourType, String tourNutrition, String tourTransport, double tourCost, int tourDays, String country, String city) {
        this.tourType = tourType;
        this.tourNutrition = tourNutrition;
        this.tourTransport = tourTransport;
        this.tourCost = tourCost;
        this.tourDays = tourDays;
        Country = country;
        City = city;
    }
    TouristVoucher(){
    }
    public void setTourType(String tourType) {this.tourType = tourType;}
    public void setTourNutrition(String tourNutrition) {this.tourNutrition = tourNutrition;}
    public void setTourTransport(String tourTransport) {this.tourTransport = tourTransport;}
    public void setTourCost(double tourCost) {this.tourCost = tourCost;}
    public void setTourDays(int tourDays) {this.tourDays = tourDays;}
    public void setCountry(String country) {Country = country;}
    public void setCity(String city){City = city;};
    public String getTourType() {return tourType;}
    public String getTourNutrition() {return tourNutrition;}
    public String getTourTransport() {return tourTransport;}
    public double getTourCost() {return tourCost;}
    public int getTourDays() {return tourDays;}
    public String getCountry() {return Country;}
    public String getCity() {return City;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristVoucher that = (TouristVoucher) o;
        return Double.compare(that.tourCost, tourCost) == 0 && tourDays == that.tourDays && Objects.equals(tourType, that.tourType) && Objects.equals(tourNutrition, that.tourNutrition) && Objects.equals(tourTransport, that.tourTransport) && Objects.equals(Country, that.Country) && Objects.equals(City, that.City);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tourType, tourNutrition, tourTransport, tourCost, tourDays, Country, City);
    }
    @Override
    public String toString() {
        return "TouristVoucher{" +
                "tourType='" + tourType + '\'' +
                ", tourNutrition='" + tourNutrition + '\'' +
                ", tourTransport='" + tourTransport + '\'' +
                ", tourCost=" + tourCost +
                ", tourDays=" + tourDays +
                ", Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
