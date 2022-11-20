package selfLearn;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Apple", 5, 0);
        Product product2 = new Product("Orange", 10, 1);
        Product product3 = new Product("Banana", 9, 2);

        Order order = new Order();

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        System.out.println(order);

        try {
            Product product4 = order.searchProductById(5);
            System.out.println(product4);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();

        System.out.println(order.removeProductByld(10));

        System.out.println(order);
    }
}
