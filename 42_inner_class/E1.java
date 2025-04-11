interface G1 {
    void pro();
}

// class AAA implements G1 {
//     public void pro() {
//         System.out.println("Hi");
//     }
// }

class E1 {
    public static void main(String[] args) {
        // AAA a = new AAA();
        
        //method local anonymous inner class... (class definition and instantiation is combined)
        G1 a = new G1() {
            public void pro() {
                System.out.println("Hellooooo!!!!");
            }
        };

        a.pro();
    }
}
