package streamAPI.ONE.Cat;

/*
1)Используя Stream API и List<Cat> верните самое длинное имя кота в этом списке.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fedor", 5);
        Cat cat2 = new Cat("Ganna", 7);
        Cat cat3 = new Cat("Bella", 3);
        Cat cat4 = new Cat("Tom", 9);
        Cat cat5 = new Cat("Murchik", 1);

        List<Cat> list = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        Optional<Cat> result = list.stream().max((a, b) -> a.getName().length() - b.getName().length());
        System.out.println(result.get());
    }
}
