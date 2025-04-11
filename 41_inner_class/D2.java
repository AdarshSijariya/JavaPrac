class D2 {
    //member variable
    int x;
    
    //member method
    void pro() {

    }

    //member class
    class X {

    }

    public static void main(String[] args) {
        new X();
    }
}


// D2.java:16: error: non-static variable this cannot be referenced from a static context
//         new X();
//         ^
// 1 error