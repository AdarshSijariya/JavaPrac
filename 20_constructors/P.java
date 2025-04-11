class P {
    P() {
        System.out.println(this + " ~~~");
    }   
    
    public static void main(String[] args) {
        P x = new P();

        System.out.println(x);
    }
}
