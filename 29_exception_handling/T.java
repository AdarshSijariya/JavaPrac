//input: <no-argument>

class T {
    public static void main(String[] args) {
        System.out.println(1);

        if(args.length == 0) {
            CommandlineArgumentMissingException x = new CommandlineArgumentMissingException();
            
            throw x;
        }

        System.out.println(2);
    }    
}


class CommandlineArgumentMissingException extends RuntimeException {

}

// 1
// Exception in thread "main" CommandlineArgumentMissingException
//         at T.main(T.java:8)