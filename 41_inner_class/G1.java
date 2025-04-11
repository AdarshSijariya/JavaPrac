class G1 {
    float w = 8.9f;
    
    void pro() {
        System.out.println("golu");
    }

    class X {

    }

    void info() {
        // System.out.println(this.w);
        // System.out.println(w);

        this.pro();
        pro();
    }

    public static void main(String[] args) {
        G1 g = new G1();
        
        g.info();
    }
}
