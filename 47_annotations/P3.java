class X5 {
    @Deprecated
    int y;
}

class P3 {    
    public static void main(String[] args) {
        X5 x = new X5();
        System.out.println(x.y);
    }
}


// Note: P3.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.