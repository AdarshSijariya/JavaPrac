class Z {
    void info() {
        class Y {
            void pro() {
                System.out.println("Yamraj");
            }
        }

        Y y = new Y();
        y.pro();
    }   
    
    public static void main(String[] args) {
        Z z = new Z();
        z.info();
    }
}
