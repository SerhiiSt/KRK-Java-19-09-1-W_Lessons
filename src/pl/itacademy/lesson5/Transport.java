package pl.itacademy.lesson5;


import java.util.Date;

public abstract class Transport {

    protected String name;
    protected String model;
    protected Date yearOfRelease;
    protected String color;
    protected int speed;
    protected boolean isStarted;

    public Transport(String name, String model,int speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        isStarted=false;
    }

    protected Transport() {
    }

    public abstract void start();
    public abstract void stop();
    public abstract void drive();
    public abstract void changeSpeed();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Date yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {

        return speed;
    }
}
