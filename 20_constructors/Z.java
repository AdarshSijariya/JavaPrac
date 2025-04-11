class A12 {
    A12(int x) {
        System.out.println(x);
    }
}

class Z extends A12 {
    int m = 78;

    Z() {
        super(m);
        
        
    }
}


// Z.java:11: error: cannot reference m before supertype constructor has been called
//         super(m);
//               ^
// 1 error