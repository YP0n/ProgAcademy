package functionInterface.predicate.lessonHome.intPredicate;

/*
 Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
цифр числа число четное. Например для 103 — вернет true, так 1+0+3 = 4.
 */

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int number = 104;
        Predicate<Integer> prd = Main::testElement;
        System.out.println(prd.test(countElement(number)));

    }
    public static int countElement(int n) {
        int count = 0;
        String input = Integer.toString(n);
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i) - '0';//отримуємо ціле число(ASCII для 0 = 48), а знач.символів [49,48,51]
            count += numbers[i];
        }
        return count;
    }

    public static boolean testElement(int n) {
        return countElement(n) % 2 == 0;
    }
}
