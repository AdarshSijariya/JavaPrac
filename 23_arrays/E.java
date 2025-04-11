class E {
    static boolean b;
    static char c;
    static byte bt;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;

    static XYZ a1;
    static MNO a2;
    static PQR a3;
    static int[] a4;

    public static void main(String[] args) {
        
        System.out.println("boolean variable: " + b);
        System.out.println("char variable: " + (int)c);
        System.out.println("byte variable: " + bt);
        System.out.println("short variable: " + s);
        System.out.println("int variable: " + i);
        System.out.println("long variable: " + l);
        System.out.println("float variable: " + f);
        System.out.println("double variable: " + d);
        System.out.println("class XYZ variable: " + a1);
        System.out.println("abstract class MNO variable: " + a2);
        System.out.println("interface PQR variable: " + a3);
        System.out.println("int[] variable: " + a4);
    }
}

class XYZ {  }

abstract class MNO { }

interface PQR { }