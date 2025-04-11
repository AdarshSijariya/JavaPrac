class A {
    public static void main(String[] args) {
        System.out.println(1);

        int x = 23 / 0;

        System.out.println(2);
    }
}


// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:5)