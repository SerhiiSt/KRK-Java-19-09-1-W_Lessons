package pl.itacademy.lesson5;


import java.util.Date;

public class Bus extends PublicTransport {

    private int numberOfDoors;
    private int numberOfWheels;

    public Bus(String name, String model, int speed) {
        super(name, model, speed);
    }


    @Override
    public void start() {
        System.out.println("Bus' engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Bus' engine is stopped");
    }

    @Override
    public void drive() {
        start();
        System.out.println("Bus is moving");
    }

    @Override
    public void changeSpeed() {

    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
