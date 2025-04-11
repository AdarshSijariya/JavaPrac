class G {
    public static void main(String[] args) {
        Integer x = 23;
        System.out.println(x.toString() + 2);

        int y = 5;
        // System.out.println(y.toString());   // error: int cannot be dereferenced
        System.out.println(Integer.toString(y) + 2);
    }    
}
