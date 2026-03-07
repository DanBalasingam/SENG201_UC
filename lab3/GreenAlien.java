package lab3;

public class GreenAlien {

    private String name;
    private int eyeCount;
    private String favouriteCandy;

    public GreenAlien() {
        name = "Kloup";
        eyeCount = 6;
        favouriteCandy = "Lollypops";
    }

    public GreenAlien(String tempName, int tempEyeCount, String tempFavouriteCandy) {
        name = tempName;
        eyeCount = tempEyeCount;
        favouriteCandy = tempFavouriteCandy;
    }

    public String toString() {
        return "This Alien is called " + name + " and has " + eyeCount + " eyes. Gross. It seems to enjoy eating "
                + favouriteCandy;
    }

    public boolean equals(GreenAlien other) {
        return eyeCount == other.eyeCount && favouriteCandy.equals(other.favouriteCandy);
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteCandy() {
        return favouriteCandy;
    }
}
