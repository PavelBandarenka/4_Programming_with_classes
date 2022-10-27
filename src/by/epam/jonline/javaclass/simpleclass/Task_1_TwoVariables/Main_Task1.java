package by.epam.jonline.javaclass.simpleclass.Task_1_TwoVariables;

public class Main_Task1 {

    /*
     *  Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих
     *  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
     *  наибольшее значение из этих двух переменных.
     */

    public static void main(String[] args) {

        Logic logic = new Logic();
        Test1 test1 = new Test1();

        test1.setA(22);
        test1.setB(31);

        int sum;
        int max;

        sum = logic.sum(test1.getA(), test1.getB());
        max = logic.max(test1.getA(), test1.getB());

        test1.printAB(test1);
        test1.printSum(sum);
        test1.printMax(max);
    }
}
