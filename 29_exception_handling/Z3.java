class Z3 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            throw new RuntimeException();
        } catch(Object x) {
            System.out.println(x);
        }

        System.out.println(2);
    }    
}


// Z3.java:7: error: incompatible types: Object cannot be converted to Throwable
//         } catch(Object x) {
//                 ^
// 1 error
