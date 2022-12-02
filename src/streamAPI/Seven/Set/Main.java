package streamAPI.Seven.Set;

/*
1) Используя Collector напишите свою реализацию метода Collectors.toSet()
 */

import java.util.HashSet;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Set.of("Java", "JS", "C++", "C#", "Phyton"));
        Predicate<String> predicate = (a) -> a.startsWith("J");
        Collector<String, Set<String>, Set<String>> collector = new CollectorsToSet(predicate);
        Set<String> result = set.stream().collect(collector);
        System.out.println(result);

    }
}
class CollectorsToSet implements Collector<String, Set<String>, Set<String>> {
    private Predicate<String> stringPredicate;

    public CollectorsToSet(Predicate<String> stringPredicate) {
        this.stringPredicate = stringPredicate;
    }


    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, String> accumulator() {
        return (a, b) -> {
            if (stringPredicate.test(b)) {
                a.add(b);
            }
        };
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (a, b) -> {
            Set<String> result = new HashSet<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };
    }

    @Override
    public Function<Set<String>, Set<String>> finisher() {
        return (a) -> {
            Set<String> sortedSet = new HashSet<>();
            sortedSet.addAll(a);
            return sortedSet;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}