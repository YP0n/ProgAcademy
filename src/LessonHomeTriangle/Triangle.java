package LessonHomeTriangle;

public class Triangle {

    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle(double sideAB, double sideBC, double sideCA) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCA = sideCA;
    }

    public Triangle() {

    }

    public double getSideAB() {
        return sideAB;
    }

    public void setSideAB(double sideAB) {
        this.sideAB = sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public void setSideBC(double sideBC) {
        this.sideBC = sideBC;
    }

    public double getSideCA() {
        return sideCA;
    }

    public void setSideCA(double sideCA) {
        this.sideCA = sideCA;
    }

    public double getArea() {
        double halfPerimetr = (getSideAB() + getSideBC() + getSideCA()) / 2.0;//напівмериметр
        return Math.sqrt(halfPerimetr * (halfPerimetr - sideAB) *
                (halfPerimetr - sideBC) * (halfPerimetr - sideCA));//ф-ла Герона
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideCA=" + sideCA +
                '}';
    }
}
