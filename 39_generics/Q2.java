import java.util.ArrayList;

class Q2 {
    public static void main(String[] args) {
        ArrayList<Animal> l1 = new ArrayList<Animal>();

        l1.add(new Animal());
        l1.add(new Cat());
        l1.add(new Cow());
        l1.add(new Dog());
        l1.add(new BDog());

        LivingBeing t = new Cat();
        l1.add((Cat)t);

        System.out.println(l1);
    }    
}