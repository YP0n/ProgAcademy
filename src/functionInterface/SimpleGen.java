package functionInterface;

public class SimpleGen {
    private int number;

    public SimpleGen(int number) {
        super();
        this.number = number;
    }

    public SimpleGen() {
        super();
    }

    @Override
    public String toString() {
        return "SimpleGen{" +
                "number=" + number +
                '}';
    }

    public int getNumber() {
        int temp = number;
        number = number + 1;
        return temp;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
