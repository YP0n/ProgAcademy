package functionInterface.ComparableLessonHome.Search;

/*
2) Реализуйте обобщенный метод поиска максимального элемента в массиве объектов. Для этого
укажите ограничение для параметра типа этого метода как Comparable<T>. Сигнатура такого
метода должна выглядеть следующим образом:
<T extends Comparable<T>> T max(T[] array)

 */

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        Integer[] object = new Integer[] {1, 4, -34, 0};
        System.out.println(max(object));


    }

    public static <T extends Comparable<T>> T max(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
