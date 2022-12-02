package streamAPI.TWO.Cat;

/*
3) Удалите из List<Cat> всех кошек вес которых меньше 3 кг, отсортируйте их по именам (в
лексикографическом порядке) и соберите результат в новый список Cat.
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 9, 3);
        Cat cat2 = new Cat("Dana", 4, 2);
        Cat cat3 = new Cat("Cezar", 3, 5);
        Cat cat4 = new Cat("Runa", 2, 6);
        Cat cat5 = new Cat("Ava", 1, 5);


        List<Cat> catList = List.of(cat1, cat2, cat3, cat4, cat5);

        try (Stream<Cat> catToWeight = catList.stream()
                .filter(a -> a.getWeight() > 3)
                .sorted((a, b) -> a.getName().compareTo(b.getName()))) {
            try {
                List<Cat> result = catToWeight.collect(Collectors.toList());
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
