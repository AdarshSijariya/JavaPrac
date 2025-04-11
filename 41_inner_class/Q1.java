class Q1 {
    int h = 21;
    
    class T extends AA {
        void pro() {
            System.out.println(h);
        }
    }

    public static void main(String[] args) {
        Q1 q = new Q1();

        T t = q.new T();

        t.pro();
    }
}

class AA {
    int h = 88;
} 