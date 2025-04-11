class Z {
    void info() {
        System.out.println("aa");
    }
}

class C extends Z {
    void pro() {
        System.out.println("bb");
    }

    public static void main(String[] args) {
        C x = new C();

        x.pro();

        x.info();

        x.toString();

        x.hashCode();
    }
}
