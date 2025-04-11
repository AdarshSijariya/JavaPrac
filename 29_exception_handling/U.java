//input: <no-argument>

class U {
    public static void main(String[] args) {
        System.out.println(1);

        if(args.length == 0) {
            try {
                SomeArgumentMissingException x = new SomeArgumentMissingException("No Argument Found at command Line");
                
                throw x;
            } catch(SomeArgumentMissingException e) {
                System.out.println(e);
            }
        }

        System.out.println(2);
    }    
}


class SomeArgumentMissingException extends RuntimeException {
    SomeArgumentMissingException() {

    }

    SomeArgumentMissingException(String message) {
        super(message);
    }
}