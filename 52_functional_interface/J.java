interface V {
    void pro();
}

class J {
    public static void main(String[] args) {
        V v = new V();
        
        v.pro();
    }    
}


// J.java:7: error: V is abstract; cannot be instantiated
//         V v = new V();
//               ^
// 1 error
