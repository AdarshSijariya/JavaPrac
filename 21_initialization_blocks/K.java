class A3 {
    static {
        System.out.println("J");
    }
    
    A3() {
        System.out.println("T");
    }
}

class K extends A3 {
    static {
        System.out.println("G");
    }

    K() {
        System.out.println("O");
    }

    public static void main(String[] args) {
        System.out.println("R");
    }
}
