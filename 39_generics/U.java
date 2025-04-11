import java.util.ArrayList;

class U {
    public static void main(String[] args) {
        Rental<Car> r1 = new Rental<Car>();
        r1.add(new Car());
        // r1.add(new Bus());
        Car car = r1.get();
        // Bus bus = r1.get();

        Rental<Bus> r2 = new Rental<Bus>();
        r2.add(new Bus());
        // r2.add(new Car());
        Bus bus = r2.get();
        Car c1 = r2.get();
    }
}

class Bus { }

class Car {  }

class Rental<I> {
    ArrayList<I> items = new ArrayList<I>();

    void add(I item) {
        items.add(item);
    }

    I get() {
        return items.remove(0);
    }
} 

// class CarRental {
//     ArrayList<Car> cars = new ArrayList<Car>();

//     void addCar(Car car) {
//         cars.add(car);
//     }

//     Car getCar() {
//         return cars.remove(0);
//     }
// }

// class BusRental {
//     ArrayList<Bus> buses = new ArrayList<Bus>();

//     void addBus(Bus bus) {
//         buses.add(bus);
//     }

//     Bus getBus() {
//         return buses.remove(0);
//     }
// }