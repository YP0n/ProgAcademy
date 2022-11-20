package functionInterface.Function.LessonHome1.Word;

/*
Опишите такую реализацию Function<String, Integer> которая вернет количество согласных букв в
строке текста
 */


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "When there is no more text to display, " +
                "a small box will take the place of " +
                "the arrow on the lower right corner of the text frame.";

        Function<String, Integer> function = Main::calculateWord;
        System.out.println(applyWord(text, function));
    }

    public static Integer applyWord(String text, Function<String, Integer> function) {
        return function.apply(text);
    }

    public static Integer calculateWord(String text) {
        int n = 0;
        char[] input = text.toUpperCase().toCharArray();
        char[] englishWord = new char[] {'B','C','D','F','G','H','J','K','L','M','N',
                'P','Q','R','S','T','V','W','X','Y','Z'};
        for (Character chWord : input) {
            for (Character ch : englishWord) {
                if(chWord == ch) {
                    n++;
                    break;
                }
            }
        }
        return n;
    }
}
