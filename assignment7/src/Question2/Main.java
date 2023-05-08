package Question2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle : cycles) {
            // Downcast to Unicycle and call balance() if possible.
            if (cycle instanceof Unicycle) {
                Unicycle unicycle = (Unicycle) cycle;
                unicycle.balance();
            }

            // Downcast to Bicycle and call balance() if possible.
            if (cycle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) cycle;
                bicycle.balance();
            }
        }
    }
}
