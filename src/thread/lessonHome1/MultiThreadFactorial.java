package thread.lessonHome1;

import java.math.BigInteger;

public class MultiThreadFactorial implements Runnable {
    private int n;

    public MultiThreadFactorial(int n) {
        super();
        this.n = n;
    }

    public int getN() {
        return n;
    }

    private BigInteger calculateFactorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= n; i ++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        int i = this.n;
        for (;i <= this.n; i++ ) {
            System.out.println(thread.getName() + "!=" + calculateFactorial(i));
        }
    }
}

