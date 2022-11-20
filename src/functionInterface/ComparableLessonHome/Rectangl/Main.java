package functionInterface.ComparableLessonHome.Rectangl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23, 43);
        Rectangle r2 = new Rectangle(56, 65);
        Rectangle r3 = new Rectangle(75, 76);
        Rectangle r4 = new Rectangle(39, 49);
        Rectangle r5 = new Rectangle(20, 45);
        Rectangle r6 = new Rectangle(23, 43);

        Rectangle[] recArray = new Rectangle[]{r1, r2, r3, r4, r5, r6};
        for (Rectangle rec : recArray) {
            System.out.println(rec);
        }
        System.out.println();

        Integer[] integer = new Integer[recArray.length];
        for (int i = 0; i < recArray.length; i++) {
            integer[i] = recArray[i].getLength() * recArray[i].getHeight();
        }
        Arrays.sort(integer);
        System.out.println(Arrays.toString(integer));
    }
}
