class M {
    static void info(float x, String... w) {
        System.out.println(x);
        System.out.println("~~~~~~~~~");

        for(String next : w) {
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        info('A', "B", "C", "D", "E", "F");
    }    
}
