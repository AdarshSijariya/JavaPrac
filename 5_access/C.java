class C {
    public static void main(String[] args) {
       System.out.println(a);
    }
}

class Z {
    static int a = 88;
}


// C.java:3: error: cannot find symbol
//        System.out.println(a);
//                           ^
//   symbol:   variable a
//   location: class C
// 1 error