package lab_test_prep;

public class SpaceTraveller {

    private String name;
    private int age;
    private String homePlanet;
    private int daysInSpace;

    public SpaceTraveller(String name, int age, String homePlanet, int daysInSpace) {
        this.name = name;
        this.age = age;
        this.homePlanet = homePlanet;
        this.daysInSpace = daysInSpace;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public int getDaysInSpace() {
        return daysInSpace;
    }

    @Override
    public String toString() {
        String message = "";
        message += "Name: " + name + "\n";
        message += "Age: " + age + "\n";
        message += "Home Planet: " + homePlanet + "\n";
        message += "Days in Space: " + daysInSpace + "\n";
        return message;
    }
}
