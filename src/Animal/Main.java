package Animal;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian("Volodin");
        Cat cat = new Cat("milk", "black", 8, "Trol");
        Dog dog = new Dog("meat loft", "red",23, "Rex");

        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
