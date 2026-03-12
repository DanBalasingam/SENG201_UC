package lab4;

public class Planet {

    public String name;
    public int order;
    public String temperatrue;

    public Planet(String name, int order, String temperatrue) {
        this.name = name;
        this.order = order;
        this.temperatrue = temperatrue;
    }

    public String orderFromSun() {
        return name + " is number " + order + " from the Sun";
    }

    public String getName() {
        return name;
    }

    public String getTemperature() {
        return temperatrue;
    }

    public String getAxisRotation() {
        return "Counterclockwise";
    }

    public String getFact() {
        return name + " is a planet in the Milky Way galaxy";
    }

    @Override
    public String toString() {
        return orderFromSun() + " and is " + temperatrue;
    }
}
