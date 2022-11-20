package functionInterface.predicate;

/*
С помощью реализации Predicat<String> реализуйте удаление со списка строк начинающихся с
определенной буквы. Например удалить все строки которые начинаются на букву F.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Masic", 8);
        Cat cat3 = new Cat("Tom", 4);
        Cat cat4 = new Cat("Karl", 2);
        Cat cat5 = new Cat("Sofa", 5);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        //cats.removeIf(a -> a.getAge() < 6);//лямбда
        //cats.removeIf(Main::testCat);//ссылка на метод testCat

        Predicate<Cat> pr1 = a -> a.getAge() < 5;
        Predicate<Cat> pr2 = a -> a.getName().startsWith("K");

        cats.removeIf(pr1.and(pr2));//Predicate and

        System.out.println(cats);
    }

    public static boolean testCat(Cat cat) {
        return cat.getAge() < 6;
    }
}
