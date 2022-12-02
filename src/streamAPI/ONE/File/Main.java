package streamAPI.ONE.File;

/*
3)Используя Stream API верните адрес файла с максимальным размером в заданном
каталоге.
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\LessonHome\\Lesson10\\");

            Optional<File> stream = Arrays.stream(file.listFiles()).max((a, b) -> (int) (a.length() - b.length()));
        System.out.println(stream);
        }
    }
