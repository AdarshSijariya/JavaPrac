final class BB {
    void aaa() {
        System.out.println("aaa in BB");    
    }

    void bbb() {
        System.out.println("bbb in BB");    
    }
    
    void ccc() {
        System.out.println("ccc in BB");    
    }
}

class F /*extends BB*/ {
    void aaa() {
        System.out.println("aaa in F");
    }

    void bbb() {
        System.out.println("bbb in F");
    }

    void ccc() {
        System.out.println("ccc in F");
    }

    public static void main(String[] args) {
        // BB x = new BB();
        F x = new F();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}
