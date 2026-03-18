package lab_test_prep;

public abstract class Planet {

    public enum Planets {
        Earth, Mars, Venus, Neptune, Karo, Androida
    }

    protected Planets name;
    protected int distanceFromEarth;
    protected String system;
    protected Boolean habitable;

    public Planet(Planets name, String system, Boolean habitable) {
        this.name = name;
        this.system = system;
        this.habitable = habitable;
    }
}
