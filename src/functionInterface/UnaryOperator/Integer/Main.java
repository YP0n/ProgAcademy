package functionInterface.UnaryOperator.Integer;

/*
1) С помощью реализации UnaryOperator замените все нечетные числа в списке целых
чисел на нули.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        UnaryOperator<Integer> unop = a -> {
            if(a % 2 != 0) {
                a = 0;
            }
            return a;
        };
        list.replaceAll(unop);
        System.out.println(list);

    }
}
