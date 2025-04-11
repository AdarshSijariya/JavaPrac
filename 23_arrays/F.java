class F {

    public static void main(String[] args) {
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



// F.java:17: error: variable b might not have been initialized
//         System.out.println("boolean variable: " + b);
//                                                   ^
// F.java:18: error: variable c might not have been initialized
//         System.out.println("char variable: " + (int)c);
//                                                     ^
// F.java:19: error: variable bt might not have been initialized
//         System.out.println("byte variable: " + bt);
//                                                ^
// F.java:20: error: variable s might not have been initialized
//         System.out.println("short variable: " + s);
//                                                 ^
// F.java:21: error: variable i might not have been initialized
//         System.out.println("int variable: " + i);
//                                               ^
// F.java:22: error: variable l might not have been initialized
//         System.out.println("long variable: " + l);
//                                                ^
// F.java:23: error: variable f might not have been initialized
//         System.out.println("float variable: " + f);
//                                                 ^
// F.java:24: error: variable d might not have been initialized
//         System.out.println("double variable: " + d);
//                                                  ^
// F.java:25: error: variable a1 might not have been initialized
//         System.out.println("class XYZ variable: " + a1);
//                                                     ^
// F.java:26: error: variable a2 might not have been initialized
//         System.out.println("abstract class MNO variable: " + a2);
//                                                              ^
// F.java:27: error: variable a3 might not have been initialized
//         System.out.println("interface PQR variable: " + a3);
//                                                         ^
// F.java:28: error: variable a4 might not have been initialized
//         System.out.println("int[] variable: " + a4);
//                                                 ^
// 12 errors