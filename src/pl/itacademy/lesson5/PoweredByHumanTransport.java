package pl.itacademy.lesson5;


import java.util.Date;

public abstract class PoweredByHumanTransport extends Transport {

    private int numberOfDriver;
    private boolean hasAutopilot;
    private int numberOfWheels;
    private int numberOfDoors;

    public PoweredByHumanTransport(String name, String model, int speed) {
        super(name, model, speed);
    }

    protected PoweredByHumanTransport() {}


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

    public int getNumberOfDriver() {
        return numberOfDriver;
    }

    public void setNumberOfDriver(int numberOfDriver) {
        this.numberOfDriver = numberOfDriver;
    }

    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }
}
