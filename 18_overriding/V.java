class Animal { 
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal { 
    void makeSound() {
        System.out.println("Cat Sound");
    }
}

class Cow extends Animal { 
    void makeSound() {
        System.out.println("Cow Sound");
    }
}

class Dog extends Animal { 
    void makeSound() {
        System.out.println("Dog Sound");
    }
}

class V {
    // static void playSound(Cat cat) {
    //     cat.makeSound();
    // }

    static void playSound(Cow cow) {
        cow.makeSound();
    }

    static void playSound(Dog dog) {
        dog.makeSound();
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        
        V.playSound(c);   //Compile Time Polymorphism

        // Cow w = new Cow();

        // V.playSound(w);

        // Dog d = new Dog();

        // V.playSound(d);
    }
}
