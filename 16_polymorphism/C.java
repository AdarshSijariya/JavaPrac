class C {
    public static void main(String[] args) {
        
        //Case 4:
        // Object a = new Z();
        // a.a3();    //not ok
        // a.a2();     //not ok 
        // a.a1();      //not ok
        // System.out.println(a.toString());

        //Case 3:
        // X a = new Z();
        // a.a3();   //not ok
        // a.a2();   //not ok
        // a.a1();
        // System.out.println(a.toString());
        
        //Case 2:
        // Y a = new Z();
        // a.a3();  //NOt OK
        // a.a2();
        // a.a1();
        // System.out.println(a.toString());
        
        //Case 1:
        // Z a = new Z();
        // a.a3();
        // a.a2();
        // a.a1();
        // System.out.println(a.toString());
    }
}

class X {
    void a1() {
        System.out.println("a1 in A");
    }
}

class Y extends X {
    void a2() {
        System.out.println("a2 in B");
    }
}

class Z extends Y {
    void a3() {
        System.out.println("a3 in C");
    }
}