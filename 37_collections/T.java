import java.util.TreeMap;

class T {
    public static void main(String[] args) {
        TreeMap<Student, College> map = new TreeMap<Student, College>();
        
        map.put(new Student("om", 21), new College("SRIT"));
        map.put(new Student("rom", 18), new College("JEC"));
        map.put(new Student("vyom", 22), new College("GGCT"));
        map.put(new Student("ehom", 19), new College("Global"));
        map.put(new Student("wom", 20), new College("GGITS"));
                 
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



// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at T.main(T.java:7)
