package akanksha.assignment.singleton;
import java.util.*;
public class ClassB {

    String str;
    public static ClassB createObject(String newstring){
        // ERROR : non-static string member(str) cannot be referenced from a static context
        /* str = newstring; */
        ClassB obj = new ClassB();
        return obj;
    }

    public void printString(){
        System.out.println("string is " + str);
    }
}
