package streamAPI.TWO.XML;

/*
4) Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для указания зависимостей)
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.4</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.powermock</groupId>
<artifactId>powermock-reflect</artifactId>
<version>3.2</version>
</dependency>
Поместите эти строки в массив строк, создайте поток на его основе и выделите значения в теге <groupid> и
соберите результат в список строк.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] arrays = new String[]{"<dependency>", "<groupId>junit</groupId>",
                "<artifactId>junit</artifactId>" +
        "<version>4.4</version>", "<scope>test</scope>", "</dependency>",
                "<dependency>", "<groupId>org.powermock</groupId>" +
        "<artifactId>powermock-reflect</artifactId>",
                "<version>3.2</version>", "</dependency>"};

        Stream<String> streamArray = Arrays.stream(arrays)
                .filter(a -> a.startsWith("<groupId>"));

        List<String> list = streamArray.collect(Collectors.toList());

        list.forEach(n -> System.out.println(n));
    }
}
