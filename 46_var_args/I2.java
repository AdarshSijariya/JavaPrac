class I2 {
    I2(int... x) {
        for(int next : x) {
            System.out.println(next);
        }
    }    

    public static void main(String[] args) {
        Integer a1 = 120;
        Integer a2 = 130;
        Integer a3 = 140;
        Integer a4 = 150;
        Integer a5 = 160;
        
        I2 i = new I2(a1, a2, a3, a4, a5);
    }
}
