class AAAA {
    void pro() {
        System.out.println("Byeeeee.....!");
    }
}

class H {
    //anonymous inner class....
    AAAA z = new AAAA() {
        void pro() {
            System.out.println("Hellooooo .... !!");
        }
    };

    public static void main(String[] args) {
        H h = new H();

        h.z.pro();
    }
}
