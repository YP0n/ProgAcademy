package network.lessonHome;

/*
Напишите программу, которая выведет в файл все ссылки, которые содержатся в html документе,
который будет прислан в результате запроса на произвольный URL
 */

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            getURLFromString("https://dou.ua/", new File("C:\\LessonHome\\Networks\\http.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getStringFromURL(String spec, String code) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        String result = "";

        try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
            String temp = "";
            while (true) {
                temp = br.readLine();
                if(temp == null) {
                    break;
                }
                result += temp + System.lineSeparator();
            }
            return result;
        }
    }

    public static void getURLFromString (String spec, File file) throws IOException {
        try(PrintWriter writer = new PrintWriter(file)) {
        String source = getStringFromURL(spec, "UTF-8");
        String[] array = source.split("http");
            for (int i = 1; i < array.length; i++) {
                int index = 0;
                array[i] = "http" + array[i].replaceAll("\'", "\"");
                if(array[i].indexOf("\"") != -1) {
                    index = array[i].indexOf("\"");
                }
                writer.print(array[i].substring(0, index) + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
