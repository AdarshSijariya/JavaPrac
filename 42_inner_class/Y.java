import java.io.*;

class Y implements Serializable {
    String a;
    
    class X {
        String b;
    } 
    
    public static void main(String[] args) throws Exception {
        Y y = new Y();
        y.a = "gopal";

        X x = y.new X();
        x.b = "bhopal";

        new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(y);
    }
}
