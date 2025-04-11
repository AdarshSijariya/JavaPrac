interface V {
    void pro();
}

class AA implements V {
    public void pro() {
        System.out.println("Dholu Bholu");
    }
}

class K {
    public static void main(String[] args) {
        V v = new AA();
        
        v.pro();
    }    
}