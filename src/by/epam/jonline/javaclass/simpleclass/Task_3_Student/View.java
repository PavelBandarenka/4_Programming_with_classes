package by.epam.jonline.javaclass.simpleclass.Task_3_Student;

import java.util.Arrays;
import java.util.List;

public class View {

    /*
     *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    public void printList(List<Student> studentList) {
        System.out.println("-----------------------------------------");
        System.out.println("List of students:");
        for (Student each : studentList) {
            System.out.println("Student{" +
                               "fullName='" + each.getFullName() + '\'' +
                               ", group=" + each.getGroup() +
                               ", grade=" + Arrays.toString(each.getProgress()) + '}');
        }
    }

    public void printFilteredList(List<Student> studentList) {
        System.out.println("-----------------------------------------");
        System.out.println("List of students with 9 and 10 grades:");
        for (Student each : studentList) {
            System.out.println("Student{" +
                               "fullName='" + each.getFullName() + '\'' +
                               ", group=" + each.getGroup() +
                               ", " + "grade= " + Arrays.toString(each.getProgress()) + '}');
        }
    }
}