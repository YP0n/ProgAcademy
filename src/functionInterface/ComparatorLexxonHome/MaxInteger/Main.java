package functionInterface.ComparatorLexxonHome.MaxInteger;

/*
4) Создайте такую реализацию Comparator<Integer> что бы с ее помощью можно было найти
максимальное простое число в списке целых чисел, если такого числа в списке нет то должно
быть возвращено минимальное число.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, 107, 8, 9, 200,3, 2, 16, 15, 18));

        Predicate<Integer> pr = a -> {
            BigInteger bigInteger = BigInteger.valueOf(a);
            return bigInteger.isProbablePrime(a);
        };
        Comparator<Integer> comp = (a, b) -> {
            if(pr.test(a) && pr.test(b)) {
                return b - a;
            }
            if(pr.test(a) && !pr.test(b)) {
                return -1;
            }
            if(!pr.test(a) && pr.test(b)) {
                return 1;
            }
            return 0;
        };
        System.out.println(Collections.min(list, comp));
    }
}
