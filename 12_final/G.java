/*final*/ class CC {
    void aaa() {
        System.out.println("aaa in CC");    
    }

    final void bbb() {
        System.out.println("bbb in CC");    
    }
    
    void ccc() {
        System.out.println("ccc in CC");    
    }
}

class G extends CC {  
    void aaa() {
        System.out.println("aaa in G");    
    }

    /*
    void bbb() {
        System.out.println("bbb in G");    
    }
    */
    
    void ccc() {
        System.out.println("ccc in G");    
    }
    
    public static void main(String[] args) {
        // CC x = new CC();
        G x = new G();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}


// G.java:20: error: bbb() in G cannot override bbb() in CC
//     void bbb() {
//          ^
//   overridden method is final
// 1 error