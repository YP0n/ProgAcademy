package functionInterface.Function.LessonHome1;

/*
1) С помощью реализации Function<Integer[],Integer> и реализации Predicate<Integer> (да нужно
вспоминать и предыдущую лекцию ☺) реализуйте функцию которая вернет количество простых
чисел в массиве целых чисел. Например [5,6,7,8,9,10] => 2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {2,4,3,5,6,7,8,9,10,65,54,70,16};

        Predicate<Integer> pr = a -> {
            int count = 0;
            for (int i = 1; i <= a; i++) {
                if(a % i == 0) {
                    count++;
                }
                if(count > 2) {
                    return false;
                }
            }
            return true;
        };
            Function<Integer[], Integer> function = a -> {
                int count = 0;
                for (int i = 0; i < a.length; i++) {
                    if(pr.test(a[i])) {
                        count++;
                    }
                }
                return count;
            };
        System.out.println(function.apply(array));
    }
}
