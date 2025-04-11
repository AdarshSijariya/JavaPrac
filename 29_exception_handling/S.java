//input: 2

class S {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int i = Integer.parseInt(args[0]);
            
            int[] x = {12, 13, 14};
            System.out.println(x[i]);

            String str = "ram";
            System.out.println(str.charAt(i+1));

        } catch(IndexOutOfBoundsException e) {
            System.out.println(e);        
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println(2);
    }    
}


// S.java:18: error: exception ArrayIndexOutOfBoundsException has already been caught
//         }catch(ArrayIndexOutOfBoundsException e) {
//          ^
// 1 error
