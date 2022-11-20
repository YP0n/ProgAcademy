package functionInterface.predicate.lessonHome;

/*
Используя реализацию Predicate<String> реализуйте удаление со списка строк, строки первая
буква которых задается отдельным массивом символов. Например если этот массив содержит
['h','a','t'] то со списка стоит удалить все строки которые начинаются с этих букв.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveLetterStart {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Fine", "Three",
                "Germany", "Function", "Sun", "Forest", "Attacs", "Human"));
        System.out.println(list);
        char[] chars = new char[] {'h', 'a', 't'};

//        Predicate<String> prd = a -> a.startsWith("F");
//        list.removeIf(prd);
//        System.out.println(list);

//        Predicate<String> prd1 = (a) -> a.toLowerCase().startsWith(String.valueOf(chars[0]));
//        Predicate<String> prd2 = (b) -> b.toLowerCase().startsWith(String.valueOf(chars[1]));
//        Predicate<String> prd3 = (c) -> c.toLowerCase().startsWith(String.valueOf(chars[2]));
//        list.removeIf(prd1.or(prd2).or(prd3));
//        System.out.println(list);
    }
}
