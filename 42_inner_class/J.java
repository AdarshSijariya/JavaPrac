interface HH {
    // int e = 56;
    void pro();
}

class J {
    private int e = 91;
    
    void info() {
        HH w = new HH() {
            // int e = 21;
            public void pro() {
                // int e = 2;
                System.out.println(e);
            }
        };

        w.pro();

    }

    public static void main(String[] args) {
        J j = new J();

        j.info();
    }
}
