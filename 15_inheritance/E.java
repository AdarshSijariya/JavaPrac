interface Y {  }

class A implements Y {  }

interface T {  }

interface Z extends T { }

class B extends A implements Z {   }

class C extends B { }

class E {
    public static void main(String[] args) {
        C x = new C();

        System.out.println(x instanceof C);
        System.out.println(x instanceof B);
        System.out.println(x instanceof A);
        System.out.println(x instanceof Object);
        System.out.println(x instanceof Y);
        System.out.println(x instanceof Z);
        System.out.println(x instanceof T);
    }
}