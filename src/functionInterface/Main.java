package functionInterface;

public class Main {
    public static void main(String[] args) {
        SimpleGen sg = new SimpleGen(5);

        Generator gen1 = sg::getNumber;
        int temp = gen1.getNextElement();
        System.out.println(temp);
        System.out.println(sg.getNumber());

//        Generator gen2 = SimpleGen::getRandomNumber;
//        int temp1 = gen2.getNextElement();
//        System.out.println(temp1);
    }
}
