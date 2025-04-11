class Circle {
    /*static*/ int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Circle c2 = new Circle();
        c2.radius = 100; 

        float f1 = c1.calcArea();
        System.out.println(f1 + "++++++");
    }

    float calcArea() {
        return pi * radius * radius;
    }
}