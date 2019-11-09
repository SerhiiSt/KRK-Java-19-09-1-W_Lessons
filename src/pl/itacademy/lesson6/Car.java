package pl.itacademy.lesson6;


import java.util.Objects;

public class Car implements Cloneable {

    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object otherObject) {

        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;

        Car other = (Car) otherObject;

        return Objects.equals(name, other.name) &&
                Objects.equals(engine, other.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine);
    }

    @Override
    public String toString() {

        return getClass().getName()
                + " { "
                + " name = "
                + name
                + " , engine = "
                + engine
                + " } ";
    }

    @Override
    public Car clone() throws CloneNotSupportedException {

        Car cloned = (Car) super.clone();
        cloned.engine = engine.clone();

        return cloned;
    }
}
