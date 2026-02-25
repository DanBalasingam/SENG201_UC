package lab1;

public class Tester {

    void main() {
        SpaceCalculations space = new SpaceCalculations();

        System.out.println(space.addition(10, 4));
        System.out.println(space.subtraction(32, 20));
        System.out.println(space.multiplication(7, 6));
        System.out.println(space.intDivision(9, 4));
        System.out.println(space.floatDivision(9, 4));
        System.out.println(space.circumference(8.75));
        System.out.println(space.toAU(1337133713371337.0));
    }
}