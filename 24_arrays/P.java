class P {
    public static void main(String[] args) {
        
        ZC[] y = new ZC[2];
        System.out.println(y[0]);
        System.out.println(y[1]);

        y[0] = new ZX();
        y[1] = new ZX();

        System.out.println(y[0]);
        System.out.println(y[1]);
    }    
}

interface ZC { }


class ZX implements ZC { }