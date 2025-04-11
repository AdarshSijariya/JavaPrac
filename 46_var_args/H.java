class H {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog b = new BDog();
        Animal a = new Animal();

        pro(c, w, d, b, a);
    }

    //Animal-Var-Arg Parameterized Method pro()
    static void pro(Animal... x) {
        for(Animal next : x) {
            System.out.println(next + " ###");
        }
    }
}

class LivingBeing { }

class Animal extends LivingBeing { }

class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }