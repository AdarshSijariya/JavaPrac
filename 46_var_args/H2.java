class H2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog b = new BDog();
        Animal a = new Animal();
        LivingBeing lb = new BDog();

        pro(c, w, d, b, a, (Animal)lb);
    }

    //Animal-Var-Arg Parameterized Method pro()
    static void pro(Animal... x) {
        for(Animal next : x) {
            System.out.println(next + " ###");
        }
    }
}
