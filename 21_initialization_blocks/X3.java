class X3 {
    static {
        Animal a = new Animal();

        Cat c = (Cat)a;
    }

    public static void main(String[] args) {
        
    }    
}


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ClassCastException: class Animal cannot be cast to class Cat (Animal and Cat are in unnamed module of loader 'app')
//         at X3.<clinit>(X3.java:5)
