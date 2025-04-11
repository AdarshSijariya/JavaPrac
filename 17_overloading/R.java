class Methi { }

class Palak {  }

class Bathua {  }

class R {
    // static void prepareBathua(Bathua b) {
    static void prepareLeafyVegetable(Bathua b) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
        System.out.println("step 4");
        System.out.println("step 5");
    }
    
    // static void preparePalak(Palak p) {
    static void prepareLeafyVegetable(Palak p) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
    } 
    
    static void prepareLeafyVegetable(Methi m) {
        System.out.println("step 1");
        System.out.println("step 2");
        System.out.println("step 3");
        System.out.println("step 4");
    }


    public static void main(String[] args) {
        Methi m = new Methi();
        Palak p = new Palak();
        Bathua b = new Bathua();
        
        // prepareBathua(b);
        // preparePalak(p);
        // prepareMethi(m);

        prepareLeafyVegetable(p);
        prepareLeafyVegetable(m);
        prepareLeafyVegetable(b);
    }    
}
