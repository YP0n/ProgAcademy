package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

    public static void fileCopy(File in, File out) throws IOException {
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        try(FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out)) {

            for(;(readByte = fis.read(buffer)) > 0;) {
                fos.write(buffer, 0, readByte);
            }

        } catch (IOException e) {
            throw e;
        }
    }

    public static long folderSize(File folder) {
        //long size = out.length();
        //System.out.println(size);
        if(folder.isFile()) {
            return folder.length();
        } else {
            long size = 0;
            File[] fileArray = folder.listFiles();
            for(File file : fileArray) {
                size += folderSize(file);
            }
            return size;
        }
    }
}
