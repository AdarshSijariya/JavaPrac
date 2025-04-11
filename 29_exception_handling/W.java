//input: <no-input>, 0, 1, 2, 3, a

class W {
    public static void main(String[] args) {

        System.out.println("1");
        
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("2");
            
            int[] x = {3, 0 ,2};
            System.out.println(x[i]);
            System.out.println("3");
            
            int y = 12/x[i];
            System.out.println("4");
        } catch(ArithmeticException e) {
            System.out.println("Some Other Solution");
        // } catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Same Solution");
        // } catch(NumberFormatException e) {
        //     System.out.println("Same Solution");
        // }
        } catch(Exception e) {
            System.out.println("Same Solution");
        }

        System.out.println("5");
    }    
}
