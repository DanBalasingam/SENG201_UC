package lab3;

public class LocationBeacon {

    private int hours;
    private int minutes;
    private int distance;

    /*
     * for as long as that starman is travelling
     * and for each 10 minute cycle
     * print statement with stats of current location
     */
    public void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration) {
        this.hours = startHour;
        this.minutes = startMinute;
        this.distance = startDistance;
        for (int i = 0; i < duration; i += 10) {
            this.minutes += 10;
            if (this.minutes >= 60) {
                int remainder = this.minutes - 60;
                this.hours++;
                this.minutes = remainder;
            }
            if (this.hours >= 24) {
                this.hours = 0;
            }
            float speedPerMinute = (float) speed / 60;
            this.distance += speedPerMinute * 10;
            System.out.println(
                    "[" + this.hours + ":" + this.minutes + "] " + "Starman is " + this.distance
                            + "km away from Earth");
        }
    }
}
