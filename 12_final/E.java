class AA {
    void aaa() {
        System.out.println("aaa in A");    
    }

    void bbb() {
        System.out.println("bbb in A");    
    }
    
    void ccc() {
        System.out.println("ccc in A");    
    }
}

class E extends AA {
    void aaa() {
        System.out.println("aaa in E");
    }

    void bbb() {
        System.out.println("bbb in E");
    }

    void ccc() {
        System.out.println("ccc in E");
    }

    public static void main(String[] args) {
        // AA x = new AA();
        E x = new E();

        x.aaa();
        x.bbb();
        x.ccc();
    }
}
