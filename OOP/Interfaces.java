
interface Bicycle {

    int MAX_SPEED = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);

}

interface HornBicycle {

    void blowHornK3G();

    void blowHornMHN();

}

class AvonCycle implements Bicycle, HornBicycle {

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake...");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing Speed...");
    }

    @Override
    public void blowHornK3G() {
        System.out.println("Kabhi Khushi Kabhie Gham... Poo Poo Poo!");
    }

    @Override
    public void blowHornMHN() {
        System.out.println("Main Hoon Na... Pee Pee Pee!");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        AvonCycle cycle = new AvonCycle();

        cycle.speedUp(10);
        cycle.applyBrake(2);

        // Interface variables are public, static and final
        System.out.println(Bicycle.MAX_SPEED);

        cycle.blowHornK3G();
        cycle.blowHornMHN();
    }

}
