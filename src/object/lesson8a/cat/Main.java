package object.lesson8a.cat;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 8);
        Cat cat2 = new Cat("Umka", 8);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println("----------------------------");

        try {
            Cat cat3 = cat1.clone();
            System.out.println(cat1 == cat3);
            System.out.println(cat1.getClass());
            System.out.println(cat3.getClass());
            System.out.println(cat3.equals(cat1));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------");

        //Class catClass = cat1.getClass();//1 метод
        Class catClass = Cat.class;//2 метод

        Field[] fields = catClass.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field);
        }
        System.out.println("---------------------------");

        try {
            try {
                Field catAge = catClass.getDeclaredField("age");
                catAge.setAccessible(true);
                catAge.setInt(cat1, 100);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(cat1);
        } finally {

        }
    }
}
