class B2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog b = new BDog();
       
        // Animal y = new BDog();

        LivingBeing y = new Cat();

        Animal[] x = {c, w, d, b, new Cat(), new BDog(), a, (Animal)y};     
        
        for(Animal anm : x) 
            System.out.println(anm);       
    }
}