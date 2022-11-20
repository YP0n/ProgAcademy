package functionInterface.ComparableLessonHome.Rectangl;

/*
        1) Создайте класс прямоугольник, с двумя полями - длинной и высотой прямоугольника. Задайте
        отношение естественного порядка для объектов этого класса (реализуйте интерфейс Comparable)
        на основании площади этого прямоугольника. Используйте эту реализацию для сортировки массива
        объектов класса прямоугольник.
        */

public class Rectangle implements Comparable<Rectangle>{
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        if (length != rectangle.length) return false;

        return true;
    }


    @Override
    public int compareTo(Rectangle r) {
        if(r == null) {
            throw new NullPointerException();
        }
        if(this.height * this.length > r.height * r.length) {
            return 1;
        }
        if(this.height * this.length > r.height * r.length) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
