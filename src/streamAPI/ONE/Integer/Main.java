package streamAPI.ONE.Integer;

/*
2)Используя Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
по возрастанию и соберите в новый список.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(13, 2, 19, 4 ,1 ,6, 7, 8, 9));

        List<Integer> list1Stream = list.stream().filter(a -> (a % 2 != 0)).sorted().toList();
        System.out.println(list1Stream);
    }
}
