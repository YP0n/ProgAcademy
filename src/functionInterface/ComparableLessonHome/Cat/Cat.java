package functionInterface.ComparableLessonHome.Cat;

/*
3) Установите отношение естественного порядка для класса Cat на основании длинны имени. Т.е. чем
длиннее имя тем больше объект. Ваша реализация Comparable<Cat> должна быть совместима с
отношением эквивалентности (метод equals при необходимости можете также заменить).
 */

public class Cat implements Comparable<Cat>{
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (!name.equals(cat.name)) return false;

        return true;
    }

    @Override
    public int compareTo(Cat o) {
        if (this.name == null) {
            throw new NullPointerException();
        }
        if (this.name.length() > o.name.length()) {
            return 1;
        }
        if (this.name.length() < o.name.length()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
