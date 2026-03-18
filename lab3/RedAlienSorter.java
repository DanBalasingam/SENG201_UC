package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class RedAlien {
    private final String name;
    private final int numberOfLimbs;

    public RedAlien(String name, int numberOfLimbs) {
        this.name = name;
        this.numberOfLimbs = numberOfLimbs;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    @Override
    public String toString() {
        return String.format("Red Alien %s, %d limbs", name, numberOfLimbs);
    }
}

class RedAlienSorter {
    private List<RedAlien> redAliens = new ArrayList<>();

    /**
     * Adds a red alien to the list of those to sort
     * 
     * @param redAlien RedAlien to be added
     */
    public void addRedAlien(RedAlien redAlien) {
        // Implemented for you
        redAliens.add(redAlien);
    }

    /**
     * Prints the current RedAliens alphabetically A-Z using their toString method
     */
    public void printAliensAlphabeticallyAZ() {
        redAliens.sort(Comparator.comparing(redAlien -> redAlien.getName()));
        for (RedAlien alien : redAliens) {
            System.out.println(alien);
        }
    }

    /**
     * Prints the current RedAliens reverse alphabetically Z-A using their toString
     * method
     */
    public void printAliensAlphabeticallyZA() {
        redAliens.sort(Comparator.comparing(RedAlien::getName).reversed());
        for (RedAlien alien : redAliens) {
            System.out.println(alien);
        }
    }

    /**
     * Prints the current RedAliens by fewest number of limbs to most using their
     * toString method
     */
    public void printAliensByNumberOfLimbsAscending() {
        redAliens.sort(Comparator.comparingInt(RedAlien::getNumberOfLimbs));
        for (RedAlien alien : redAliens) {
            System.out.println(alien);
        }
    }

    /**
     * Prints the current RedAliens by most number of limbs to fewest using their
     * toString method
     */
    public void printAliensByNumberOfLimbsDescending() {
        redAliens.sort(Comparator.comparingInt(RedAlien::getNumberOfLimbs).reversed());
        for (RedAlien alien : redAliens) {
            System.out.println(alien);
        }
    }
}