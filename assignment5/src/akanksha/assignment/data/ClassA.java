package akanksha.assignment.data;

public class ClassA {
    int integer;
    char character;
    public static void print(){
        // ERROR : non-static variable integer AND character cannot be referenced from a static context
        /* System.out.println("integer" + integer + " character " + character); */
    }
    public static void printValues(){
        int value;
        String name;
        // ERROR: variable value might not have been initialized
        /* System.out.println("value" + value + " name " + name); */
    }
}
