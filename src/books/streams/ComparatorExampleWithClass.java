package books.streams;

import java.util.Comparator;

public class ComparatorExampleWithClass implements Comparable<ComparatorExampleWithClass> {
    String firstName;
    String lastName;
    Long age;

    @Override
    public int compareTo(ComparatorExampleWithClass o) {
        return Comparator.comparing(ComparatorExampleWithClass::getFirstName).
                thenComparing(ComparatorExampleWithClass::getLastName).
                thenComparing(ComparatorExampleWithClass::getAge).
                compare(this, o);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
