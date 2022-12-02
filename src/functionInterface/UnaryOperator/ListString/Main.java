package functionInterface.UnaryOperator.ListString;

/*
3) Создайте реализацию UnaryOperator<List<String>> где результатом будет список строк
(созданный на основе списка выступающего в качестве параметра) длинна которых
больше 5 символов.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> listSource = new ArrayList<>(List.of("remember", "task", "low", "rock", "winter"));

        UnaryOperator<List<String>> unOp = a -> {
            List<String> listOut = new ArrayList<>();
            for (String s : a) {
                if (s.length() > 5) {
                    listOut.add(s);
                }
            }
            return listOut;
        };
        System.out.println(unOp.apply(listSource));
    }
}
