package thread.lessonHome2;

import java.util.Arrays;
import java.util.Random;

public class ThreadSum implements Runnable {
    ThreadSum threadSum = new ThreadSum();
    private int[] array;

    public ThreadSum(int[] array) {
        super();
        this.array = array;
    }

    ThreadSum() {}

    public int[] getArray() {
        return array;
    }

    public void numberRandom (int[] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 10);
        }
    }

    @Override
    public void run() {
        int round1 = 0;
        int round2 = 0;
        int round3 = 0;
        int round4 = 0;
        int sumThread = round1 + round2 + round3 + round4;
        for(int i = 0; i < array.length/4; i++) {
            round1 += array[i];
        }
        for(int i = array.length/4; i < array.length/2; i++) {
            round2 += array[i];
        }
        for(int i = array.length/2; i < (array.length/4 + array.length/2); i++) {
            round3 += array[i];
        }
        for(int i = (array.length/4 + array.length/2); i < array.length; i++) {
            round4 += array[i];
        }
    }

    @Override
    public String toString() {
        return "ThreadSum{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
