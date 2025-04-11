class X3 {
    int a = 12;
}

class C extends X3 {
    int a = 23;

    C() {
        int a = 9;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }    

    public static void main(String[] args) {
        C c = new C();
    }
}
