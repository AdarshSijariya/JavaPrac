// assert(keyword)

//we assert some thing is true

class B {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);

        if(t<12)
            t /= 2;
        else 
            t *= 2;
            
        assert(t>4);

        System.out.println("Hello");
    }       
}
