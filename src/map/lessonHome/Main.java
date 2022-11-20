package map.lessonHome;

import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static void main(String[] args) {

        int[] array = generateArray(100000);
        Map<Integer, Integer> numbers = count(array);
        Set<Integer> keys = numbers.keySet();
        for (Integer key : keys) {
            System.out.println(key + " = " + numbers.get(key) + " " + (numbers.get(key) * 100) / array.length + "%");
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] generateArray(int n) {
        int[] array = new int[n];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }
        return array;
    }

    public static Map<Integer, Integer> count (int[] array){
        Map<Integer, Integer> number = new HashMap<>();
        for (int i : array) {
            Integer element = number.get(i);
            if(element != null) {
                number.put(i, element + 1);
            } else {
                number.put(i, 1);
            }
        }
        return number;
    }
}
