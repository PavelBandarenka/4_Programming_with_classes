package by.epam.jonline.javaclass.simpleclass.Task_1_TwoVariables;

public class Logic {

    /*
     *  Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих
     *  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
     *  наибольшее значение из этих двух переменных.
     */

    public int sum(int a, int b) {
        return a + b;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else return 0;
    }
}
