package pl.itacademy.lesson4;

public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePhone2(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }


    public int charge() {
        batteryAmount = batteryCapacity;
        System.out.println("Full battery");
        return batteryAmount;

    }

    public void installApplication(String applicationName, int memorySize) {

        if (freeMemory < memorySize) {
            System.out.println("Application " + applicationName + " can't be installed on " + brand + " " + model +
                    ". There are no enough memory");
        } else {
            System.out.println("Application " + applicationName + " has been installed on " + brand + " " + model);
            freeMemory = freeMemory - memorySize;
            System.out.println("Remain memory: " + freeMemory + " Mb");
        }
    }

    public void useApplication(String applicationName, int hours) {
        int powerUse = hours * 100;

        if (batteryAmount > powerUse) {
            batteryAmount = batteryAmount - powerUse;
            System.out.println("Application " + applicationName + " has been used for " + hours + " hours");
            System.out.println("Remain battery capacity: " + batteryAmount + " mAh");
        } else if (batteryAmount > 0) {
            int hoursOfUsage = batteryAmount / 100;
            batteryAmount = 0;
            System.out.println("Application " + applicationName + " has bee used for " + hoursOfUsage + " hours");

        } else {

            System.out.println("Application " + applicationName + " can't be run on " + brand + " " + model + ".");
            System.out.println("Phone has been discharged.");
        }

    }


}
