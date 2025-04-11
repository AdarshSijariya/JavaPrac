class Vehicle { }

class Bus extends Vehicle { }

class Car extends Vehicle { }

class SportsCar extends Car { }

class K {
    public static void main(String[] args) {
        
        //Case 2:
        Car x = new SportsCar();
        
        if(x instanceof Bus) 
            System.out.println("SportsCar IS-A Bus");
        else
            System.out.println("SportsCar IS-Not-A Bus");
    }
}


// K.java:15: error: incompatible types: Car cannot be converted to Bus
//         if(x instanceof Bus)
//            ^
// 1 error