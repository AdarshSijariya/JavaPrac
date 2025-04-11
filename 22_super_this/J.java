class J {
    J pro() {
        return this;
    }

    public static void main(String[] args) {
        J x = new J();

        J y = x.pro();

        if(x == y) {
            System.out.println("Same");
        }
    }    
}
