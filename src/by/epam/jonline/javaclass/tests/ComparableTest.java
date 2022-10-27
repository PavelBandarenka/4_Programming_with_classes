package by.epam.jonline.javaclass.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Alla", "Ivanova", 1, 25);
        Employee emp2 = new Employee("Anna","Ivanov", 2, 45);
        Employee emp3 = new Employee("Anna","Ivanof", 2, 45);
        Employee emp4 = new Employee("Pavel","Bond", 3, 35);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before sorting : " + list);
        Collections.sort(list);
        System.out.println("After sorting : " + list);
    }
}

class Employee implements Comparable<Employee> {
    String name;

    String surname;
    int id;
    int age;

    public Employee(String name, String surname, int id, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';

    }

    @Override
    public int compareTo(Employee anotherEmp) {
 /*       if(this.id == anotherEmp.id){
            return 0;
        } else if (this.id > anotherEmp.id){
            return -1;
        } else return 1;
    }*/
   //     return this.id - anotherEmp.id;
   //     return this.id.compareTo(anotherEmp.id);  // if Integer


        if(this.name.compareTo(anotherEmp.name) ==0){
            return this.surname.compareTo(anotherEmp.surname);
        } else return this.name.compareTo(anotherEmp.name);
    }
}
