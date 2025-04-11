class CC {
    void pro(int x) {
        System.out.println("Hi");
    }
}

class C extends CC {
    void pro(float x) {
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        CC x = new C();

        x.pro(12);
    }
}


//output: Hi