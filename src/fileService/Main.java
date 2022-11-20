package fileService;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        File fileIn = new File("D:\\Фото Юли\\image2.jpg");
//        File fileOut = new File("C:\\Users\\HP\\Desktop\\TestD\\" + fileIn.getName());
//
//        try{
//            System.out.println(FileService.copyFile(fileIn, fileOut));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File folderIn = new File("C:\\Users\\HP\\eclipse-workspace\\Lesson1\\");
//        File folderOut = new File("C:\\Users\\HP\\Desktop\\TestD\\");
//
//        try {
//            FileService.copyAllFiles(folderIn, folderOut);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File folderIn = new File("D:\\Юра\\");
        File folderOut = new File("C:\\Users\\HP\\Desktop\\TestD\\");

        try {
            FileService.copyAllFilesResDoc(folderIn, folderOut,"doc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
