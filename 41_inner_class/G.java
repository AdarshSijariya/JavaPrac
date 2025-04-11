class G {
    float w = 8.9f;
    
    void pro() {

    }
    class X {

    }

    void info() {
        System.out.println(this.w);
        System.out.println(w);
    }

    public static void main(String[] args) {
        G g = new G();
        
        g.info();
    }
}
