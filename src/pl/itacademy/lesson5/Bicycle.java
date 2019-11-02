package pl.itacademy.lesson5;


public class Bicycle extends PoweredByHumanTransport {

    private boolean sportBicycle;
    private boolean bigWheels;
    private int sizeOfWheels;

    public Bicycle(String name, String model, int speed) {
        super(name, model, speed);
    }


    public boolean isSportBicycle() {
        return sportBicycle;
    }

    public void setSportBicycle(boolean sportBicycle) {
        this.sportBicycle = sportBicycle;
    }

    public boolean isBigWheels() {
        return bigWheels;
    }

    public void setBigWheels(boolean bigWheels) {
        this.bigWheels = bigWheels;
    }

    public int getSizeOfWheels() {
        return sizeOfWheels;
    }

    public void setSizeOfWheels(int sizeOfWheels) {
        this.sizeOfWheels = sizeOfWheels;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void changeSpeed() {

    }
}
