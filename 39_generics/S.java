import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        //Case 1:
        // ArrayList<Object> l1 = new ArrayList<Object>();
        // ArrayList<Object> l2 = new ArrayList<Cat>();
        // ArrayList<Object> l3 = new ArrayList<Cow>();
        // ArrayList<Object> l4 = new ArrayList<Car>();
        // ArrayList<Object> l5 = new ArrayList<Integer>();
        // ArrayList<Object> l6 = new ArrayList<String>();
        
        //Case 2:
        // ArrayList<? extends Object> l1 = new ArrayList<Object>();
        // ArrayList<? extends Object> l2 = new ArrayList<Cat>();
        // ArrayList<? extends Object> l3 = new ArrayList<Cow>();
        // ArrayList<? extends Object> l4 = new ArrayList<Car>();
        // ArrayList<? extends Object> l5 = new ArrayList<Integer>();
        // ArrayList<? extends Object> l6 = new ArrayList<String>();
        
        //Case 3:
        // ArrayList<?> l1 = new ArrayList<Object>();
        // ArrayList<?> l2 = new ArrayList<Cat>();
        // ArrayList<?> l3 = new ArrayList<Cow>();
        // ArrayList<?> l4 = new ArrayList<Car>();
        // ArrayList<?> l5 = new ArrayList<Integer>();
        // ArrayList<?> l6 = new ArrayList<String>();
    }
}

class Car { }