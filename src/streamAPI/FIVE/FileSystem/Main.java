package streamAPI.FIVE.FileSystem;

/*
1)Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
из каталогов в котором расположено более 3-х текстовых файлов.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Stream<File> stream = Files.lines(Path.of("C:\\LessonHome\\Adress system files.txt"))
                .map(a -> new File(a))
                .filter(a -> {
                    List<File> files = List.of(a.listFiles());
                    int count = 0;
                    for (File f : files) {
                        if (f.isFile() && f.getName().endsWith(".txt")) {
                            count++;
                        }
                    }
                    return count > 3;
                });
        Optional<File> optional = stream.findFirst();
        System.out.println(optional.get());
    }
}
