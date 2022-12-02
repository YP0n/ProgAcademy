package functionInterface.Consumer.Integer;

/*
1)Реализуйте Consumer<Integer> с помощью которого выведите на экран все нечетные
числа содержащиеся в List<Integer>.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        Consumer<Integer> cons = a -> {
            if (a % 2 != 0) {
                System.out.println("odd numbers from list->____" + a);
            }
        };
        list.forEach(cons);
    }
}
