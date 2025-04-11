class H1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog b = new BDog();
        Animal a = new Animal();
        LivingBeing lb = new BDog();

        pro(c, w, d, b, a, lb);
    }

    //Animal-Var-Arg Parameterized Method pro()
    static void pro(Animal... x) {
        for(Animal next : x) {
            System.out.println(next + " ###");
        }
    }
}



// H1.java:10: error: method pro in class H1 cannot be applied to given types;
//         pro(c, w, d, b, a, lb);
//         ^
//   required: Animal[]
//   found: Cat,Cow,Dog,BDog,Animal,LivingBeing
//   reason: varargs mismatch; LivingBeing cannot be converted to Animal
// 1 error
