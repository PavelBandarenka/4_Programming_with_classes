package by.epam.jonline.javaclass.simpleclass.Task_3_Student;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    /*
     *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
     */

    private final String fullName;
    private final int group;
    private final int[] progress;

    Student(String fullName, int group) {
        this.fullName = fullName;
        this.group = group;
        this.progress = new int[5];
    }

    public void setProgress(int a, int b, int c, int d, int e) {
        progress[0] = a;
        progress[1] = b;
        progress[2] = c;
        progress[3] = d;
        progress[4] = e;
    }

    public int[] getProgress() {
        return progress;
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && fullName.equals(student.fullName) && Arrays.equals(progress, student.progress);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullName, group);
        result = 31 * result + Arrays.hashCode(progress);
        return result;
    }
}
