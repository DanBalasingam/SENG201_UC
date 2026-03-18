package lab_test_prep;

public class Ship {

    public enum ShipType {
        BATTLESHIP, CRUISER, DESTROYER
    }

    private String shipName;
    private ShipType type;
    private int seats;
    private int numEngines;
    private int maxSpeed;

    public Ship(String shipName, ShipType type, int seats, int numEngines, int maxSpeed) {
        this.shipName = shipName;
        this.type = type;
        this.seats = seats;
        this.numEngines = numEngines;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", type=" + type +
                ", seats=" + seats +
                ", numEngines=" + numEngines +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
