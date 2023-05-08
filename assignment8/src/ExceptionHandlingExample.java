
class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    public CustomException3(String message) {
        super(message);
    }
}

// Define a class with a method that throws all three exceptions
class ExceptionThrower {
    public static void throwExceptions() throws CustomException1, CustomException2, CustomException3 {
        throw new CustomException1("Custom Exception 1");
        //throw new CustomException2("Custom Exception 2");
        //throw new CustomException3("Custom Exception 3");
    }
}

// Call the method with a single catch clause that catches all three types of exceptions
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            ExceptionThrower.throwExceptions();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
