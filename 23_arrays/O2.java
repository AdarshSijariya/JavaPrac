import java.util.Scanner;

class Student {
    String name;
    int age;

    static Scanner sc = new Scanner(System.in);

    Student() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    void showInfo(int i) {
        System.out.println("Student: " + (i+1));
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("~~~~~~~~~~~~");
    }
}

class O2 {
    public static void main(String[] args) {        
        
        Student[] x = new Student[3];

        for(int i=0; i < x.length; i++) {
            x[i] = new Student();
        }

        System.out.println("+++++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            x[i].showInfo(i);        
        }
    }
}
