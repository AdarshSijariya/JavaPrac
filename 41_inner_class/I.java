class Y {
    class X {
        X() {
            System.out.println("Namaste");
        }
    }
}

class I {
    public static void main(String[] args) {
        Y y = new Y();

        X x = y.new X();
    }    
}



// I.java:13: error: cannot find symbol
//         X x = y.new X();
//         ^
//   symbol:   class X
//   location: class I
// 1 error


