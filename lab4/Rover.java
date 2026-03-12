package lab4;

public class Rover implements RemoteControllable {

    private double latitude;
    private double longitude;
    private String mission;

    public void setLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return "The rover is located " + latitude + ", " + longitude + " on the planet";
    }

    public String getStatusReport() {
        return getLocation() + "\nThe rover is driving to: " + mission;
    }

    public void updateMission(String newMission) {
        this.mission = newMission;
    }
}
