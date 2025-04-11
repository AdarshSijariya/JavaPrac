class D {
    public static void main(String[] args) {
        boolean x = true;

        String str = x.toString();

        System.out.println(str);
    }    
}


// D.java:5: error: boolean cannot be dereferenced
//         String str = x.toString();
//                       ^
// 1 error
