package by.epam.jonline.javaclass.simpleclass.Task_3_Student;

import java.util.Arrays;
import java.util.List;

public class Main_Task3 {

    /*
     *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    public static void main(String[] args) {

        Logic logic = new Logic();
        Filter filterBy = new Filter();
        View view = new View();

        List<Student> studentList;
        List<Student> filteredList;

        studentList = List.of(
                new Student("James Bond", 1),
                new Student("Dames Don", 2),
                new Student("Hamed Ton", 3),
                new Student("Gamed Von", 2),
                new Student("Lames Hong", 1),
                new Student("Same Son", 1),
                new Student("Jam Bom", 2),
                new Student("JMes Mand", 2),
                new Student("Camel Tom", 3),
                new Student("Games End", 1)
        );

        studentList.get(0).setProgress(10, 9, 9, 10, 9);
        studentList.get(1).setProgress(8, 9, 6, 8, 9);
        studentList.get(2).setProgress(7, 9, 6, 8, 7);
        studentList.get(3).setProgress(9, 9, 9, 10, 9);
        studentList.get(4).setProgress(7, 5, 6, 8, 7);
        studentList.get(5).setProgress(8, 9, 7, 8, 9);
        studentList.get(6).setProgress(5, 4, 6, 7, 9);
        studentList.get(7).setProgress(8, 9, 6, 8, 9);
        studentList.get(8).setProgress(9, 9, 10, 10, 9);
        studentList.get(9).setProgress(8, 5, 6, 7, 7);

        filteredList = logic.checkStudentsInfo(
                studentList,
                eachStudent -> Arrays.stream(eachStudent.getProgress()).sum() >= filterBy.getGRADE());

        view.printList(studentList);
        view.printFilteredList(filteredList);
    }
}
