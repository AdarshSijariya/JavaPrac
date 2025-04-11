import java.util.ArrayList;

class P {
    public static void main(String[] args) {
        ArrayList<? super Dog> l1 = new ArrayList<Dog>();
        // ArrayList<? super Dog> l2 = new ArrayList<BDog>();
        ArrayList<? super Dog> l3 = new ArrayList<Animal>();
        ArrayList<? super Dog> l4 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> l5 = new ArrayList<Object>();
    }    
}


class LivingBeing { } 
class Animal extends LivingBeing { } 
class Cat extends Animal { } 
class Cow extends Animal { } 
class Dog extends Animal { } 
class BDog extends Dog { } 