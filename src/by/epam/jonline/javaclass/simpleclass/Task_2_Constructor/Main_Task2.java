package by.epam.jonline.javaclass.simpleclass.Task_2_Constructor;

public class Main_Task2 {

    /*
     *  Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
     *  конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
     *  класса.
     */

    public static void main(String[] args) {

        Test2 test2 = new Test2("Hello!", "How are you");
        View view = new View();

        test2.setA("Hello!");
        test2.setB(" Fine, thanks!");

        view.printInfo(test2);
    }
}
