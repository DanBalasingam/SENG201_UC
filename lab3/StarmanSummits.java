package lab3;

public class StarmanSummits {

    public void climbMountain(double height, double dash, double slide) {
        double currentHeight = 0;
        int dashCount = 0;
        while (currentHeight < height) {
            currentHeight += dash;
            dashCount++;
            if (currentHeight >= height) {
                break;
            }
            currentHeight -= slide;
        }
        System.out.println("Starman needs to dash " + dashCount + " times before he reaches the top of the mountain");
    }
}
