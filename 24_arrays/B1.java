class B1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Cow w = new Cow();
        Dog d = new Dog();
        BDog b = new BDog();
       
        // Animal y = new BDog();

        LivingBeing y = new BDog();

        Animal[] x = {c, w, d, b, new Cat(), new BDog(), a, y};     
        
        for(Animal anm : x) 
            System.out.println(anm);       
    }
}


// B1.java:13: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal[] x = {c, w, d, b, new Cat(), new BDog(), a, y};
//                                                             ^
// 1 error

