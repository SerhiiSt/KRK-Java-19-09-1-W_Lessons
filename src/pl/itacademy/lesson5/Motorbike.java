package pl.itacademy.lesson5;


public class Motorbike extends PoweredByHumanTransport {

    private boolean sportBike;

    public Motorbike(String name, String model, int speed) {
        super(name, model, speed);
    }

    public boolean isSportBike() {
        return sportBike;
    }

    public void setSportBike(boolean sportBike) {
        this.sportBike = sportBike;
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
