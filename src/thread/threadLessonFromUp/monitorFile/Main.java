package thread.threadLessonFromUp.monitorFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File(".");//папка данного проекту
        Thread thr = new Thread(new FileWatcher(folder));
        thr.start();
        try {
            Thread.sleep(5000);//завершення роботи монітора
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr.interrupt();
    }
}
