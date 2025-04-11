@interface Info {
    String college();
    int rank();
}

@Info
class Student {
    String name;
    int age;
}

class U {
    public static void main(String[] args) {
        
    }
}


// U.java:6: error: annotation @Info is missing default values for elements college,rank
// @Info
// ^
// 1 error