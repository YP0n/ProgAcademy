package streamAPI.THREE.txt;

/*
3) На основе адреса каталога выделите список файлов с расширением «txt».
 */

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\LessonHome\\FileComparator\\");
        Stream<File> stream = Arrays.stream(file.listFiles()).filter(a -> a.getName().endsWith("txt"));
        stream.forEach(n -> System.out.println(n));

    }
}
