class Z4 extends RuntimeException {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            
        } catch(Z4 x) {
            System.out.println(x);
        }

        System.out.println(2);
    }    
}


// Z4.java:7: error: incompatible types: Z4 cannot be converted to Throwable
//         } catch(Z4 x) {
//                 ^
// 1 error