class Circle {
    /*static*/ int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 123;
        Circle c2 = new Circle();
        c2.radius = 54; 

        float f = getPi();

        System.out.println(f);
    }

    float getPi() {
        return pi;
    }

    /*static*/ void calcArea() {
        System.out.println(pi * radius * radius);
    }
}




// J.java:11: error: non-static method getPi() cannot be referenced from a static context
//         getPi();
//         ^
// 1 error