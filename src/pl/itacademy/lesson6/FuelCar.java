package pl.itacademy.lesson6;


import java.util.Objects;

public class FuelCar extends Car implements Tankable, Cloneable {

    public FuelCar(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public boolean equals(Object otherObject) {
        return super.equals(otherObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    protected FuelCar clone() throws CloneNotSupportedException {

        return (FuelCar) super.clone();
    }
}
