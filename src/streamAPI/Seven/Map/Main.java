package streamAPI.Seven.Map;

/*
2) Используя Collector соберите в карту, только те слова в потоке строк, в которых есть гласные.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {

        String text = "You can fnd a fr newspaper or leaflet at mst coffee shps," +
                " nd rd some articles or mundane fcts, or even jokes.";
        Predicate<String> predicate = a -> {
            if (a.matches("(.*)[aeuioyAEUIOY](.*)")) {
                return true;
            }
            return false;
        };
        Collector<String, Map<String, Integer>, Map<String, Integer>> collector = new GroupByVowels<>(predicate);
        Map<String, Integer> result = Arrays.stream(text.split(" ")).collect(collector);
        System.out.println(result);
    }
}

class GroupByVowels<T> implements Collector<T, Map<T, Integer>, Map<T, Integer>> {
    private Predicate<String> word;

    public GroupByVowels(Predicate<String> word) {
        this.word = word;
    }

    @Override
    public Supplier<Map<T, Integer>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<T, Integer>, T> accumulator() {
        return (map1, element) -> {
            if (word.test((String) element)) {
                Integer num = map1.getOrDefault(element, 0);
                map1.put(element, num + 1);
            }
        };
    }

    @Override
    public BinaryOperator<Map<T, Integer>> combiner() {
        return (map1, map2) -> {
            Map<T, Integer> result = new HashMap<>(map1);
            map2.forEach((k, v) -> {
                Integer num = result.getOrDefault(k, 0);
                result.put(k, v + num);
            });
            return result;
        };
    }

    @Override
    public Function<Map<T, Integer>, Map<T, Integer>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH, Characteristics.UNORDERED);
    }
}