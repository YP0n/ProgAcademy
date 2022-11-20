package object.lesson8a;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        Rectangle rectOne = new Rectangle(3, 4);
        Rectangle rectTwo = new Rectangle(3, 4);

        System.out.println(rectOne);
//        for (int i = 0; i < 10; i++) {
//            new Rectangle(2, 2);
//        }
//
//        System.gc();

        System.out.println("Hash Code => " + rectOne.hashCode());

        if (rectOne == rectTwo) {
            System.out.println("rectOne == rectTwo");
        } else {
            System.out.println("rectOne != rectTwo");
        }

        Rectangle rectThree = null;

        try {
            rectThree = rectTwo.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println();
        if (rectThree == rectTwo) {
            System.out.println("rectThree == rectTwo");
        } else {
            System.out.println("rectThree != rectTwo");
        }

        if (rectThree.equals(rectTwo)) {
            System.out.println("rectThree equals rectTwo");
        } else {
            System.out.println("rectThree not equals rectTwo");
        }

        if (rectOne.equals(rectTwo)) {
            System.out.println("rectOne equals rectTwo");
        } else {
            System.out.println("rectOne not equals rectTwo");
        }

        System.out.println();

        Class clasRectangle = rectOne.getClass();
        Field[] fieldArray = clasRectangle.getDeclaredFields();
        for(Field field : fieldArray) {
            System.out.println(field);
        }
        System.out.println();
        Method[] methodArray = clasRectangle.getDeclaredMethods();
        for(Method method : methodArray) {
            System.out.println(method);
        }
        System.out.println();
        Constructor <?> [] constructorsArray = clasRectangle.getConstructors();
        for(Constructor<?> constructor : constructorsArray) {
            System.out.println(constructor);
        }
        System.out.println();
        System.out.println(rectThree);

        try{
            Field w = clasRectangle.getDeclaredField("width");//рефлексия, замена значения
            w.setAccessible(true);
            w.setDouble(rectThree, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"))) {
            oos.writeObject(rectThree);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Rectangle recFive = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"))) {
            recFive = (Rectangle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Rect 5 = " + recFive);
        System.out.println("main method stop");
    }
}
