package akanksha.assignment.main;
import akanksha.assignment.singleton.*;
import akanksha.assignment.data.*;
public class Main {
    public static void main(String[] args){
        // object of first class (classA)
        ClassA obj1 = new ClassA();
        obj1.print();
        obj1.printValues();

        // object of second class (classB) using static method
        ClassB.createObject("hello world");
        // ERROR : non-static method printString() cannot be referenced from a static context
        /* ClassB.printString(); */
    }
}
