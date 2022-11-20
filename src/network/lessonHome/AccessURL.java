package network.lessonHome;

/*
Проверить доступность сайтов указанных в отдельном файле.
 */

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AccessURL {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\LessonHome\\Networks\\liqvid.txt");
        System.out.println(getUrl(file));
    }


    public static File getUrl(File file) throws IOException {
        String temp = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                temp = reader.readLine();
                try {
                    URL url = new URL(temp);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    if(connection.getResponseCode() == 200) {
                        System.out.println(temp + "is available");
                    } else {
                        System.out.println(temp + "is not available");
                    }
                } catch (IOException e) {
                    System.out.println(e.toString() + "Error this url not available");
                }
            }
        }
        return file;
    }
}
