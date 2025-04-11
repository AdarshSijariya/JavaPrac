class Circle {
    static int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 123;
        Circle c2 = new Circle();
        c2.radius = 54;
        Circle c3 = new Circle();
        c3.radius = 78;
        Circle c4 = new Circle();
        c4.radius = 12;

        System.out.println(c1.radius);
        System.out.println(c2.radius);
        System.out.println(c3.radius);
        System.out.println(c4.radius);
    }
}