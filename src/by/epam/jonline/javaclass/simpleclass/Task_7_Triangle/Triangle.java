package by.epam.jonline.javaclass.simpleclass.Task_7_Triangle;

public class Triangle {

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

    private final int sideA;
    private final int sideB;
    private final int sideC;

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
