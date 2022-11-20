package network;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        String spec = "https://dou.ua";
//
//        try{
//            Map<String, List<String>> headers = NetworsService.getHeader(spec);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String htmlText = null;
//        try {
//            htmlText = NetworsService.getStringFromURL(spec, "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(htmlText);

        String spez = "https://lms.prog.kiev.ua/pluginfile.php/23339/mod_resource/content/1/%D0%92%D0%BD%D1%83%D1%82%D1%80%D0%B5%D0%BD%D0%BD%D0%B8%D0%B5%20%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D1%8B.mp4";
        File folder = new File("MP4");
        folder.mkdirs();

        try {
            NetworsService.downloadFileFromURL(spez, folder);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String html = "<!doctype html>\n<html>\n <head>\n<title>This is the sample webpage!</title>\n</head>\n"
//                + "<body>\nJava the best\n</body>\n</html>";
//        try (ServerSocket serSocket = new ServerSocket(8080)) {
//            for (;;) {
//                Socket socket = serSocket.accept();
//                SimpleServer ns = new SimpleServer(socket, html);
//                Thread thr = new Thread(ns);
//                thr.start();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            URL url = new URL("https://dou.ua/");
//            System.out.println(url.getDefaultPort());
//            System.out.println(url.getProtocol());
//            System.out.println(url.getHost());
//            System.out.println(url.getRef());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
