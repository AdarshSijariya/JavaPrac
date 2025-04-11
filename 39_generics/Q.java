import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<Animal> l1 = new ArrayList<Animal>();

        l1.add(new Animal());
        l1.add(new Cat());
        l1.add(new Cow());
        l1.add(new Dog());
        l1.add(new BDog());

        System.out.println(l1);
    }    
}


class LivingBeing { } 
class Animal extends LivingBeing { } 
class Cat extends Animal { } 
class Cow extends Animal { } 
class Dog extends Animal { } 
class BDog extends Dog { } 