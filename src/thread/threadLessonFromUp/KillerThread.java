package thread.threadLessonFromUp;

public class KillerThread implements Runnable {

    public KillerThread() {
        super();
    }

    @Override
    public void run() {
        Thread thread = new Thread(new ClockThread());
        thread.start();
        int a = (int) (Math.random() * 10);
        for (; a != 5; ) {
            System.out.println(a);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a = (int) (Math.random() * 10);
        }
        thread.interrupt();
        System.out.println("Killer thread stop");
    }
}