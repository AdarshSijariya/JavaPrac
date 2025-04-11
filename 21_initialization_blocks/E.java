class A1 {
    {
        System.out.println("hi");
    }
}

class E extends A1 {
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        E x1 = new E();    
        E x2 = new E();    
    }    
}
