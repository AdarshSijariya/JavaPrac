class A3 {
    private int w = 999;

    void pro() {
        System.out.println(w);
    }
}

class B3 extends A3 {
    B3() {
        System.out.println("---- B3() ---start");
        pro();
        System.out.println("---- B3() ---end");
    }
}

class O {
    public static void main(String[] args) {
        B3 y = new B3();
        
        System.out.println("---- main() ---start"); 
        y.pro();
        System.out.println("---- main() ---end"); 
    }
}
