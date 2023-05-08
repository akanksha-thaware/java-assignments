package Question1;
public class Main {
    public static void main(String[] args) {
        Rodent rodent1 = new Mouse();
        rodent1.eat();
        rodent1.sleep();
        Rodent rodent2 = new Gerbil();
        rodent2.eat();
        rodent2.sleep();
        Rodent rodent3 = new Hamster();
        rodent3.eat();
        rodent3.sleep();

    }
}
