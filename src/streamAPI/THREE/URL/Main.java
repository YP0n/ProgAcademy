package streamAPI.THREE.URL;

/*
1) Создайте текстовый файл с url адресами. Используя Stream API выделите только те адреса
которые являются доступными на текущий момент
 */

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        try {
            Stream<String> fileStream = Files.lines(Path.of("C:\\LessonHome\\Networks\\liqvid.txt")).filter(a -> isConnect(a) == true);
            fileStream.forEach(n -> System.out.println(n));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isConnect(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            int res = connection.getResponseCode();
            if (res == 200) {
                return true;
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }
}
