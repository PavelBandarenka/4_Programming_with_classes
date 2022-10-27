package by.epam.jonline.javaclass.simpleclass.Task_7_Triangle;

import java.util.Arrays;


public class Logic {

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

    private boolean checkIfTriangleExist(Triangle tr) {
        if (tr.getSideA() < tr.getSideB() + tr.getSideC()
            & tr.getSideB() < tr.getSideA() + tr.getSideC()
            & tr.getSideC() < tr.getSideA() + tr.getSideB()) {
            return true;
        } else {
            System.out.println();
            return false;
        }
    }

    public void defineTriangleBySides(Triangle tr) {
        int a = tr.getSideA();
        int b = tr.getSideB();
        int c = tr.getSideC();

        System.out.println("Triangle - " + " a = " + a + "; b = " + b + "; c = " + c + ";");
        if (checkIfTriangleExist(tr)) {
            if (checkIfEquilateral(a, b, c)) {
                System.out.print(" Sides == ");
            } else if (checkIfScalene(a, b, c)) {
                System.out.print("Sides != ");
                if (checkIfIsoscelesIfAcuteTriangle(tr)) {
                    System.out.println(" some angle <90");
                } else if (checkIfIsoscelesIfObtuseTriangle(tr)) {
                    System.out.println("some angle >90");
                } else if (checkIfIsoscelesIfRightTriangle(tr)) {
                    System.out.println("some angle =90");
                }
            } else if (checkIfIsosceles(a, b, c)) {
                System.out.print("Isosceles triangle. ");
                if (checkIfScaleneIfAcuteTriangle(tr)) {
                    System.out.println("Acute triangle. ");
                } else if (checkIfScaleneIfObtuseTriangle(tr)) {
                    System.out.println("Obtuse triangle. ");
                } else if (checkIfScaleneIfRightTriangle(tr)) {
                    System.out.println("Right triangle. ");
                }
            } else {
                System.out.println("Oops Logic down !!! cant recognize type by sides");
                ;
            }
        } else System.out.println("Impossible to create a triangle. Check the size of the sides");
    }

    private int[] sortTriangleSides(Triangle tr) {
        int[] num = new int[]{tr.getSideA(), tr.getSideB(), tr.getSideC()};
        Arrays.sort(num);
        return num;
    }

    private boolean checkIfEquilateral(int a, int b, int c) {  // равносторонний
        return a == c && b == c;
    }

    private boolean checkIfIsosceles(int a, int b, int c) {    // равнобедренный
        return a == b | a == c | b == c;
    }

    private boolean checkIfIsoscelesIfAcuteTriangle(Triangle tr) {    // равнобедренный остроугольный
        int[] side = sortTriangleSides(tr);
        return 45 > Math.toDegrees(Math.acos((double) side[0] / (2 * side[1])));
    }

    private boolean checkIfIsoscelesIfObtuseTriangle(Triangle tr) {    // равнобедренный тупоугольный
        int[] side = sortTriangleSides(tr);
        return 45 < Math.toDegrees(Math.acos((double) side[0] / (2 * side[1])));
    }

    private boolean checkIfIsoscelesIfRightTriangle(Triangle tr) {    // равнобедренный прямоугольный
        int[] side = sortTriangleSides(tr);
        return 45 == Math.toDegrees(Math.acos((double) side[0] / (2 * side[1])));
    }

    private boolean checkIfScalene(int a, int b, int c) {      // разносторонний
        return a != b && a != c && b != c;
    }

    private boolean checkIfScaleneIfAcuteTriangle(Triangle tr) {      // разносторонний остроугольный
        int[] side = sortTriangleSides(tr);
        return side[2] * side[2] < side[1] * side[1] + side[0] * side[0];
    }

    private boolean checkIfScaleneIfObtuseTriangle(Triangle tr) {      // разносторонний тупоугольный
        int[] side = sortTriangleSides(tr);
        return side[2] * side[2] > side[1] * side[1] + side[0] * side[0];
    }

    private boolean checkIfScaleneIfRightTriangle(Triangle tr) {      // разносторонний прямоугольный
        int[] side = sortTriangleSides(tr);
        return side[2] * side[2] == side[1] * side[1] + side[0] * side[0];
    }

    public void trianglePerimeter(Triangle tr) {
        int perimeter = tr.getSideA() + tr.getSideB() + tr.getSideC();
        System.out.println("Perimeter = " + perimeter);
    }

    public void triangleArea(Triangle tr) {
        double a = tr.getSideA();
        double b = tr.getSideB();
        double c = tr.getSideC();

        double p = (a + b + c) / 2;
        double area = Math.round((Math.sqrt(p * (p - a) * (p - b) * (p - c))) * 100.0) / 100.0;
        System.out.println("Area = " + area);
    }

    public void triangleMedian(Triangle tr) {
        double a = tr.getSideA();
        double b = tr.getSideB();
        double c = tr.getSideC();

        double median1 = Math.round(Math.sqrt((2 * b * b + 2 * c * c - a * a) / 4) * 100.0) / 100.0;
        double median2 = Math.round(Math.sqrt((2 * a * a + 2 * c * c - b * b) / 4) * 100.0) / 100.0;
        double median3 = Math.round(Math.sqrt((2 * a * a + 2 * b * b - c * c) / 4) * 100.0) / 100.0;
        System.out.println("Median 1 = " + median1 + "; Median 2 = " + median2 + "; Median 3 = " + median3 + ";");
    }
}