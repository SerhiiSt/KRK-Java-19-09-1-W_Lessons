package pl.itacademy.lesson4;

class Cat {

    private String name;
    private boolean isHungry;


    Cat(String name) {
        this.name = name;
    }


    void eat(String food) {
        System.out.println(name + " is eating " + food);
        isHungry = false;
    }

    void checkForHungry() {
        if (isHungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }


    void play(String toy) {
        System.out.println(name + " is playing around with " + toy);
    }

    void sleep(int hours) {
        System.out.println(name + "is going to sleep for " + hours + " hours");
        isHungry = true;
    }


}
