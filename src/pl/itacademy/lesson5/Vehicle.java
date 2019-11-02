package pl.itacademy.lesson5;

public class Vehicle extends PoweredByHumanTransport{

    private  boolean hasWing;
    private  int heightOfFly;

    public Vehicle(String name, String model, int speed) {
        super(name, model, speed);
    }

    public Vehicle(String name, String model,boolean hasWing,int height) {
                 this.name = name;
                 this.model = model;
                 this.hasWing = false;
                 this.heightOfFly = height;
    }


    public boolean hasWing() {
        return hasWing;
    }

    public void setHasWing(boolean hasWing) {
        this.hasWing = hasWing;
    }

    public int getMaxHeightOfFly() {
        return heightOfFly;
    }

    public void setMaxHeightOfFly(int heightOfFly) {
        this.heightOfFly = heightOfFly;
    }

    @Override
    public void start() {

            System.out.println("This vehicle " + this.getName() + " " + this.getModel() + " is starting.");
            isStarted = true;
        }

    @Override
    public void stop() {
        System.out.println("This vehicle is stopping.");
        isStarted=false;
    }

    @Override
    public void drive() {
        if(isStarted) {
            System.out.println("This vehicle started and move to point A");
        }
        else{
            System.out.println("This vehicle has not been started");
        }
    }

    public void checkIsStarted(){
        if (isStarted){
            System.out.println(name + " " + model + "is started yet");
        }
        else {
            System.out.println(name + " " + model + "is stopped");
        }
    }

    @Override
    public void changeSpeed() {
        System.out.println("Current speed " + this.getSpeed() + " km/H");
        int changedSpeed = this.getSpeed()+34;

        System.out.println("Changed speed " + "to "+ changedSpeed + " km/H");
    }




    public void changeSpeed(int speed) {
        System.out.println("Current speed " + this.getSpeed() + " km/H");
        int changedSpeed = this.getSpeed()+speed;
        System.out.println("Changed speed " +"to " +changedSpeed + " km/H");
    }

















}
