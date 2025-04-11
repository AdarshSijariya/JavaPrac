class A2 {
    int y = 99;

    A2() {
        System.out.println("y: " + y + " A2");
    }
}

class B2 extends A2 {
    boolean w = true;
    
    B2() {
        System.out.println("y: " + y + " B2");
        System.out.println("w: " + w + " B2");
    }
}

class C2 extends B2 {
    byte g = 34;
    
    C2() {
        System.out.println("y: " + y + " C2");
        System.out.println("w: " + w + " C2");
        System.out.println("g: " + g + " C2");
    }
} 

class N {
    public static void main(String[] args) {
        C2 x = new C2();
        System.out.println("y: " + x.y + " main");
        System.out.println("w: " + x.w + " main");
        System.out.println("g: " + x.g + " main");
    }
}


// o/p:
// y: 99 A2 ---
// y: 99 B2  ---
// w: true B2  ---
// y: 99 C2 --
// w: true C2  --
// g: 34 C2 --
// y: 99 main -- 
// w: true main --
// g: 34 main --