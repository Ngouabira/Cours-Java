package poo;

public class RangeRover implements Car {
    @Override
    public void strat() {
        System.out.println("Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Stop...");
    }

    @Override
    public void fill(double qty) {
        System.out.println("Filling...");
    }
}
