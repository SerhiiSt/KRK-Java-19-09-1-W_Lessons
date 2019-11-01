package pl.itacademy.lesson4;


public class Engine {

    private String name;
    private int horsepower;
    private int capacity;
    private boolean isStarted;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        isStarted = false;

    }


    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        if (!isStarted) {
            isStarted = true;
            System.out.println(name + " engine has been started");

        } else {
            System.out.println(name + " engine has been started already ");

        }
    }

    public void stop() {
        if (isStarted) {
            isStarted = false;
            System.out.println(name + " engine has been stopped");
        } else {
            System.out.println(name + " engine has been stopped already");
        }
    }


}