package pl.itacademy.lesson6;


import java.util.Objects;

public class HybridCar extends Car implements Tankable, Chargable, Cloneable {

    public HybridCar(String name, Engine engine) {
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
    protected HybridCar clone() throws CloneNotSupportedException {

        return (HybridCar) super.clone();
    }
}
