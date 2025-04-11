interface U {
    void pro();
    void info();
}

class L {
    public static void main(String[] args) {
        U u = () -> System.out.println("Hello");

        u.pro();
    }    
}


// L.java:8: error: incompatible types: U is not a functional interface
//         U u = () -> System.out.println("Hello");
//               ^
//     multiple non-overriding abstract methods found in interface U
// 1 error
