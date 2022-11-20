package stream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        File in = new File("D:\\Юра\\I'm Ponomarenko Yrii.doc");
//        File out = new File("book.doc");
//        try {
//            FileOperation.fileCopy(in, out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File folder = new File("D:\\video\\");
//        System.out.println(FileOperation.folderSize(folder));
        //FileOperation.folderSize(out);

        try(DataOutputStream f = new DataOutputStream(new FileOutputStream(".txt"))) {
            f.writeInt(17);
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }
}
