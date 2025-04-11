package a;

import b.B;

class A implements B {
    public static void main(String[] args) {
        
    }
}



// a\A.java:3: error: B is not public in b; cannot be accessed from outside package
// import b.B;
//         ^
// a\A.java:5: error: B is not public in b; cannot be accessed from outside package
// class A implements B {
//                    ^
// 2 errors