abstract class AA {

}

class BB extends AA {

}

class U {
    public static void main(String[] args) {
        //Case 3:
        AA x = new BB();
        System.out.println(x);

        //Case 2:
        // AA x = new AA();   //error: AA is abstract; cannot be instantiated
        
        //Case 1:
        // AA x;    
    }    
}
