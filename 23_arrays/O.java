import java.util.Scanner;

class Student {
    String name;
    int age;
}

class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[] x = new Student[4];

        for(int i=0; i < x.length; i++) {
            x[i] = new Student();
            System.out.print("Enter Name: ");
            x[i].name = sc.nextLine();
            System.out.print("Enter Age: ");
            x[i].age = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("+++++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            System.out.println("Student: " + (i+1));
            System.out.println("Name: " + x[i].name);
            System.out.println("Age: " + x[i].age);
            System.out.println("++++++++++++++");
        }
    }
}
