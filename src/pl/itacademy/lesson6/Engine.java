package pl.itacademy.lesson6;


import java.util.Objects;

public class Engine implements Cloneable {

    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object otherObject) {

        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Engine other = (Engine) otherObject;

        return Objects.equals(name, other.name) && Objects.equals(power, other.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPower());
    }

    @Override
    public String toString() {

        return getClass().getName()
                + " { "
                + "name = "
                + getName()
                + " , "
                + "power = "
                + getPower()
                + " } ";
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {

        return (Engine) super.clone();
    }

}

