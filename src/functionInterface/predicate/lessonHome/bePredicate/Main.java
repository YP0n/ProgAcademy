package functionInterface.predicate.lessonHome.bePredicate;

/*
Используя реализацию BiPredicate<Integer, String> реализуйте удаление из Map<Integer, String>
всех пар ключ-значение для которых длинна строки значения не равна ключу этого значения.
Например такая пара как {3: «Hello»} должна быть удалена так как длинна «Hello» не равна 3, а
пара вида {4: «Java»} останется.
*/


import kotlin.collections.EmptySet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "K");
        map.put(2, "Cat");
        map.put(3, "DOU");
        map.put(4, "JAVA");
        map.put(5, "FRIEND");
        map.put(6, "SCRIPT");
        System.out.println(map);

        BiPredicate<Integer, String> bpd = (a, b) -> a != b.length();

        for(Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext();) {
        Integer key = iterator.next();
            if (bpd.test(key, map.get(key))) {
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}
