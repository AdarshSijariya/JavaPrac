interface CC {

}

class DD implements CC {

}

class W {
    public static void main(String[] args) {
        
        //Case 3:
        CC x = new DD();
        System.out.println(x);

        //Case 2:
        // CC x = new CC();    //  error: CC is abstract; cannot be instantiated
        
        //Case 1:
        //CC e;    
    }    
}
