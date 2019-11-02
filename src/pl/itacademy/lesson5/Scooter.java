package pl.itacademy.lesson5;


public class Scooter extends PoweredByHumanTransport {

    private boolean isElectric;

    public Scooter(String name, String model, int speed) {
        super(name, model, speed);
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
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
