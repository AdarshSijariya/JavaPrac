class J {
    public static void main(String[] args) {
        
        System.out.println(1);
        
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println(i);
        } catch(NumberFormatException e) {
            System.out.println("Problem Solved");
        }
        
        System.out.println(2);
    }    
}
