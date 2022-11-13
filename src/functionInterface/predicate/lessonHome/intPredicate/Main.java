package functionInterface.predicate.lessonHome.intPredicate;

/*
 Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
цифр числа число четное. Например для 103 — вернет true, так 1+0+3 = 4.
 */

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        int i = 103;//перевірочне трьохзначне число
        int s = i / 100;
        int d = i / 10 % 10;
        int f = i % 100;
        int sum = s + d + f;
        IntPredicate ipd = a -> a % 2 == 0;
        System.out.println(ipd.test(sum));
    }
}
