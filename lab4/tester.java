package lab4;

import java.util.List;

public class tester {

    public static void main() {
        Rocket toTheMoon = new SaturnSix("To the Moon!");
        toTheMoon.fly();

        Rocket toMars = new FalconTen("To Mars!");
        toMars.fly();
    }
}
