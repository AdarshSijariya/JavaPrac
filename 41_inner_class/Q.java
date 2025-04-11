class Q {
    
    class T {
        int h = 12;
        void pro() {
            int h = 8;
            System.out.println(h);
            System.out.println(this.h);
        }
    }

    public static void main(String[] args) {
        Q q = new Q();

        T t = q.new T();

        t.pro();
    }
}