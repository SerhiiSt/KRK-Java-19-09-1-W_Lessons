package pl.itacademy.lesson4;

public class Car {


    private String name;
    private String model;
    private Engine engine;

    private int fuelCapacity;
    private int remainingFuel;

    public Car(String name, String model, int fuelCapacity, Engine engine) {
        this.name = name;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.engine = engine;
        this.remainingFuel = fuelCapacity;

    }

    public int tank() {
        fuelCapacity = remainingFuel;
        System.out.println("Car " + name + " " + model + " has been tanked up");
        return remainingFuel;

    }

    public void startEngine() {
        if (!engine.isStarted()) {
            System.out.println("Car " + name + " " + model + " is starting " + engine.getName() + " engine");
            engine.start();
        } else {
            engine.start();
        }


    }


    public void stopEngine() {

        if (engine.isStarted()) {
            System.out.println("Car " + name + " " + model + " is stopping " + engine.getName() + " engine");
            engine.stop();

        } else {

            engine.stop();
        }
    }


    public void drive(int speed, int length) {

        if (engine.isStarted()) {


            int maXSpeed = engine.getHorsepower() * 2;
            int fuelUsed = (length * 10) / 50;


            if (speed < maXSpeed) {
                System.out.printf("Car %s %s has been driven for %d km  with speed %s km/h%n", name, model, length, speed);
                checkRemainingFuel(fuelUsed);

            } else {
                System.out.printf("Car %s %s has been driven for %d km  with max speed %s km/h%n", name, model, length, maXSpeed);
                System.out.println("speed has been limited cause of engine horsepower.");
                checkRemainingFuel(fuelUsed);

            }

        } else {

            System.out.println(name + " " + model + " cant be driven cause engine stopped ");
        }


    }


    private void checkRemainingFuel(int fuelUsed) {

        if (fuelCapacity > fuelUsed) {

            fuelCapacity = fuelCapacity - fuelUsed;

            System.out.println("Remaining fuel: " + fuelCapacity + "L");

        } else if (fuelCapacity >= 0) {

            fuelCapacity = 0;
            System.out.println("Car " + name + " " + model + " can't be driven. Tank is empty");

        } else {

            System.out.println("Tank is empty");
        }
    }

}

