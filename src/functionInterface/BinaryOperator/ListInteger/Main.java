package functionInterface.BinaryOperator.ListInteger;

/*
2)Создайте реализацию BinaryOperator<List<Integer>> которая вернет список в котором
будут только те элементы которые одновременно присутствуют в первом и во втором
списке целых чисел использованных в качестве параметров.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> list2 = new ArrayList<>(List.of(5, 6, 7, 8, 9, 0));

        BinaryOperator<List<Integer>> binOp = (a, b) -> {
            List<Integer> list3 = new ArrayList<>();
            for (Integer i : a) {
                for (Integer c : b) {
                    if (i == c) {
                        list3.add(i);
                    }
                }
            }
            return list3;
        };
        System.out.println(binOp.apply(list1, list2));
    }
}
