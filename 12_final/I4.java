class I4 {
    final int x;
    final int y = 9;
    
    I4() {
        x = 5;
    }

    public static void main(String[] args) {
        I4 i = new I4();

        System.out.println(i.x);
        System.out.println(i.y);
    }
}