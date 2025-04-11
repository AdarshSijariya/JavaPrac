class F {
    class X {
        X() {
            System.out.println("inner class X constructor");
        }
    }

    public static void main(String[] args) {
        X z = new X();
    }    
}




// F.java:9: error: non-static variable this cannot be referenced from a static context
//         X z = new X();
//               ^
// 1 error
