class SuperHuman {
    
}

class SpiderMan extends SuperHuman {
    
}

class ChhotaSpiderMan extends SpiderMan {

}

class ShaktiMan extends SuperHuman {
    
}

class S {
    public static void main(String[] args) {
        SuperHuman sh = new SpiderMan();

        SpiderMan y1 = (SpiderMan)sh;
        ChhotaSpiderMan y2 = (ChhotaSpiderMan)sh;
    }    
}