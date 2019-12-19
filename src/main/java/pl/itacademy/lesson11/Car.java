package pl.itacademy.lesson11;

import lombok.Value;

import java.util.Collections;
import java.util.List;
import java.util.Objects;


@Value
public final class Car {

    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    private Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = copyOfEngine(engine);
        this.wheels = copyOfWheel(wheels);
    }

    private List<Wheel> copyOfWheel(List<Wheel> wheels) {
            return Collections.unmodifiableList(wheels);
    }


    private Engine copyOfEngine(Engine engine) {
        return new Engine(engine.getType(),engine.getHorsePower(),engine.getVolume());
    }

    public static Car createCar(String manufacturer, String model, Engine engine, List<Wheel> wheels){
        return new Car(manufacturer,model,engine,wheels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturer.equals(car.manufacturer) &&
                model.equals(car.model) &&
                engine.equals(car.engine) &&
                wheels.equals(car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, engine, wheels);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
