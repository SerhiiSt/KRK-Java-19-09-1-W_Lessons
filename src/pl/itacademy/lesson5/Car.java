package pl.itacademy.lesson5;


public class Car  extends PoweredByHumanTransport{



    private boolean hasOpenRoof;

    public Car(String name, String model, int speed) {
        super(name, model, speed);
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

    public boolean isHasOpenRoof() {
        return hasOpenRoof;
    }

    public void setHasOpenRoof(boolean hasOpenRoof) {
        this.hasOpenRoof = hasOpenRoof;
    }
}
