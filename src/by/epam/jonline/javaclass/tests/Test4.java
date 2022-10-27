package by.epam.jonline.javaclass.tests;
import java.util.ArrayList;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 25, 7.0);
        Student st2 = new Student("Anna", 30, 5.0);
        Student st3 = new Student("Olya", 37, 8.0);
        Student st4 = new Student("Pavel", 36, 9.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

     StudentInfo sInfo = new StudentInfo();
     sInfo.testStudents(list, st -> st.age>30);
    }
}
interface StudentCheks{
    boolean testStudent(Student s);
}

class Student{
    String name;
    int age;
    double avgGrade;
    Student(String name, int age, double avgGrade){
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo{
    void testStudents(ArrayList<Student> aL, StudentCheks sc){
        for (Student s: aL){
            if (sc.testStudent(s)){
                printStudent(s);
            }
        }
    }
    void printStudent(Student st) {
        System.out.println(" name: " + st.name + " age: " + st.age + " avgGrade: " + st.avgGrade);
    }
}
