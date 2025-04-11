class X6 {
    @Deprecated
    void pro() {
        System.out.println("Hiiii .... !!!!");
    }
}

class P4 {    
    public static void main(String[] args) {
        X6 x = new X6();
        x.pro();
    }
}


// Note: P4.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.