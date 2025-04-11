class Circle {
    /*static*/ int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 123;
        Circle c2 = new Circle();
        c2.radius = 54; 

        float f1 = c1.getPi();
        float f2 = c2.getPi();

        System.out.println(f1);
        System.out.println(f2);
    }

    float getPi() {
        return pi;
    }

    /*static*/ void calcArea() {
        System.out.println(pi * radius * radius);
    }
}