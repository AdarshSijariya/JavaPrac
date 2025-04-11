
class C {
    public static void main(String[] args) {
        abc();
    }

    void abc() {
        System.out.println("Hello");
    }
}



// C.java:3: error: non-static method abc() cannot be referenced from a static context
//         abc();
//         ^
// 1 error