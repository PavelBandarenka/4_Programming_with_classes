package by.epam.jonline.javaclass.simpleclass.Task_1_TwoVariables;

public class Test1 {

    /*
     *  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
     *  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
     *  наибольшее значение из этих двух переменных.
     */

    private int a;
    private int b;

    Test1() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printAB(Test1 obj) {
        System.out.println(obj.toString());
    }

    public void printSum(int sum) {
        System.out.println("Sum a+b = " + sum);
    }

    public void printMax(int max) {
        System.out.println("Max from a,b = " + max);
    }

    @Override
    public String toString() {
        return "Test1: " +
               "a = " + a +
               ", b = " + b +
               " ";
    }
}
