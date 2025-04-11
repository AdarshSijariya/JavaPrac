import java.io.Console;

class D {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a number: ");
        String input = con.readLine();

        int val = Integer.parseInt(input);

        // System.out.println(input + 2);
        System.out.println(val + 2);
    }    
}
