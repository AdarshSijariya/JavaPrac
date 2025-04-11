class A11 {
    private A11() {

    }

    static A11 pro() {
        //some code
        //some more code

        A11 q = new A11();
        
        return q;
    }
}

class Y2 {
    public static void main(String[] args) {
        A11 x = A11.pro();
    }    
}
