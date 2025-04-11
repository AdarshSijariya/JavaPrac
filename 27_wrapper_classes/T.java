class T {
    public static void main(String[] args) {
        // boolean x = Boolean.parseBoolean("true");
        // boolean x = Boolean.parseBoolean("TrUe");
        // boolean x = Boolean.parseBoolean("tru");
        boolean x = Boolean.parseBoolean("");

        if(x) {
            System.out.println("aaa");
        } else {
            System.out.println("bbb");
        }
    }    
}
