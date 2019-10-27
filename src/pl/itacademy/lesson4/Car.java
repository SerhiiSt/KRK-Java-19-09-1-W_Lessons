package pl.itacademy.lesson4;

public class Car {

    private String name;
    private String model;
    private Engine engine;

    private int fuelCapacity;
    private int remainingFuel;
    private int countStart = 0;
    private int countStop = 0;


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
        countStart++;
        if (countStart > 1) {
            System.out.println(engine.name + " engine has been started already in " + name + " " + model);
            countStart = 0;
        } else {
            engine.isStarted = true;
            showState();
        }

    }


    public void stopEngine() {
        countStop++;
        if (countStop > 1) {
            System.out.println(engine.name + " engine has been stopped already in " + name + " " + model);
            countStop = 0;
        } else {
            engine.isStarted = false;
            showState();
        }
    }

    private void showState() {
        if (engine.isStarted) {

            System.out.println("Car " + name + " " + model + " is starting " + engine.name + " engine");
            engine.startEngine();


        } else {
            System.out.println("Car " + name + " " + model + " is stopping " + engine.name + " engine");
            engine.stopEngine();
        }
    }


    public void drive(int speed, int length) {

        if (engine.isStarted) {


            int fuelUse = (length * 10) / 50;


            int maxSpeed = engine.getHorsepower() * 2;

            if (speed < maxSpeed) {


                System.out.println("Car " + name + " " + model + " has been driven for " + length + " km " +
                        " with speed " + speed + " km/h");
                fuelCheck(fuelUse);


            } else {

                System.out.println("Car " + name + " " + model + " has been driven for " + length + " km " +
                        " with  max speed " + maxSpeed + " km/h");
                fuelCheck(fuelUse);
                System.out.println("Speed has been limited cause of engine horsepower.");
            }

        } else {

            System.out.println(name + " " + model + " cant be driven cause engine stopped ");
        }


    }

    public void fuelCheck(int fuelUse) {

        if (fuelCapacity > fuelUse) {

            fuelCapacity = fuelCapacity - fuelUse;

            System.out.println("Remaining fuel: " + fuelCapacity + "L");

        } else if (fuelCapacity > 0) {

            fuelCapacity = 0;
            System.out.println("Car " + name + " " + model + " can't be driven. Tank is empty");

        } else {

            System.out.println("Tank is empty");
        }
    }


}

