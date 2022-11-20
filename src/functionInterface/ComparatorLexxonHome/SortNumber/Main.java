package functionInterface.ComparatorLexxonHome.SortNumber;

/*
3) Создайте реализацию Comparator<Integer> для сортировки списка целых чисел. Но сравнение
должно выполняться на основание суммы первой и последней цифры числа. Т.е например список
чисел подобного вида [62,2000,306,55] должен быть отсортирован как [2000, 62, 306,55].

 */

import kotlin.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(62,2000,306,55));

            Comparator<Integer> comparator = Main::outNumber;
            integerList.sort(comparator);
            System.out.println(integerList);

    }

    public static Integer outNumber(Integer int1, Integer int2) {
        return InNumber(int1) - InNumber(int2);
    }

    private static Integer InNumber(int number) {
        int c = 0;
        String str = Integer.toString(number);
        List<Integer> listNEW = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++){
            c = (str.charAt(0) - '0') + (str.charAt(str.length() - 1) - '0');
        }
        return c;
    }
}
