class O2 {
    static void info(String[] ar1, String... ar2) {
        for(String nx : ar1) {
            System.out.println(nx);
        }
        
        System.out.println(" ~~~~~~~~~~~~~~~~~~~ ");

        for(String nx : ar2) {
            System.out.println(nx);
        }
    }

    public static void main(String[] args) {
        // info("A", "B", "C", "D", "E", "F");
        // info({"A", "B", "C"}, "D", "E", "F");
        info(new String[] {"A", "B", "C"}, "D", "E", "F");
    }    
}