package by.epam.jonline.javaclass.associationclass.Task_1_Text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    /*
     *  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
     *  консоль текст, заголовок текста.
     */

    private final List<Sentence> sentences;
    private Word textHeader;

    Text() {
        setTextHeader(new Word("No title"));
        this.sentences = new ArrayList<>();
    }

    Text(Word textHeader, Sentence sentence) {
        this.textHeader = textHeader;
        this.sentences = new ArrayList<>();
        sentences.add(sentence);
    }

    public void addText(Sentence sentence) {
        this.sentences.add(sentence);
    }

    public void printText() {
        sentences.forEach(System.out::print);
    }

    public void printTextHeader() {
        System.out.println(textHeader);
    }

    public void setTextHeader(Word textHeader) {
        this.textHeader = textHeader;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public Word getTextHeader() {
        return textHeader;
    }
}
