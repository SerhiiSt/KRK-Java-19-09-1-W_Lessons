package pl.itacademy.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarTester {

    public static void main(String[] args) {
        Map<Car, Engine> sportCar = new HashMap<>();
        final Engine sportEngine = new Engine("sport engine", 234, 3);
        Engine smallEngine = new Engine("small engine", 89, 1);

        final Wheel sportWheel = new Wheel(20, 12);
        Wheel smallWheels = new Wheel(10, 5);
        List<Wheel> listOfWheels = new ArrayList<>();
        listOfWheels.add(sportWheel);
        listOfWheels.add(smallWheels);

        sportWheel.setWidth(21);


        Car bmw = Car.createCar("BMW", "BWM-345", sportEngine, listOfWheels);
        Car mercedes = Car.createCar("Mercedes-Benz", "GLS-320", sportEngine, listOfWheels);

        sportCar.put(bmw, sportEngine);
        sportCar.put(mercedes, smallEngine);

        System.out.println("List of cars :" + sportCar);

        smallWheels.setRadius(12);
        smallWheels.setWidth(10);

        smallEngine.setHorsePower(99);

        System.out.println("List of cars :" + sportCar);

        Car toyota = Car.createCar("Toyota", "Camry", sportEngine, listOfWheels);
        System.out.println(toyota);
        System.out.println(toyota.hashCode());

        toyota.getEngine().setHorsePower(456);
        toyota.getEngine().setVolume(1);
        toyota.getEngine().setType("test");
        System.out.println(toyota.hashCode());


    }


}
