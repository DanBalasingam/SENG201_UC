package lab4;

public class FalconTen extends Rocket {

    public FalconTen(String name) {
        super(name, 2);
    }

    @Override
    public void fly() {
        System.out.println("Starting flight for: " + name);
        int timePassed = 0;
        for (int stage = 1; stage <= numStages; stage++) {
            if (stage == 1) {
                timePassed += 60;
                System.out.println("After " + timePassed + " seconds, stage " + stage + " separates");
                continue;
            }
            timePassed += timePassed * 1.5;
            System.out.println("After " + timePassed + " seconds, stage " + stage + " separates");
        }
        System.out.println("We're in space!");
    }
}
