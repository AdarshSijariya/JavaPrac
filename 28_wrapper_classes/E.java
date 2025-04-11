class E {
    public static void main(String[] args) {
        Character x = Character.valueOf('A');
        System.out.println(x.toString());
        
        char y = 'B';
        // System.out.println(y.toString());   //error: char cannot be dereferenced
        System.out.println(Character.toString(y));
    }    
}
