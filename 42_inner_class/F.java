interface G2 {
    void info();
}

class F {
    public static void main(String[] args) {
        G2 x1 = new G2() {
            public void info() {
                System.out.println("Chhotabheem");
            }
        };

        G2 x2 = new G2() {
            public void info() {
                System.out.println("Raju");
            }
        };

        x2.info();
        x1.info();
    }
}
