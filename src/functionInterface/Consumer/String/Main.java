package functionInterface.Consumer.String;

/*
2)Реализуете Consumer<String> с побочным эффектом в виде занесения всех строк
содержащих цифры во вспомогательный список.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> listWithNumber = new ArrayList<>();
        List<String> number = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));

        Consumer<String> cons = a -> {
            for (String s : number) {
                if (a.contains(s)) {
                    listWithNumber.add(a);
                }
            }
        };
        cons.accept("mama mia");
        cons.accept("return 5 dollars");
        cons.accept("2basic books");
        cons.accept("java the lang1");
        System.out.println(listWithNumber);
    }
}
