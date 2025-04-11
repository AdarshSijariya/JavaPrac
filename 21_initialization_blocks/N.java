class N {
    {
        System.out.println("J");
    }

    static {
        System.out.println("W");
    }

    {
        System.out.println("X");
    }    
    
    N() {
        System.out.println("G");
    }

    static {
        System.out.println("A");
    }
    
    public static void main(String[] args) {
        System.out.println("E");
        N m = new N();
        System.out.println("Z");
    }

    {
        System.out.println("T");
    }
    
    static {
        System.out.println("N");
    }
}
