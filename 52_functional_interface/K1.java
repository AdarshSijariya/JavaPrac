interface V {
    void pro();
}

// class AA implements V {
//     public void pro() {
//         System.out.println("Dholu Bholu");
//     }
// }

// public void pro() {
//     System.out.println("Dholu Bholu");
// }

// () -> System.out.println("Indrawarma");

class K1 {
    public static void main(String[] args) {
        // V v = new AA();
        V v = () -> System.out.println("Indrawarma");
        
        v.pro();
    }    
}