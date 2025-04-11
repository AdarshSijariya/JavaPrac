class C {
    int z;

    static int t;
    
    public static void main(String[] args) {
        int y;
        
        C c = new C();

        System.out.println(c.z);
        
        System.out.println(t);
        
        // System.out.println(y);

        int[] m = new int[2];

        System.out.println(m[0]);
        System.out.println(m[1]);
    }    
}



// C.java:15: error: variable y might not have been initialized
//         System.out.println(y);
//                            ^
// 1 error
