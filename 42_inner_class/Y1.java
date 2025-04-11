import java.io.*;

class Y1 {
    public static void main(String[] args) throws Exception {
        Y w = (Y)(new ObjectInputStream(new FileInputStream("abc.txt")).readObject());
        
        System.out.println(w.a);
    }    
}
