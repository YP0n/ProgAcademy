package map.lessonHome2;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("C:\\Lesson10\\english.txt");
        File fileOut = new File("C:\\Lesson10\\ukrainian.out.txt");

        Dictionary dictionary = new Dictionary();
        WordFile wordsFile = new WordFile();
        HashMap<String, String> words = dictionary.readDictionary();
        Set<String> key = words.keySet();
        dictionary.addToDictionaryHand();
        dictionary.saveToDictionary(words);

        System.out.println(words);

        String englishTemp = wordsFile.readEnglish(fileIn).toLowerCase();
        System.out.println((englishTemp));
        String word = "";
        String ukrainian = "";
        String[] notTranslate = {"a", "the", "are"};
        for (int i = 0; i < englishTemp.length(); i++) {
            if (englishTemp.charAt(i) == '.' || englishTemp.charAt(i) == ',' || englishTemp.charAt(i) == ' ') {
                if (Arrays.asList(notTranslate).contains(word)) {
                    word = "";
                } else {
                    if (word != "") {
                        for (String str : key) {
                            if (str.equals(word)) {
                                ukrainian += words.get(str).toLowerCase();
                                word = "";
                                break;
                            }
                        }
                        if (word != "") {
                            ukrainian += word;
                            word = "";
                        }
                    }
                    ukrainian += englishTemp.charAt(i);

                }
            } else {
                word += englishTemp.charAt(i);
            }
            System.out.println(ukrainian);
            wordsFile.saveUkrainian(fileOut, ukrainian);
        }
    }
}

