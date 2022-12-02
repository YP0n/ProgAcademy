package functionInterface.UnaryOperator.String;

/*
2) Создайте реализацию UnaryOperator<String> где результатом будет строка в которой
исключены все символы кроме цифровых. Т.е. если входящим параметром является
строка вида «Hello 123 world» результатом будет строка «123».
 */

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        String in = "Hello 123 world";

        UnaryOperator<String> unOp = a -> a.replaceAll("[a-zA-Z]", "");
        String out = unOp.apply(in);
        System.out.println(out);
    }
}
