package functionInterface.ComparatorLexxonHome.SearchNumber;

/*
2) Используя составной Comparator реализуйте в List<Integer> поиск числа модуль которого
наиболее близок к нулю. Если встретятся два модуль которых одинаково близок к нулю(например
5 и -5) то верните положительное значение.

 */

import kotlin.Function;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>(List.of(5, 7, -2, 3, 8, -12, -23, 32, 2));

        Comparator<Integer> com1 = (a, b) -> Math.abs(a) - Math.abs(b);
        Comparator<Integer> com2 = (a, b) -> b - a;
        Comparator<Integer> com3 = com1.thenComparing(com2);
        Integer minNumber = Collections.min(listNumber, com3);
        System.out.println(minNumber);
    }
}
