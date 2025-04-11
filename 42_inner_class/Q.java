class XX {
    static class YY {

    }
}

class Q {
    public static void main(String[] args) {
        //Case 3:
        XX.YY e = new XX.YY();

        //Case 2:
        // XX.YY e; 

        //Case 1:
        // YY w;
    }    
}
