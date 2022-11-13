package functionInterface.predicate.lessonHome.cat;

/*
Используя реализацию Preticate<Cat> (в качестве Cat взять класс используемый в лекции) и
методы для логических функций, реализуйте удаление из списка Cat котов возраст которых
меньше определенного значения (задается как параметр), а имя по алфавиту идет после буквы
(задается так же как параметр). Например если первый параметр задан как 5, а второй как 'C' то
будет удален Cat [name=Timka, age=4], Cat [name=Kuzia, age=2].
 */

import functionInterface.predicate.Cat;

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
        System.out.println(cats);


        Predicate<Cat> pr1 = a -> a.getAge() < 5;
        Predicate<Cat> pr2 = a -> {
            for (Cat c:cats) {
                if(c.getName().startsWith("M")) {
                    a.getName().startsWith(String.valueOf(c), 1);
                }
            }
            return true;
        };

        cats.removeIf(pr1.and(pr2));
        System.out.println(cats);
    }
}
