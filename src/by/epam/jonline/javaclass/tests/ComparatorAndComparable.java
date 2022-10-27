package by.epam.jonline.javaclass.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2("Ac", "Iva", 1, 25);
        Employee2 emp2 = new Employee2("Ab","Ivo", 2, 45);
        Employee2 emp3 = new Employee2("Ab","Iva", 3, 15);
        Employee2 emp4 = new Employee2("Pavel","Bond", 4, 35);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before sorting : " + list);
        Collections.sort(list, new NameComparat());
        System.out.println("After sorting : " + list);
    }
}
class IdComparat implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        if(emp1.id == emp2.id){
            return 0;
        } else if (emp1.id > emp2.id){
            return -1;
        } else return 1;
    }
}

class NameComparat implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class Employee2
         implements Comparable<Employee2>
{
    String name;

    String surname;
    int id;
    int age;

    public Employee2(String name, String surname, int id, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';

    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id > anotherEmp.id) {
            return -1;
        } else return 1;
    }
}

