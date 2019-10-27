package pl.itacademy.lesson4;

public class MobilePhoneTester {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("Samsung", "galaxy", 1000, 500);
        mobilePhone.installApplication("Google maps", 100);
        mobilePhone.installApplication("Tinder", 200);
        mobilePhone.installApplication("Pokemon Go", 200);
        mobilePhone.useApplication("YouTube", 5);
        mobilePhone.useApplication("Facebook", 6);
        mobilePhone.useApplication("Angry Birds", 2);
        mobilePhone.charge();
        mobilePhone.useApplication("Angry Birds", 2);
    }
}

