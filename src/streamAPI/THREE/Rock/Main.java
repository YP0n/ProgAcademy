package streamAPI.THREE.Rock;

/*
2) На основе массива рок-исполнителей создайте список из первых (по алфавиту) трех песен.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Freddie Mercury", new String[]{"We Are the Champions", "Somebody to Love"});
        Singer singer2 = new Singer("David Bowie", new String[]{"Space Oddity", "Let Me Sleep Beside You", "Suffragette City"});
        Singer singer3 = new Singer("James Paul McCartney", new String[]{"Can’t Buy Me Love", "Another Girl"});

        Singer[] rockStars = new Singer[]{singer1, singer2, singer3};

        List<String> song = Arrays.stream(rockStars).flatMap(n -> Arrays.stream(n.getSongs()))
                .sorted().limit(3).collect(Collectors.toList());
        System.out.println(song);

    }
}

class Singer {
    private String name;
    private String[] songs;

    public Singer(String name, String[] songs) {
        this.name = name;
        this.songs = songs;
    }

    public Singer() {
    }

    public String getName() {
        return name;
    }

    public String[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", songs=" + Arrays.toString(songs) +
                '}';
    }
}
