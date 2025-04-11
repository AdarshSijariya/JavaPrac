class A {
    int x = 2;
}

interface B {
    int x = 5;
}

class C extends A implements B {

}

class H {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.x);
    }
}



// H.java:17: error: reference to x is ambiguous
//         System.out.println(c.x);
//                             ^
//   both variable x in A and variable x in B match
// 1 error