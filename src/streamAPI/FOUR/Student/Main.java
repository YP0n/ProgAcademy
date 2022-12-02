package streamAPI.FOUR.Student;

/*
2) Из массива студентов (да тех самых из основного в д.з) выберите студентов старше 20 лет, и
отсортируйте их по фамилии. Результат поместите в список.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mark", "Tetcher", 21);
        Student student2 = new Student("Liza", "Joun", 21);
        Student student3 = new Student("Lilu", "Faight", 20);
        Student student4 = new Student("Mark", "Repko", 19);
        Student student5 = new Student("Liza", "Kalm", 20);
        Student student6 = new Student("Tom", "Tuider", 21);
        Student student7 = new Student("Stiven", "Retsam", 19);
        Student student8 = new Student("Olga", "Vander", 19);
        Student student9 = new Student("Zet", "Gastion", 21);
        Student student10 = new Student("Kira", "Bush", 20);
        Student student11 = new Student("Ostin", "Tramp", 19);

        Student[] arrayStudent = new Student[]
                {student1, student2, student3, student4, student5, student6,
                        student7, student8, student9, student10, student11};

        Stream<Student> stream = Arrays.stream(arrayStudent)
                .filter(a -> a.getAge() > 20)
                .sorted((a, b) -> a.getLastName().compareTo(b.getLastName()));
        List<Student> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
