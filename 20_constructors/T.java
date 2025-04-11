class Shape {
    int length;
    int width;
    int height;

    Shape(int length) {
        this.length = length;
    }

    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    } 
}

class T {
    public static void main(String[] args) {
        Shape s1 = new Shape(12);
        Shape s2 = new Shape(14, 19);
        Shape s3 = new Shape(23, 56, 78);
    }
}
