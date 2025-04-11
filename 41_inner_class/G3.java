class G3 {
    float w = 8.9f;
    
    void pro() {
        System.out.println(w);
    }

    class X {
        X() {
            System.out.println(w);
        }
    }

    void info() {
        System.out.println(this.w);
        System.out.println(w);

        this.pro();
        pro();

        new X();
        this.new X();
    }

    public static void main(String[] args) {
        G3 g1 = new G3();
        g1.w = 11;

        G3 g2 = new G3();
        g2.w = 21;

        G3 g3 = new G3();
        g3.w = 31;

        g2.info();
    }
}
