class M {
    public static void main(String[] args) {
        Float x = 3.45f;
        System.out.println(x.toString());

        float y = 2.34f;
        // System.out.println(y.toString());   //error: float cannot be dereferenced
        System.out.println(Float.toString(y));
    }    
}

