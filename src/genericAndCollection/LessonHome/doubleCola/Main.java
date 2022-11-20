package genericAndCollection.LessonHome.doubleCola;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Шелдон");
        deque.push("Леонард");
        deque.push("Воловиц");
        deque.push("Кутрапалли");
        deque.push("Пенни");

        DoubleCola doubleCola = new DoubleCola();

            if (doubleCola.cola == 2) {
                String one = deque.removeFirst();
                String two = deque.removeFirst();
                deque.addLast(one);
                deque.addLast(one);
                deque.addLast(two);
                deque.addLast(two);
        }
        System.out.println(doubleCola.toString());
        System.out.println(deque);
    }
}
