package thread.threadLessonFromUp;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new KillerThread());
        thread.start();
    }
}
