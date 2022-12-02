package streamAPI.SIX.ListInteger;

/*
2) Используя reduce верните произведение элементов потока полученных на основании списка целых
чисел.
 */

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        BinaryOperator<Integer> bop = (a, b) -> a * b;

        Optional<Integer> addition = list.stream()
                .reduce(bop);

        System.out.println(addition.get());

    }
}
