import java.util.Scanner;
class B {
    static int addTwo(int a, int b){
       int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addTwo(a,b);
        System.out.println(sum);
    }
}
