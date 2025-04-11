
class Car {

}

class SportsCar extends Car {

}

class E {
    void pro(Car car) {
        System.out.println("Car");
    }   
    
    void pro(SportsCar sp) {
        System.out.println("SportsCar");
    }

    public static void main(String[] args) {
        Car c = new SportsCar();

        E e = new E();

        e.pro(c);
    }
}
