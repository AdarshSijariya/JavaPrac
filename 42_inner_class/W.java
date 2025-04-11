interface XX {

    //implicitly static 
    class YY {

    }
}

class W {
    public static void main(String[] args) {
        XX.YY y = new XX.YY();
    }
}