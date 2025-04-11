//input: <no-argument>

class T1 {
    public static void main(String[] args) {
        System.out.println(1);

        if(args.length == 0) {
            try {
                MissingCommandLineArgumentException x = new MissingCommandLineArgumentException();
                
                throw x;
            } catch(MissingCommandLineArgumentException e) {
                System.out.println(e);
            }
        }

        System.out.println(2);
    }    
}


class MissingCommandLineArgumentException extends RuntimeException {

}
