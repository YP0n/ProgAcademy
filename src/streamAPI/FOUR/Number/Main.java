package streamAPI.FOUR.Number;

/*
3) Из списка целых чисел, выделите те значения которых больше 10, отсортируйте по значению
последней цифры результат выведите на экран.
 */

import functionInterface.predicate.Cat;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 23, 54, 15, 8, 9, 66, 11, 111, 353, 555);

        List<Integer> stream = (List<Integer>) number.stream()
                .filter(a -> a > 10)
                .sorted((a, b) -> charInt(a) - charInt(b))
                .collect(Collectors.toList());
        stream.forEach(a -> System.out.println(a));

    }
    public static Integer charInt(int i) {
        String number = "" + i;//перевод цифр у строку
        return (int) number.charAt(number.length() - 1);
    }
}
