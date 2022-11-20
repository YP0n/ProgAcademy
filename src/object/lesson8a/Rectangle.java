package object.lesson8a;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    double length;
    double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        super();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    protected void finalize() throws Throwable {
        System.out.println("Rectangle destroed");
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.length, length) != 0) return false;
        if (Double.compare(rectangle.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
