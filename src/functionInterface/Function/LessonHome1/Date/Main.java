package functionInterface.Function.LessonHome1.Date;

/*
Используя примитивную специализацию Function реализуйте функционал который на основе
объекта типа java.util.Calendar вернет целое число значение которого равно году хранимому в
Calendar.
 */

import java.util.Calendar;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        ToIntFunction<Calendar> function = a -> a.get(Calendar.YEAR);
        System.out.println(function.applyAsInt(Calendar.getInstance()));
    }
}
