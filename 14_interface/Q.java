interface U3 {
    int t = 333;
}

class Q implements U3 {
    public static void main(String[] args) {
        System.out.println(Q.t);
    }
}
