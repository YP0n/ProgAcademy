package streamAPI.FIVE.ProgramminLang;

/*
2)Реализуйте возможность выбора из списка языков программирования (пример в лекции)
язык с заданной сложностью обучения. Верните любой из обладающих нужной
сложностью.
 */

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
        ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
        ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);

        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть рівень складності: EASY == 1 or MEDIUM == 2 or HARD == 3");
        int level = sc.nextInt();

        Optional<ProgrammingLanguage> optional = languages.stream()
                .filter(a -> a.getComplexity().ordinal() == level - 1)
                .findAny();
        System.out.println(optional.get());
    }
}

enum DifficultyLevel {
    EASY, MEDIUM, HARD;
}

class ProgrammingLanguage {
    private String name;
    private DifficultyLevel complexity;

    public ProgrammingLanguage(String name, DifficultyLevel complexity) {
        super();
        this.name = name;
        this.complexity = complexity;
    }
    public String getName() {
            return name;
    }
    public DifficultyLevel getComplexity() {
        return complexity;
    }
    @Override
    public String toString() {
        return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
    }
}

