import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) throws ClassNotFoundException,IOException {
        Student x = (Student)(new ObjectInputStream(new FileInputStream("mno.txt")).readObject());
        
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.city);
        System.out.println(x.state);
    }    
}
