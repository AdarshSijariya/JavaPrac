class A {
    public static void main(String[] args) {
        Z a = new Z();

        Y b = new Z();

        X c = new Z();

        Object d = new Z();
    }
}

class X { }

class Y extends X {  }

class Z extends Y {  }