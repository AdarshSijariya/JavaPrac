import java.util.Scanner;
class C {
    int add(int a, int b){
        int result = a+b;
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        C obj = new C();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.add(a,b));
    }
}
