package functionInterface.BinaryOperator.String;

/*
1)Создайте реализацию BinaryOperator<String> которая будет возвращать самое
длинное слово из двух строк переданных в качестве параметров.
 */

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        BinaryOperator<String> binOp = (a, b) -> {
            if(a.length() > b.length()) {
                return a;
            }
            return b;
        };
        System.out.println(binOp.apply("App", "July"));
    }
}
