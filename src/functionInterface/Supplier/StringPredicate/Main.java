package functionInterface.Supplier.StringPredicate;

/*
2) Реализуйте Supplier<String> с помощью Predicate<String> реализующий следующий функционал:
возвращать из List<String> только строки соответствующие реализации Predicate. Например если
у вас есть список [«Hello», «world», «Java»], а Predicate возвращает true только если слово
начинается с большой буквы, ваша реализация Supplier должна последовательно вернуть
«Hello», «Java» и после чего возвращать null (закончились подходящие значения).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "world", "Java"));
        Predicate<String> prd = a -> a.matches("\\p{Upper}{1}.*");
        Supplier<String> splr = new SupplierFound(list, prd, list.listIterator());
        String str = "";
        for (;(str = splr.get()) != null;) {
            System.out.println(str);
        }
    }
}
class SupplierFound implements Supplier<String>{
    private List<String> list;
    private Predicate<String> prd;
    private ListIterator<String> lstr;

    public SupplierFound(List<String> list, Predicate<String> prd, ListIterator<String> lstr) {
        this.list = list;
        this.prd = prd;
        this.lstr = this.lstr;
    }

    @Override
    public String get() {
        for (;(lstr.hasNext());) {
            String temp = lstr.next();
            if (prd.test(temp)) {
                return temp;
            }
        }
        return null;
    }
}
