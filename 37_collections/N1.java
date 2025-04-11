import java.util.HashMap;

class N1 {
    public static void main(String[] args) {
        HashMap<Student, College> map = new HashMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
        
        System.out.println(map);

        map.put(new Student("rom", 18), new College("SGBM"));
        
        System.out.println(map);        
    }
}

class Student {
    static String abc = " abcdefghijklmnopqrstuvwxyz";
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj != null && obj instanceof Student) {
            Student e1 = this;
            Student e2 = (Student)obj;

            String nm1 = e1.name;
            String nm2 = e2.name;

            int ag1 = e1.age;
            int ag2 = e2.age;

            flag = nm1.equals(nm2) && ag1 == ag2;
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        for(int i=0; i < name.length(); i++) {
            sum += abc.indexOf(name.charAt(i));
        }

        sum += age;

        return sum;
    }
}

class College {
    String name;    

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}