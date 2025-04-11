final class Y {
    int x = 90;
}


class D {
    public static void main(String[] args) {
        Y a = new Y();

        System.out.println(a.x);
        
        a.x = 88;

        System.out.println(a.x);
    }
}
