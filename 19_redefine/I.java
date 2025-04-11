class A {
    int x = 2;
}

interface B {
    int x = 5;
}

class C extends A implements B {
    void pro() {
        System.out.println(x);
    }
}

class H {
    public static void main(String[] args) {
        C c = new C();
    
        c.pro();
    }
}



// I.java:11: error: reference to x is ambiguous
//         System.out.println(x);
//                            ^
//   both variable x in A and variable x in B match
// 1 error
