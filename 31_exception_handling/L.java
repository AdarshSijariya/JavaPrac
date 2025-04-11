class XX {
    void pro() {
        System.out.println("pro in XX");
    }
}

class YY extends XX {
    void pro(int y) {
        System.out.println("pro in YY");
    }
}

class L {
    public static void main(String[] args) {
        XX x = new YY();

        x.pro();
    }    
}
