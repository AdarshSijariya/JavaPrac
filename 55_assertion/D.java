// assert(keyword)

//we assert some thing is true

class D {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);

        if(t<12)
            t /= 2;
        else 
            t *= 2;
            
        assert(t>4):"some thing went wrong... 't' must be greater than 4 " + t++;

        System.out.println("Hello " + t);
    }       
}
