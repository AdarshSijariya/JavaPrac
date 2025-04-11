import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        r1.addCar(new Car());
        Car car = r1.getCar();

        BusRental r2 = new BusRental();
        r2.addBus(new Bus());
        Bus bus = r2.getBus();
    }
}

class Bus {

}

class BusRental {
    ArrayList<Bus> buses = new ArrayList<Bus>();

    void addBus(Bus bus) {
        buses.add(bus);
    }

    Bus getBus() {
        return buses.remove(0);
    }
}

class Car {

}

class CarRental {
    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car getCar() {
        return cars.remove(0);
    }
}