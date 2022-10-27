package by.epam.jonline.javaclass.associationclass.Task_1_Text;

public class Word {

    /*
     *  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
     *  консоль текст, заголовок текста.
     */

    private String word;

    Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return  word;
    }
}
