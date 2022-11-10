package map.lessonHome2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordFile {

    public String readEnglish (File file) {
        String temp = "";
        try(Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                temp += sc.nextLine();
            }
            return temp;
        } catch (FileNotFoundException foundException) {
            foundException.printStackTrace();
        }
        return null;
    }

    public void saveUkrainian (File fileOut, String temp) {
        try(FileWriter writer = new FileWriter(fileOut)) {
            writer.write(temp);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved done");
    }
}

