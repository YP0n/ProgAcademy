package network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class NetworsService {

    public static Map<String, List<String>> getHeader(String serc) throws IOException {
        URL url = new URL(serc);
        URLConnection connection = url.openConnection();
        return connection.getHeaderFields();
    }

    public static String getStringFromURL(String spec, String code) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
            for (; ; ) {
                String temp = reader.readLine();
                if (temp == null) {
                    break;
                }
                text += temp + System.lineSeparator();
            }
            return text;
        }
    }
    public static void downloadFileFromURL(String spec, File folder) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        int n = spec.lastIndexOf("/");
        String fileName = spec.substring(n + 1);
        File file = new File(folder, fileName);
        try(InputStream inputStream = connection.getInputStream();
        OutputStream outputStream = new FileOutputStream(file)) {
        inputStream.transferTo(outputStream);
        }
    }
}
