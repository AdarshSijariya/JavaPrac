class A {
    static int x = 12;
}

class B extends A {
    static int x = 15;
}

class Test {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.x);
    }
}