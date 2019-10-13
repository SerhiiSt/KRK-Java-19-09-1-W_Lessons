package pl.itacademy.lesson4;


public class Cat {

    public String name;
    public boolean isHungry;


    public Cat(String name) {
        this.name = name;
    }


    public void eat(String food) {
        System.out.println(name + " is eating " + food);
        isHungry = false;
    }

    public void checkForHungry() {
        if (isHungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }


    public void play(String toy) {
        System.out.println(name + " is playing around with " + toy);
    }

    public void sleep(int hours) {
        System.out.println(name + "is going to sleep for " + hours + " hours");
        isHungry = true;
    }


}
