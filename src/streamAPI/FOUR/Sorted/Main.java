package streamAPI.FOUR.Sorted;

/*
1) Разбейте строку английского текста по символу пробел. Полученный набор слов отсортируйте в
порядке возрастания количества гласных букв в нем. Слова в которых нет гласных букв стоит
исключить из результата.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String source = "these songs arise from some of the biggest rising strs country and indie rock";
        Stream<String> strm = Arrays.stream(source.split(" "))
                .filter(a -> a.matches("(.*)[aeuioyAEUIOY](.*)"))
                .sorted((a, b) -> a.replaceAll("[^aeuioyAEUIOY]", "").length() -
                        b.replaceAll("[^aeuioyAEUIOY]", "").length());
        List<String> list = strm.collect(Collectors.toList());
        System.out.println(list);
    }
}
