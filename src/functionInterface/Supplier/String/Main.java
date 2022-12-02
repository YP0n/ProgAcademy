package functionInterface.Supplier.String;

/*
1) Реализуйте с помощью класса Supplier<String> который будет при каждом вызове get()
возвращать слово полученное из строки переданной в качестве параметра конструктору этого
класса. Для упрощения задания выполните разбиение строки по символу пробел.
 */

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> spl = new StringSequince("I am studying the java programming language");
            String text;
            while ((text = spl.get()) != null)
            System.out.println(text);
    }
}
class StringSequince implements Supplier<String> {
    private String[] temp;
    private Integer step = 0;

    public StringSequince(String str) {
        this.temp = str.split(" ");
    }

    @Override
    public String get() {
        if (step == temp.length) {
            return null;
        }
        return temp[step++];
    }
}


