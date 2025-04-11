class M {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        Animal y = new Cat();

        x[0] = new Dog();
        x[1] = (Dog)y;
    }    
}