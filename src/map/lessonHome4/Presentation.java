package map.lessonHome4;

import java.util.HashMap;
import java.util.Map;

public class Presentation {

    public static void inputWords(String input) {
        ArtASCII art = new ArtASCII();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            String word = "" + input.charAt(i);
            Map<Character, String[]> map = art.getMap();
            for (int k = 0; k < 6; k++) {
                for (int j = 0; j < word.length(); j++) {
                    System.out.println("" + map.get(word.charAt(j))[k]);
                }
                System.out.println();
            }
        }
    }
}

