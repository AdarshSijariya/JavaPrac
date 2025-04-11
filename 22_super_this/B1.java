class X2 {
    int a = 45;    
}

class B1 extends X2 {
    int a = 32;

    void pro() {
        int a = 2;

        System.out.println(a);
        System.out.println(super.a);
        System.out.println(this.a);
    }
}


