package Question5;

public class SecondClass {

    // Define the inner class that inherits from OuterClass.InnerClass
    public class InheritedInnerClass extends OuterClass.InnerClass {

        public InheritedInnerClass(OuterClass outer, int value) {
            outer.super(value);
        }
    }
}