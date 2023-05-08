package Question4;
public class Main {
    public static void main(String[] args) {
        // Create a Unicycle using a UnicycleFactory
        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        unicycle.ride();  // prints "Riding a unicycle!"

        // Create a Bicycle using a BicycleFactory
        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        bicycle.ride();  // prints "Riding a bicycle!"

        // Create a Tricycle using a TricycleFactory
        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        tricycle.ride();  // prints "Riding a tricycle!"
    }
}