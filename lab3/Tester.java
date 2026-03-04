package lab3;

public class Tester {

    public static void main(String[] args) {
        SpaceStation station = new SpaceStation();
        station.dock();
        station.dock("Falcon Heavy");
        station.dock("Falcon Heavy", "Rocket Man");
    }
}
