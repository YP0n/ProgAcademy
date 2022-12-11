package network.Practics;

import java.io.File;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        InetAddressChek addressChek = new InetAddressChek();
        File file = new File("C:\\LessonHome\\Networks\\liqvid.txt");
        addressChek.loadAddressFromFile(file);
        Map<String, String> result = addressChek.getResult();
        Set<String> adress = result.keySet();
        for(String str : adress) {
            System.out.println(str + "\t" + result.get(str));
        }
    }
}


