package streamAPI.TWO.StringDelete;

/*
1) Удалите из строки текста все слова длиннее 5 символов.
 */

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text = "You can find a free newspaper or leaflet at most coffee shops," +
                " and read some articles or mundane facts, or even jokes.";
        Arrays.stream(text.split(" ")).filter(a -> a.length() < 5).forEach(n -> System.out.printf(n + " "));
    }
}
