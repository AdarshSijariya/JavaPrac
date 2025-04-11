import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class B {
    public static void main(String[] args) {
        File file = new File("abc.txt");

        try {
            FileInputStream fis = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student st = (Student)ois.readObject();

            System.out.println(st.name);
            System.out.println(st.age);
            System.out.println(st.address.city.cityName);
            System.out.println(st.address.state.stateName);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }    
}
