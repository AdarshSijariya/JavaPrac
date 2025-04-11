class X1 {
    int a = 23;
}

class A1 extends X1 {
    int a = 12;

    {
        int a = 8;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}