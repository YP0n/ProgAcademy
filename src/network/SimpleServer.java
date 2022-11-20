package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleServer implements Runnable {
    private Socket socket;
    private String message;

    public SimpleServer(Socket socket, String message) {
        super();
        this.socket = socket;
        this.message = message;
    }

    @Override
    public void run() {
        try (PrintWriter pw = new PrintWriter(socket.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"))) {

            String request = "";
            for (;;) {
                String temp = br.readLine();
                if (temp == null || temp.length() == 0) {
                    break;
                }
                request += temp + System.lineSeparator();
            }
            System.out.println(request);
            String response = "HTTP/1.1 200 OK\r\n" + "Server: Java saple server\r\n" + "Content-Type:"
                    + "text/html; charset=utf-8\r\n" + "Connection: close\r\n\r\n";
            pw.println(response + message);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
