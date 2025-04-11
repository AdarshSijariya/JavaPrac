import java.io.Console;

class C {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a number: ");
        String input = con.readLine();

        System.out.println(input + 2);
    }    
}
