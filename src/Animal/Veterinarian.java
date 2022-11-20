package Animal;

public class Veterinarian {
    String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment (Animal animal) {
        System.out.println("Im veterinar Volodin i treat animal" + animal.toString());
    }
}
