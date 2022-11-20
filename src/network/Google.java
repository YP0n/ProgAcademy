package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Google {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = null;
            try {
                inetAddress = InetAddress.getByName("www.google.com");
                System.out.println(inetAddress);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        } finally {

        }
    }
}
