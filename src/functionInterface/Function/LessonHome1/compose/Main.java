package functionInterface.Function.LessonHome1.compose;

/*
Используя композицию функций реализуйте функцию которая вернет сумму кодов каждого
символа в произвольной строке.
 */

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "Sign up to receive the top stories you need to know right now.";
        //Integer summa = 0;

        Function<String, Integer> functionCount = a -> {
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                count += a.charAt(i);
            }
            return count;
        };
        Function<Integer, Integer> function = a -> a.intValue();


        Function<String, Integer> fun3 = function.compose(functionCount);

        System.out.println(fun3.apply(text));
    }
}
