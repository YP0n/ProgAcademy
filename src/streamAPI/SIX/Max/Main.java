package streamAPI.SIX.Max;

/*
3) Замените с помощью метода reduce терминальный метод max
 */

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        BinaryOperator<Integer> bop = (a, b) -> a > b ? a : b;

        Optional<Integer> result = list.stream().reduce(bop);

        System.out.println(result.get());
    }
}
