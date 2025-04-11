class I {
    public static void main(String[] args) {
        int x = 23;   //decimal int constant
        int y = 023;  //octal int constant  
        int z = 0x23; //hexadecimal int constant
        int t = 0b10; //binary int constant
    
        System.out.println(x);
        System.out.println(y);  //19
        System.out.println(z);  //35
        System.out.println(t);  //2
    }    
}
