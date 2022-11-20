package functionInterface.ComparatorLexxonHome.Cat;

import functionInterface.predicate.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Masic", 8);
        Cat cat3 = new Cat("Tom", 4);
        Cat cat4 = new Cat("Karl", 2);
        Cat cat5 = new Cat("Sofa", 5);

        Cat[] cat = new Cat[] {cat1, cat2, cat3, cat4, cat5};

        Comparator<Cat> com = Main::CatNameLenght;
        Arrays.sort(cat, com);
        System.out.println(Arrays.toString(cat));

    }
    public static int CatNameLenght(Cat a, Cat b) {
        if(a.getName().length() > b.getName().length()) {
            return 1;
        } else if(a.getName().length() < b.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
