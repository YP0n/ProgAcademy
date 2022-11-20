package functionInterface.ComparableLessonHome.Cat;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Turok", 12);
        Cat cat2 = new Cat("Soboly", 8);
        Cat cat3 = new Cat("Kirsh", 3);
        Cat cat4 = new Cat("Gela", 5);

        Cat[] array = new Cat[] {cat1, cat2, cat3, cat4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
