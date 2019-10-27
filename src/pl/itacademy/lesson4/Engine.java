package pl.itacademy.lesson4;


public class Engine {

    String name;
    int horsepower;
    int capacity;
    boolean isStarted;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        isStarted = false;
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

    public void startEngine(){
        System.out.println(name+ " engine has been started");
    }

    public void stopEngine(){
        System.out.println(name+ " engine has been stopped");
    }


}