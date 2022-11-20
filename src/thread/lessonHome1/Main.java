package thread.lessonHome1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[100];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MultiThreadFactorial(i));
        }
        for(int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }
}
