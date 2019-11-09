package pl.itacademy.lesson6;


public class CarTester {

    public static void main(String[] args) throws CloneNotSupportedException {

        Engine engine = new Engine("Diesel Engine", 260);
        Car volvo = new Car("Volvo", engine);

        Engine electricEngine = new Engine("Electric Engine", 200);
        ElectricCar bmwi3 = new ElectricCar("BWM i3", electricEngine);


        Engine petrol = new Engine("Petrol Engine", 320);
        FuelCar mb = new FuelCar("Mercedes Benz", petrol);



        Engine hybridEngine = new Engine("Petrol/Electric Engine", 290);
        HybridCar toyota = new HybridCar("Toyota", hybridEngine);

        System.out.println(engine);
        System.out.println(volvo);

        System.out.println(electricEngine);
        System.out.println(bmwi3);
        bmwi3.charge();

        System.out.println(petrol);
        System.out.println(mb);

        System.out.println(hybridEngine);
        System.out.println(toyota);
        toyota.tank();

        Engine clonedEngine = engine.clone();
        System.out.println("Cloned object " + clonedEngine);
        FuelCar clonedFuelCar = mb.clone();
        System.out.println("Cloned object " + clonedFuelCar);


        if (mb == clonedFuelCar) {
            System.out.println("Cars are the same by object reference");
        }

        if (mb.equals(clonedFuelCar)) {
            System.out.println("Cars are equal by equals() method");
        }


        Car[] cars = new Car[4];
        cars[0] = volvo;
        cars[1] = bmwi3;
        cars[2] = mb;
        cars[3] = toyota;


        System.out.println("Hash values for some objects");
        for (Car car : cars){
            System.out.println(car.hashCode() + " " + car.getName());
        }

        for (Car car : cars) {
            if (car instanceof Chargable) {
                ((Chargable) car).charge();

            } if (car instanceof Tankable) {
                ((Tankable) car).tank();
            }

        }


    }

}
