class C {
    int a;    

    void abc() {

    }    

    static void mno() {
        // a = 89;

        // abc();
    }
}


// C.java:9: error: non-static variable a cannot be referenced from a static context
//         a = 89;
//         ^
// 1 error


// C.java:11: error: non-static method abc() cannot be referenced from a static context
//         abc();
//         ^
// 1 error