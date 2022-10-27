package by.epam.jonline.javaclass.simpleclass.Task_2_Constructor;

public class Test2 {

    /*
     *  Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
     *  конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
     *  класса.
     */

    private String a;
    private String b;

    Test2() {
        this.a = null;
        this.b = null;
    }

    Test2(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return  a + b;
    }
}

