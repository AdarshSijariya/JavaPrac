import java.io.Serializable;

class User implements Serializable {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}
