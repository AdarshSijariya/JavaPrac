class Z {
    Z x = new Z();

    public static void main(String[] args) {
        Z c = new Z();
    }
}



// Exception in thread "main" java.lang.StackOverflowError
//         at Z.<init>(L.java:2)
//         at Z.<init>(L.java:2)
//         at Z.<init>(L.java:2)