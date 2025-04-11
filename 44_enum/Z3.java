enum Golu {
    SUNDAY;

    class X {
        int y = 999;
    }

    interface Y {
        void pro();
    }

    enum Z {
        BABLU,DABLU
    }
}

class E2 implements Golu.Y {
    public void pro() {
        System.out.println("hello");
    }
}

class Z3 {
    public static void main(String[] args) {
        Golu.X x = Golu.SUNDAY.new X();
        System.out.println(x.y);

        new E2().pro();

        System.out.println(Golu.Z.BABLU);
    }
}
