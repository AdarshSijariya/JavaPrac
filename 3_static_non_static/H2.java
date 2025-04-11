class Circle {
    /*static*/ int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 123;
        Circle c2 = new Circle();
        c2.radius = 54; 

        calcArea(c2);
        calcArea(c1);
    }

    static void calcArea(Circle z) {
        System.out.println(pi * z.radius * z.radius);
    }
}

