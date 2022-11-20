package thread.thread2;

import java.nio.charset.StandardCharsets;

public class Printer {
    private Long threadId = null;

    public synchronized void printText(String text) {
        Long currentThreadId = Thread.currentThread().getId();

        for(; threadId != null && threadId == currentThreadId;) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(text + " ");
        threadId = currentThreadId;
        notifyAll();
    }
}
