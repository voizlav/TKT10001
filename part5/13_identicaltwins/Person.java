
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compare) {
        if (!(compare instanceof Person)) {
            return false;
        }

        Person p = (Person) compare;

        return this.birthday.equals(p.birthday)
                && this.name.equals(p.name)
                && this.height == p.height
                && this.weight == p.weight;
    }
}
