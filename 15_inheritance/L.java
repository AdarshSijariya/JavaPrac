class HH {
    void pro() {
        System.out.println("Hello");
    }
}

class RR extends HH { }

class JJ extends HH { }

class YY extends HH { }

class L {
    public static void main(String[] args) {
        RR a = new RR();
        JJ b = new JJ();
        YY c = new YY();

        a.pro();
        b.pro();
        c.pro();
    }
}


// Heirachichal Inheritance