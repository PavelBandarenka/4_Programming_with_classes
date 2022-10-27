package by.epam.jonline.javaclass.associationclass.Task_1_Text;

public class Sentence {

    /*
     *  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
     *  консоль текст, заголовок текста.
     */

    private String sentence;

    Sentence() {
    }

    Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence + " ";
    }
}
