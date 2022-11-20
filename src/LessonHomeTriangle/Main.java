package LessonHomeTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.setSideAB(16.5);
        triangle.setSideBC(22.4);
        triangle.setSideCA(34.8);

        System.out.println(triangle.getArea());

    }
}
