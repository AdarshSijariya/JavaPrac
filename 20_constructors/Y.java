class A9 {
    private A9() {

    }    
}

class Y {
    public static void main(String[] args) {
        A9 x = new A9();    
    }
}


// Y.java:9: error: A9() has private access in A9
//         A9 x = new A9();
//                ^
// 1 error