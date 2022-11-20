package thread.lessonHome2;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSum threadSum = new ThreadSum();
        int[] array = new int[100000000];
        int[] array2 = array.clone();
//        int[] array3 = array.clone();
//        int[] array4 = array.clone();
        //long tstart = System.currentTimeMillis();
        //long tend = System.currentTimeMillis();
        //System.out.println((tend - tstart) + " ms" + "Static metod");
        //tstart = System.currentTimeMillis();
        //ThreadSum.sum(array, array2, array3, array4);
        //System.out.println((tend - tstart) + " ms" + "MultiThread metod");
        Thread thread = new Thread(String.valueOf(array));
        Thread thread2 = new Thread(String.valueOf(array2));
//        Thread thread3 = new Thread(String.valueOf(array3));
//        Thread thread4 = new Thread(String.valueOf(array4));

        thread.start();
        thread2.start();
//        thread3.start();
//        thread4.start();
        thread.join();
        thread2.join();
//        thread3.join();
//        thread4.join();
        System.out.println(threadSum.toString());






    }
}
