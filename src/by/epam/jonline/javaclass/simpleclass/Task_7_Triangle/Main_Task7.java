package by.epam.jonline.javaclass.simpleclass.Task_7_Triangle;

public class Main_Task7 {

    /*
     *  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
     *  площади, периметра и точки пересечения медиан.
     *
     *            /\
     *         a /  \ b
     *          /    \
     *         /______\
     *            c
     */

    public static void main(String[] args) {
        Logic logic = new Logic();
        Triangle triangle = new Triangle(6, 6, 8);
        Triangle triangle1 = new Triangle(11,15,14);



        logic.defineTriangleBySides(triangle);
        logic.triangleArea(triangle);
        logic.trianglePerimeter(triangle);
        logic.triangleMedian(triangle);

    }
}
