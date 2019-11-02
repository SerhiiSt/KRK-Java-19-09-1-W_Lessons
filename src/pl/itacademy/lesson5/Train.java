package pl.itacademy.lesson5;


import java.util.Date;

public class Train extends PublicTransport {

    private int numberOfCoaches;

    public Train(String name, String model, int speed) {
        super(name, model, speed);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }



    @Override
    public void drive() {

    }




    @Override
    public void changeSpeed() {

    }
}
