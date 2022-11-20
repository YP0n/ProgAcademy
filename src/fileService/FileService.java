package fileService;

import java.io.*;

public class FileService {

    public static long copyFile(File fileIn, File fileOut) throws IOException {
        try (InputStream is = new FileInputStream(fileIn);
             OutputStream os = new FileOutputStream(fileOut)) {
            return is.transferTo(os);
        }
    }
//
//    public static void copyAllFiles(File folderIn, File folderOut) throws IOException {
//        File[] files = folderIn.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isFile()) {
//                File fileOut = new File(folderOut, files[i].getName());
//                System.out.println(copyFile(files[i], fileOut));
//            }
//        }
//    }

    public static void copyAllFilesResDoc(File folderIn, File folderOut, String resolution) throws IOException {
        File[] filesTotal = folderIn.listFiles();
        for (File file : filesTotal) {
            if (file.isFile() && file.getName().indexOf("." + resolution) > 0) {
                File fileOut = new File(folderOut, file.getName());
                System.out.println(copyFile(file, fileOut));
            }
        }
    }
}