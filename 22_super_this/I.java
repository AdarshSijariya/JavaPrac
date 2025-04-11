class Y3 {
    Y3(I x) {
        System.out.println(x);
    }
}


class I {
    void pro() {
        System.out.println(this);
        Y3 s = new Y3(this);
    }

    public static void main(String[] args) {
        I a = new I();
        
        a.pro();

        System.out.println(a);
    }    
}
