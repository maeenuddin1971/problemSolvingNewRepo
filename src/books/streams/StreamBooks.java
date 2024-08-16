package books.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamBooks {
    public static void main(String[] args) {
        List<String> values = List.of("maeen", "rafiq", "rasel");
        values.stream().map(s -> s.toLowerCase())
                .filter(s -> s.contains("ra"))
                .forEach(s -> System.out.println(s));

        ComparatorExample comparatorExample = new ComparatorExample("maeen", "uddin", 10L,
                "mollah", "comilla", 1000);
        ComparatorExample comparatorExample2 = new ComparatorExample("maeen", "uddin", 8L,
                "mollah", "chittagong", 1000);

        List<ComparatorExample> sortedExamples = new ArrayList<>(List.of(comparatorExample, comparatorExample2));

        Collections.sort(sortedExamples);

        sortedExamples.stream().forEach(
                s -> System.out.println(s.district())
        );

        ComparatorExampleWithClass comparatorExampleWithClass = new ComparatorExampleWithClass();
        comparatorExampleWithClass.setAge(10L);
        comparatorExampleWithClass.setFirstName("maeen");

        ComparatorExampleWithClass comparatorExampleWithClass2 = new ComparatorExampleWithClass();
        comparatorExampleWithClass2.setAge(15L);
        comparatorExampleWithClass2.setFirstName("uddin");

        List<ComparatorExampleWithClass> comparatorExampleWithClasses = new ArrayList<>(List.of(comparatorExampleWithClass, comparatorExampleWithClass2));
        Collections.sort(comparatorExampleWithClasses);


    }
}


