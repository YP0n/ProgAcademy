package map.lessonHome4.java8;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "one");
            map.put(3, "three");
            map.put(5, "five");
            map.put(2, "two");
            map.put(4, "four");
            map.put(6, "two");

        //map.replaceAll((key, value) -> value.toUpperCase());
        map.putIfAbsent(3, "Three");
        map.putIfAbsent(10, "ten");

        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
