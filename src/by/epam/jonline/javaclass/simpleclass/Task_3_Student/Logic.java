package by.epam.jonline.javaclass.simpleclass.Task_3_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Logic {

    /*
     *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    public List<Student> checkStudentsInfo(List<Student> studentsList, Predicate<Student> check) {
        List<Student> filtered = new ArrayList<>();
        for (Student st : studentsList) {
            if (check.test(st)) {
                filtered.add(st);
            }
        }
        return filtered;
    }
}
