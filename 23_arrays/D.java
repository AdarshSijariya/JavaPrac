class D {
    boolean b;
    char c;
    byte bt;
    short s;
    int i;
    long l;
    float f;
    double d;

    XYZ a1;
    MNO a2;
    PQR a3;
    int[] a4;

    public static void main(String[] args) {
        D d = new D();

        System.out.println("boolean variable: " + d.b);
        System.out.println("char variable: " + (int)d.c);
        System.out.println("byte variable: " + d.bt);
        System.out.println("short variable: " + d.s);
        System.out.println("int variable: " + d.i);
        System.out.println("long variable: " + d.l);
        System.out.println("float variable: " + d.f);
        System.out.println("double variable: " + d.d);
        System.out.println("class XYZ variable: " + d.a1);
        System.out.println("abstract class MNO variable: " + d.a2);
        System.out.println("interface PQR variable: " + d.a3);
        System.out.println("int[] variable: " + d.a4);
    }
}

class XYZ {  }

abstract class MNO { }

interface PQR { }