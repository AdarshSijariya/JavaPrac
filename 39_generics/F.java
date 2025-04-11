class F {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] = new Cat();
    }    
}

class Animal { }
class Cat extends Animal { }
class Dog extends Animal { }


// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at F.main(F.java:6)