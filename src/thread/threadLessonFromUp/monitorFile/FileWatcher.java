package thread.threadLessonFromUp.monitorFile;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileWatcher implements Runnable {//монітор файлів
    private File mainFolder;

    public FileWatcher(File mainFolder) {
        super();
        this.mainFolder = mainFolder;
    }

    public FileWatcher() {
        super();
    }

    public File getMainFolder() {
        return mainFolder;
    }
    private String getFolderInfo() {
        if(mainFolder == null) {
            return "None";
        }
        StringBuilder st = new StringBuilder();
        File[] fileArray = this.mainFolder.listFiles();
        for(File file : fileArray) {
            st.append(file.getName() + "\t" + file.length()).append(System.lineSeparator());
        }
        return st.toString();
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy   hh:mm:ss");
        for(;!thr.isInterrupted();) {
            System.out.println(sdf.format(System.currentTimeMillis()));
            System.out.println(getFolderInfo());
            System.out.println();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("File watcher is stop!!");
    }
}
