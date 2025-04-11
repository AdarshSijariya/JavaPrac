class A {
    int x = 2;
}

class B extends A {
    int x = 5;
}

class Test {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.x);
    }
}