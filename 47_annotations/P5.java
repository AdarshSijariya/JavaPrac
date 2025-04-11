class X7 {
    @Deprecated
    X7() {
        System.out.println("Hiiii .... !!!!");
    }
}

class P5 {    
    public static void main(String[] args) {
        X7 x = new X7();        
    }
}


// Note: P5.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.