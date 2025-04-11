abstract class G3 {
    abstract void info();
}


class G {
    public static void main(String[] args) {
        G3 x = new G3() {
            void info() {
                System.out.println("Hi");
                pro();
            }
            
            void pro() {
                System.out.println("Hello");
            }
        };

        x.info();
        x.pro();
    }    
}
