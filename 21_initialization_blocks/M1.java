class M1 {
    {
        System.out.println("J");
    }

    {
        System.out.println("X");
    }    
    
    M1() {
        System.out.println("G");
    }
    
    public static void main(String[] args) {
        System.out.println("E");
        M1 m = new M1();
        System.out.println("Z");
    }

    {
        System.out.println("T");
    }    
}
