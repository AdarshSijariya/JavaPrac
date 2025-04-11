class G {
    public static void main(String[] args) {
        byte x = 23;
        short y = 45;
        int z = 9;
        char t = 'A';

        pro(x, y, z, t);
    }   
    
    static void pro(int... x) {
        for(int next : x) {
            System.out.println(next + " ~~");
        }
    }
}
