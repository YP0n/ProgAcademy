package thread.threadLessonFromUp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {
    private SimpleDateFormat sdf;

    public ClockThread() {
        super();
        sdf = new SimpleDateFormat("HH:mm:ss");
    }

    public ClockThread(String format) {
        sdf = new SimpleDateFormat(format);
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();

    for(;!thread.isInterrupted();) {
            System.out.println(sdf.format(new Date()));

            try {
                Thread.sleep(250);
            } catch (InterruptedException interruptedException) {
                break;
            }
        }
        System.out.println("Clock thread stop");
    }
}
