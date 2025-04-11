class A1 {
    A1() {
        System.out.println("A");
    }
}

class B1 extends A1 {
    B1() {        
        System.out.println("T");
    }
}

class C1 extends B1 {
    C1() {
        System.out.println("W");
    }
}

class M {
    public static void main(String[] args) {
        System.out.println("E");
        C1 x = new C1();
        System.out.println("M");
    }    
}
