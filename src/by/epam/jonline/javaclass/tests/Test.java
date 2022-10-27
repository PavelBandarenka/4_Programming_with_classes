package by.epam.jonline.javaclass.tests;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car(2500, "reed");
        Car c2 = new Car(2500, "red");
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        String s1 = "25";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
    }

}



class Car{
    int engine;
    String color;

    Car(int engine, String color){
        this.engine = engine;
        this.color = color;
    }
    public boolean equals(Object o){
        if(o instanceof Car c){
            return (engine==c.engine && color.equals(c.color));
        } else {
            return false;
        }
    }
    public String toString(){
        return "Print " + engine + " " + color;
    }
}
