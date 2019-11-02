package pl.itacademy.lesson5;


public class AllTransportTester {

    public static void main(String[] args) {
        Transport airplane = new Vehicle("Airbus","A305",0);
        airplane.start();
        airplane.drive();
        airplane.changeSpeed();
        airplane.stop();

        Vehicle airplane2 = new Vehicle("Airbus","A305",0);
        airplane2.start();
        airplane2.drive();
        airplane2.changeSpeed(12);

        Vehicle buran = new Vehicle("Buran", "B345",true,320);
        buran.start();

    }
}
