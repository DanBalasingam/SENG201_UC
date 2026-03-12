package lab4;

public class SaturnSix extends Rocket {

    public SaturnSix(String name) {
        super(name, 3);
    }

    @Override
    public void fly() {
        System.out.println("Starting flight for: " + name);
        int timePassed = 0;
        int lastStage = 0;
        for (int stage = 1; stage <= numStages; stage++) {
            if (stage == 1) {
                timePassed += 50;
                lastStage = 50;
                System.out.println("After " + timePassed + " seconds, stage " + stage + " separates");
                continue;
            }
            timePassed += lastStage * 2;
            lastStage = lastStage * 2;
            System.out.println("After " + timePassed + " seconds, stage " + stage + " separates");
        }
        System.out.println("We're in space!");
    }
}
