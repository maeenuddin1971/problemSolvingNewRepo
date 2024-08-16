package books.streams;

import java.util.Comparator;

public record ComparatorExample(String firstName, String lastName, Long age, String surName, String district,
                                Integer amountLoan) implements Comparable<ComparatorExample> {

    @Override
    public int compareTo(ComparatorExample other) {
        return Comparator.comparing(ComparatorExample::firstName)
                .thenComparing(ComparatorExample::lastName)
                .thenComparing(ComparatorExample::age).compare(this, other);
    }
}
