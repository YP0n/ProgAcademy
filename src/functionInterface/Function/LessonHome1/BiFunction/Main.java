package functionInterface.Function.LessonHome1.BiFunction;

import java.util.Arrays;
import java.util.function.BiFunction;

/*
Опишите такую реализацию BiFunction<String,String,String[]> которая вернет в виде массива
слова которые одновременно присутствуют и в первой строке и во второй (слова разделены
пробелами). Например text1 = «Hello Java», text2 = «Hello Python» в результате должен быть
массив вида [«Hello»].
 */
public class Main {
    public static void main(String[] args) {
        String text1 = "Hello Java";
        String text2 = "Hello Python";

        BiFunction<String, String, String> hello = Main::antiSplit;
        BiFunction<String, String , String[]> helloArray = (a, b) -> hello.apply(a, b).split(" ");
        System.out.println(Arrays.toString(helloArray.apply(text1, text2)));
    }

    public static String antiSplit(String string1, String string2) {
        String strings = "";
        for (String temp1 : string1.split(" ")) {
            for (String temp2 : string2.split(" ")) {
                if (temp1.equals(temp2)) {
                        strings = (strings + " " +  temp1).trim();
                }
            }
        }
        return strings;
    }
}
