class I {
    public static void main(String[] args) {
        System.out.println(1);

        String str = null;
        
        try {
            System.out.println(str.length());
        } catch(Exception e) {
            System.out.println("problem solved");
        }

        System.out.println(2);
    }    
}