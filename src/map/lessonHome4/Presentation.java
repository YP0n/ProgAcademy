package map.lessonHome4;

import java.util.HashMap;
import java.util.Map;

public class Presentation {

    public static void inputWords (String input) {
        input = input.toLowerCase();
        ArtASCII art = new ArtASCII();
        char[] word = input.toCharArray();
        Map<Character, String[]> map = art.getMap();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < word.length; j++) {
                String[] wordArt = map.get(word[j]);
                System.out.println(wordArt[i] + " ");
            }
            System.out.println();
        }
    }
}
