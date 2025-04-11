class N {
    int d = 1;

    class X {

    }
    
    public static void main(String[] args) {
        N n = new N();
        X x = n.new X();

        System.out.println(x.d);   //not ok
    }
}



// N.java:12: error: cannot find symbol
//         System.out.println(x.d);
//                             ^
//   symbol:   variable d
//   location: variable x of type N.X
// 1 error