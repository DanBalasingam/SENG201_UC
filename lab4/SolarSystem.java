package lab4;

import java.util.ArrayList;

public class SolarSystem {

    private ArrayList<Planet> planets = new ArrayList<>();

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void printAllPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet.getName() + " is number " + planet.order + " from the Sun" + " and is "
                    + planet.getTemperature());
        }
    }

    public int getPlanetCount() {
        return planets.size();
    }
}
