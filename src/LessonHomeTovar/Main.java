package LessonHomeTovar;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar();

        tovar1.setDescription("Honey");
        tovar1.setWeight(4.5);
        tovar1.setPrice(34.50);

        System.out.println(tovar1.getDescription());
        System.out.println(tovar1.getWeight());
        System.out.println(tovar1.getPrice());


    }
}
