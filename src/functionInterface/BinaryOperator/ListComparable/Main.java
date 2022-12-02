package functionInterface.BinaryOperator.ListComparable;

/*
3) Создайте реализацию BinaryOperator<List<T extends Comparable<T>> который будет
возвращать список в котором находиться минимальный элемент среди двух списков
использованных в качестве параметра. Например для списков [5,0,3,4] и [10,-2, 5]
нужно вернуть [10, -2, 5] так как элемент -2 минимален среди элементов этих списков.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(5,0,3,4));
        List<Integer> list2 = new ArrayList<>(List.of(10,-2, 5));

        BinaryOperator<List> binOp = Main::ListMin;
        System.out.println(binOp.apply(list1, list2));
    }
    public static <T extends Comparable<T>> List<T> ListMin (List<T> tList1, List<T> tList2) {
        T min1 = tList1.get(0);
        T min2 = tList2.get(0);

        for (T t : tList1) {
            for (T tt : tList2) {
                if(t.compareTo(min1) < 0) {
                    min1 = t;
                }
                if(tt.compareTo(min2) < 0) {
                    min2 = tt;
                }
            }
        }
        return (min1.compareTo(min2) < 0) ? tList1: tList2;
    }
}
