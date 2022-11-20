package thread.thread2;

public class Main {

    public static void main(String[] args) {
        Printer prn = new Printer();

        PrinterTask task1 = new PrinterTask(prn, "Hip");
        PrinterTask task2 = new PrinterTask(prn, "Hop");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
