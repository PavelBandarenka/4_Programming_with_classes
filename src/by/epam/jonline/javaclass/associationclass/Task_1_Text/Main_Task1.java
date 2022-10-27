package by.epam.jonline.javaclass.associationclass.Task_1_Text;

public class Main_Task1 {

    /*
     *  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
     *  консоль текст, заголовок текста.
     */

    public static void main(String[] args) {

        Word textTitle;
        Sentence sentence = new Sentence();
        Text text;

        String pieceOfText1 = "This is first sentence.";
        String pieceOfText2 = "This is the second sentence of the text.";

        textTitle = new Word("This is text title");
        sentence.setSentence(pieceOfText1);

        text = new Text(textTitle, sentence);

        text.addText(new Sentence(pieceOfText2));
        text.printTextHeader();
        text.printText();

    }
}
