package Question3;
import java.util.*;
// Create a concrete class that implements the new interface and inherits from a concrete class
class MyClass extends ArrayList<String> implements CombinedInterface {
    public void methodA1() {
        System.out.println("Method A1 called.");
    }

    public void methodA2() {
        System.out.println("Method A2 called.");
    }

    public void methodB1() {
        System.out.println("Method B1 called.");
    }

    public void methodB2() {
        System.out.println("Method B2 called.");
    }

    public void methodC1() {
        System.out.println("Method C1 called.");
    }

    public void methodC2() {
        System.out.println("Method C2 called.");
    }

    public void methodD() {
        System.out.println("Method D called.");
    }
}