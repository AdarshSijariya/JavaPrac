abstract class Q {
    abstract int add(int x, int y);
}

class P {
    public static void main(String[] args) {
        Q r = (a,b) ->  a+b;
    
        int result = r.add(12, 13);
    
        System.out.println(result);
    }    
}


// P.java:7: error: incompatible types: Q is not a functional interface
//         Q r = (a,b) ->  a+b;
//               ^
// 1 error