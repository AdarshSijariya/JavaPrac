class Animal {
    int x = 2;

    Animal() {
        super();

        System.out.println("Animal() - " + this);
    }
}

abstract class Dog extends Animal {
    int y = 7;

    Dog() {
        super();
        System.out.println("Dog() - " + this);
    }
}

class BDog extends Dog {
    int z = 5;

    BDog() {
        super();
        System.out.println("BDog() - " + this);
    }
}

class V {
    public static void main(String[] args) {
        BDog h = new BDog();

        System.out.println(h.x);
        System.out.println(h.y);
        System.out.println(h.z);

        System.out.println(h);

        // Dog j = new Dog();
    }    
}
