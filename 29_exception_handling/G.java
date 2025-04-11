class G {
    public static void main(String[] args) {
        System.out.println(1);

        int val = 0;

        try{
            val = Integer.parseInt("A");
            System.out.println(val);
        } catch(NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}