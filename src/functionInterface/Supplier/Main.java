package functionInterface.Supplier;

/*
3) Реализуйте IntSupplier последовательно возвращающий элемент из массива целых чисел.
 */

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 3, 2, 6, 5, 5, 7, 7, 9, 0, 88};

        for (int i = 0; i < array.length; i++) {
            System.out.println(number(array, i));
        }
    }

    public static int number(int[] in, int i) {
        IntSupplier ispl = () -> in[i];
        return ispl.getAsInt();
    }
}
