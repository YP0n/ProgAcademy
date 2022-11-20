package genericAndCollection.LessonHome.doubleCola;

public class DoubleCola {
    final int min = 1;
    final int max = 2;
    final int cola = cola(min, max);

    public static int cola(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public String toString() {
        return "DoubleCola{" +
                "cola=" + cola +
                '}';
    }
}
