package streamAPI.SIX.WordDelete;

/*
1) Разбейте строку английского текста по символу пробел. Используя reduce верните суммарное
количество букв в словах длинна которых превышает 4.
 */

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text = "You can find a free newspaper or leaflet at most coffee shops," +
                " and read some articles or mundane facts, or even jokes.";

        Stream<Integer> stringStream = Arrays.stream(text.split(" ")).map(a -> a.length());
        BinaryOperator<Integer> bop = (a, b) -> a + b;
        Optional<Integer> sum = stringStream.filter(a -> a > 4)
                .reduce(bop);
        System.out.println(sum.get());
    }
}
