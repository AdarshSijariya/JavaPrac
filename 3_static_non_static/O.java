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

    static void defineCircle() {
        System.out.println("Circle is a ..............................................");
    }
}