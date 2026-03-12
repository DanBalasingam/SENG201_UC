package lab4;

public class SpaceStation implements RemoteControllable {

    private String planet;
    private String mission;

    public SpaceStation(String planet) {
        this.planet = planet;
    }

    public String getLocation() {
        return "The space station floats around the planet " + planet;
    }

    public String getStatusReport() {
        return getLocation() + "\nThe station is on a mission to: " + mission;
    }

    public void updateMission(String newMission) {
        this.mission = newMission;
    }
}
