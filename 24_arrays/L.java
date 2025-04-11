class L {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] = (Dog)new Cat();
    }    
}


// L.java:6: error: incompatible types: Cat cannot be converted to Dog
//         x[1] = (Dog)new Cat();
//                     ^
// 1 error