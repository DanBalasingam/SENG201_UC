package lab2;

/*

Write a class called GreenAlien which has the following public attributes:

an attribute called name of type String. This holds the Aliens name.
an attribute called eyeCount of type int. This holds the number of eyes an Alien has.
an attribute called favouriteCandy of type String. This holds the Aliens perceived favourite candy.
And Methods:

getDescription, which returns the String: "This Alien is called <name> and has <eyeCount> eyes. Gross. It seems to enjoy eating <favouriteCandy>".

*/

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

    public String getDescription() {
        return "This Alien is called " + name + " and has " + eyeCount + " eyes. Gross. It seems to enjoy eating "
                + favouriteCandy;
    }
}
