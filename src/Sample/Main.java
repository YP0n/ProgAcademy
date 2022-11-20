package Sample;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Umka", 5, "White");

//        cat1.name = "Barsic";
//        cat1.color = "Black";
//        cat1.weight = 4;

        cat1.setName("Barsic");
        cat1.setColor("Blasc");
        cat1.setWeight(4);

        System.out.println(cat1.getName());
//
//    cat2.name = "Umka";
//    cat2.color = "White";
//    cat2.weight = 5;

        System.out.println(cat1.meow());

        System.out.println(cat1);
        System.out.println(cat2);

    }

}
