import java.io.*;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student x = (Student)(new ObjectInputStream(new FileInputStream(new File("abc.txt"))).readObject());
    
        System.out.println("Student => Name: " + x.name + ", Age: " + x.age + ", Address => City: " + x.address.cityName + ", State: " + x.address.stateName);
    }
}
