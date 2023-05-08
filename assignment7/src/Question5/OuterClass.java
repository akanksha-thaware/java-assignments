package Question5;

// Define the outer class
public class OuterClass {

    // Define the inner class with a non-default constructor
    public class InnerClass {
        private int value;

        public InnerClass(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}