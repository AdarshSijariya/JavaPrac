class F1 {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'A';
        byte bt = 2;
        short s = 3;
        int i = 4;
        long l = 5;
        float f = 6.0f;
        double d = 7.0;
        XYZ a1 = new XYZ();
        MNO a2 = new IJK();
        PQR a3 = new EFG();
        int[] a4 = new int[5];

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
class IJK extends MNO { }

interface PQR { }
class EFG implements PQR { }
