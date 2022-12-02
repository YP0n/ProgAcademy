package functionInterface.Consumer.StringFile;

/*
3) Реализуйте BiConsumer<String, File> добавляющий строку в конец файла указанного в
качестве параметра.
 */

import java.io.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\LessonHome\\FileComparator\\english.txt");

        BiConsumer<String, File> addString = Main::addToFile;

        addString.accept("Invasion", file);

    }
    public static String addToFile (String str, File file) {
        try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.write(str);
        } catch (FileNotFoundException foundException) {
            foundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
