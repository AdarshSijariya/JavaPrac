interface V3 {
    void pro();
}


class L2 implements V3 {
    public void pro() {
        System.out.println("Hello");
    }        

    public static void main(String[] args) {
        L2 x = new L2();

        x.pro();
    }
}
