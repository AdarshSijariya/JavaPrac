class D {
    //member variable
    int x;
    
    //member method
    void pro() {

    }

    //member class
    class X {

    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}


// D.java:16: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error
