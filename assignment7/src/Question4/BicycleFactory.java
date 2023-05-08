package Question4;

class BicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Bicycle();
    }
}