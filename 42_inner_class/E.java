interface G {
    void pro();
}

class AA implements G {
    public void pro() {
        System.out.println("Hi");
    }
}

class E {
    public static void main(String[] args) {
        AA a = new AA();

        a.pro();
    }
}
