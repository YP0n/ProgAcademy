package LessonHomeTovar;

public class Tovar {

    private String description;
    private double weight;
    private double price;

    public Tovar(String description, double weight, double price) {
        super();
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public Tovar() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "description='" + description + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
