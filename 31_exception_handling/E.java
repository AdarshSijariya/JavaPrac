class E {
    public static void main(String[] args) {
        try {

        } catch(ArithmeticException e) {

        } catch(NullPointerException e) {

        } finally {

        } catch(ArrayIndexOutOfBoundsException e) {

        }
    }    
}

// E.java:11: error: 'catch' without 'try'
//         } catch(ArrayIndexOutOfBoundsException e) {
//           ^
// 1 error

