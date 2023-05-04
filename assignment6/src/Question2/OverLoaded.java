package Question2;

public class OverLoaded {
    private int value1;
    private int value2;

    public OverLoaded() {
        this(0); // Call the second constructor with default argument
    }

    public OverLoaded(int value) {
        this(value, value + 1);
    }

    public OverLoaded(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

}
