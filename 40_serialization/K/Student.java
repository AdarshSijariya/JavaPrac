import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    transient Address address;

    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();

            oos.writeObject(address.city.cityName);
            oos.writeObject(address.state.stateName);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            address = new Address();
            address.city = new City();
            address.state = new State();
            address.city.cityName = (String)ois.readObject();
            address.state.stateName = (String)ois.readObject();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}