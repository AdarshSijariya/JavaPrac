import java.util.ArrayList;

class R {
    public static void main(String[] args) {
        
        //Case 1:
        // ArrayList<? super Dog> l1 = new ArrayList<Dog>();
        // l1.add(new Car());
        // l1.add(new Object());
        // l1.add(new LivingBeing());
        // l1.add(new Animal());
        // l1.add(new Cat());        
        // l1.add(new Dog());
        // l1.add(new BDog());

        //Case X:
        // ArrayList<? super Dog> l2 = new ArrayList<BDog>();
        
        //Case 2:
        // ArrayList<? super Dog> l1 = new ArrayList<Animal>();
        // l1.add(new Car());
        // l1.add(new Object());
        // l1.add(new LivingBeing());
        // l1.add(new Animal());
        // l1.add(new Cat());        
        // l1.add(new Dog());
        // l1.add(new BDog());
        
        //Case 3:
        // ArrayList<? super Dog> l1 = new ArrayList<LivingBeing>();
        // l1.add(new Car());
        // l1.add(new Object());
        // l1.add(new LivingBeing());
        // l1.add(new Animal());
        // l1.add(new Cat());        
        // l1.add(new Dog());
        // l1.add(new BDog());
        
        //Case 4:
        // ArrayList<? super Dog> l1 = new ArrayList<Object>();
        // l1.add(new Car());
        // l1.add(new Object());
        // l1.add(new LivingBeing());
        // l1.add(new Animal());
        // l1.add(new Cat());        
        // l1.add(new Dog());
        // l1.add(new BDog());
    }    
}


class LivingBeing { } 
class Animal extends LivingBeing { } 
class Cat extends Animal { } 
class Cow extends Animal { } 
class Dog extends Animal { } 
class BDog extends Dog { } 

class Car { } 