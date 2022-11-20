package map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rn = new Random();
        for(int i = 0; i < 15 ; i++) {
            list.add(rn.nextInt(10));
        }
        System.out.println(list);

        Map<Integer, Integer> stat = new HashMap<>();
        for(Integer element : list) {
            Integer integer = stat.get(element);
            if(integer == null) {
                stat.put(element, 1);
            } else {
                stat.put(element, integer + 1);
            }
        }
        System.out.println(stat);
    }
}
