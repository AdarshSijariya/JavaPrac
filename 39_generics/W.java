interface QQ<A,B> {
    
}

class WW<A,B,C> implements QQ {

}

class W {
    public static void main(String[] args) {
        QQ<String,Integer> x = new WW<String,Integer,Double>();
    }
}