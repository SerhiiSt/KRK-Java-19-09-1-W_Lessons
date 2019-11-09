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
    public HybridCar clone() throws CloneNotSupportedException {

        return (HybridCar) super.clone();
    }

    @Override
    public void charge() {
        System.out.println("Hybrid Car has been charged");
    }

    @Override
    public void tank() {
        System.out.println("Hybrid Car has been tanked");
    }
}
