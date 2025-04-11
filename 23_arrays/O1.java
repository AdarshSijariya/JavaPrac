import java.util.Scanner;

class Student {
    String name;
    int age;
}

class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[] x = new Student[4];

        for(int i=0; i < x.length; i++) {
            Student st = new Student();
            System.out.print("Enter Name: ");
            st.name = sc.nextLine();
            System.out.print("Enter Age: ");
            st.age = sc.nextInt();
            sc.nextLine();
            x[i] = st;
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
