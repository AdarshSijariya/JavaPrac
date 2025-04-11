interface WWW {
    void pro();
}

class I {
    static void info(WWW w) {
        w.pro();
        // System.out.println(w);
    }

    public static void main(String[] args) {
        info(new WWW() {
            public void pro() {
                System.out.println("Chitragupta");
            }    
        });
    }
}
