
package pl.itacademy.lesson4;


public class CatTester {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.eat("milk");
        tom.checkForHungry();
        tom.eat("mouth");
        tom.sleep(5);
        tom.checkForHungry();
        tom.play("ball");
    }
}