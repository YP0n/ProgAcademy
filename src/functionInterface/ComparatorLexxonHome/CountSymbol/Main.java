package functionInterface.ComparatorLexxonHome.CountSymbol;

/*
5) Создайте Comparator<File> для сортировке списка текстовых файлов по количеству знаков
препинания в них. При решении принять, что знаки препинания ограниченны символами {, . - ? !}
и символ пробел.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File("C:\\LessonHome\\FileComparator\\");
        List<File> fileList = new ArrayList<>(List.of(fileIn.listFiles()));
        System.out.println(fileList);

        fileList.forEach(file1 -> System.out.println(file1 + " -> " + line(file1) + "; "));
        System.out.println();

        Comparator<File> comp = Comparator.comparing(Main::line);
        fileList.sort(comp);
        System.out.println(fileList);

    }

    public static int line(File file) {
        Integer count = 0;
        String fileText = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((fileText = reader.readLine()) != null) {
                Matcher matcher = Pattern.compile("[,.-?! ]").matcher(fileText);
                while (matcher.find()) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
