import java.io.Console;

class A {
    public static void main(String[] args) {
        Console c1 = System.console();
        Console c2 = System.console();
        Console c3 = System.console();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}