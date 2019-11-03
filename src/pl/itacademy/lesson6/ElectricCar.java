package pl.itacademy.lesson6;


import java.util.Objects;

public class ElectricCar extends Car implements Chargable, Cloneable {

    public ElectricCar(String name, Engine engine) {
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
    protected ElectricCar clone() throws CloneNotSupportedException {

        return (ElectricCar) super.clone();
    }


}
