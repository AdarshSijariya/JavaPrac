import java.util.ArrayList;

class Q1 {
    public static void main(String[] args) {
        ArrayList<Animal> l1 = new ArrayList<Animal>();

        l1.add(new Animal());
        l1.add(new Cat());
        l1.add(new Cow());
        l1.add(new Dog());
        l1.add(new BDog());

        LivingBeing t = new Cat();
        l1.add(t);

        System.out.println(l1);
    }    
}

// Q1.java:14: error: incompatible types: LivingBeing cannot be converted to Animal
//         l1.add(t);
//                ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error



class LivingBeing { } 
class Animal extends LivingBeing { } 
class Cat extends Animal { } 
class Cow extends Animal { } 
class Dog extends Animal { } 
class BDog extends Dog { } 