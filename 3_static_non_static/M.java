class Circle {
    /*static*/ int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 123;
        Circle c2 = new Circle();
        c2.radius = 54; 

        defineCircle();
    }

    void defineCircle() {
        System.out.println("Circle is a ..............................................");
    }

    static float getPi() {
        return pi;
    }

    /*static*/ void calcArea() {
        System.out.println(pi * radius * radius);
    }
}



// M.java:11: error: non-static method defineCircle() cannot be referenced from a static context
//         defineCircle();
//         ^
// 1 error