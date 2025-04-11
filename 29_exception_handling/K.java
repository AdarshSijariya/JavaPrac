//input: <no-input>, 0, 1, 2, 3, a

class K {
    public static void main(String[] args) {

        System.out.println("1");
        
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("2");
            
            int[] x = {3, 0 ,2};
            System.out.println(x[i]);
            System.out.println("3");
            
            int y = 12/x[i];
            System.out.println("4");
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("5");
    }    
}
