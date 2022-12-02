package streamAPI.TWO.StringDeleteWordEnglish;

/*
2) Удалите из строки символы которые не являются буквами английского алфавита.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String abrakadabra = "Daite більше force new учням";

        Arrays.stream(abrakadabra.split(" ")).filter(a -> a.matches("^[a-zA-Z]+$")).forEach(n -> System.out.printf(n + " "));
    }
}
