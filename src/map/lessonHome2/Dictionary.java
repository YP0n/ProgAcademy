package map.lessonHome2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {

    public HashMap<String, String> readDictionary() {
        File fileDictionary = new File("C:\\Lesson10\\dictionary.txt");
        String temp = "";
        Map<String, String> words = new HashMap<>();
        try (Scanner sc = new Scanner(fileDictionary)) {
            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                String[] splitDictionary = temp.split("-");
                words.put(splitDictionary[0], splitDictionary[1]);
            }
            return (HashMap<String, String>) words;
        } catch (FileNotFoundException foundException) {
            foundException.printStackTrace();
        }
        return null;
    }

    public void saveToDictionary(Map<String, String> words) {
        try(FileWriter writer = new FileWriter("C:\\Lesson10\\dictionary.txt", true)) {
            for(Map.Entry<String, String> map : words.entrySet()) {
                writer.write(map.getKey() + "-" + map.getValue() + System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Save all done");
    }

    public void addToDictionaryHand() {
        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.println("ENTER word at english");
            System.out.println("or enter 'exit' for exit");
            String english = sc.nextLine();
            if(english.equals("exit")) {
                break;
            } else {
                System.out.println("Введіть слово Українською");
                String ukrainian = sc.nextLine();
                if(english != "" && ukrainian != "") {
                    words.put(english, ukrainian);
                }
                saveToDictionary(words);
                System.out.println(words);
            }
        }
    }
}
