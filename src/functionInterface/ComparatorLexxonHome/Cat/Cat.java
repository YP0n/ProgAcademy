package functionInterface.ComparatorLexxonHome.Cat;

/*
1) С помощью реализации Comparator<Cat> отсортируйте массив Cat в порядке возрастания
длинны имени. Т.е. сначала должны идти коты чье имя самое короткое.
 */

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
