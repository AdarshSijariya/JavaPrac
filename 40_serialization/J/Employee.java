import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
    transient Address address;
    
    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Special Callback Contract Methods...

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeObject(address.cityName);
            oos.writeObject(address.stateName);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            address = new Address();
            address.cityName = (String)ois.readObject();
            address.stateName = (String)ois.readObject();    
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
