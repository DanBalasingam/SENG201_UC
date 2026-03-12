package lab4;

public abstract class Rocket {

    protected String name;
    protected int numStages;

    public Rocket(String name, int numStages) {
        this.name = name;
        this.numStages = numStages;
    }

    abstract public void fly();

    public String getName() {
        return name;
    }
}
