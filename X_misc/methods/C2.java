import java.util.Scanner;
class C2 {
    static int add(int a, int b){
        int result = a+b;
        return result;

    }    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();  
        System.out.println(add(a,b));
    }
}
