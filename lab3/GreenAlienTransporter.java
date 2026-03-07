package lab3;

import java.util.Arrays;
import java.util.ArrayList;

public class GreenAlienTransporter {

    private final String name;
    private final int[] cells;
    private final ArrayList<GreenAlien> passengers = new ArrayList<>();

    /* --- Constructor --- */
    public GreenAlienTransporter(String name) {
        this.name = name;
        cells = new int[4];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = 100;
        }
    }

    /* --- Methods --- */
    public boolean addPassenger(GreenAlien alien) {
        for (GreenAlien p : passengers) {
            if (p.equals(alien)) {
                return false;
            }
        }
        passengers.add(alien);
        return true;
    }

    public boolean removePassenger(GreenAlien alien) {
        for (GreenAlien p : passengers) {
            if (p.equals(alien)) {
                passengers.remove(p);
                return true;
            }
        }
        return false;
    }

    public boolean replaceCell(int cellNum) {
        int idx = toIndex(cellNum);
        if (idx == -1)
            return false;
        cells[idx] = 100;
        return true;

    }

    public int countEyes() {
        int eyeCount = 0;
        for (GreenAlien p : passengers) {
            eyeCount += p.getEyeCount();
        }
        return eyeCount;
    }

    public ArrayList<String> shoppingList() {
        ArrayList<String> shoppingList = new ArrayList<>();
        for (GreenAlien p : passengers) {
            shoppingList.add(p.getFavouriteCandy());
        }
        return shoppingList;
    }

    public boolean travel(int lightYears) {
        if (lightYears < 0) {
            return false;
        }

        int totalRequired = lightYears * 10;

        int totalAvailable = Arrays.stream(cells).sum();
        if (totalAvailable < totalRequired) {
            return false;
        }

        int remainingChargeNeeded = totalRequired;

        for (int i = 0; i < cells.length; i++) {
            int cellCharge = cells[i];
            if (cellCharge == 0) {
                continue;
            }

            int stepsFromCell = Math.min(cellCharge / 10, remainingChargeNeeded / 10);

            int deduct = stepsFromCell * 10;
            cells[i] -= deduct;
            remainingChargeNeeded -= deduct;

            if (remainingChargeNeeded <= 0) {
                break;
            }
        }

        if (remainingChargeNeeded > 0) {
            return false;
        }

        return true;
    }

    /* --- Getters --- */
    public int getCharge(int cellNum) {
        int idx = toIndex(cellNum);
        if (idx == -1)
            return -1;
        return cells[idx];
    }

    public String getPassengerNames() {
        StringBuilder names = new StringBuilder();
        int size = passengers.size();

        for (int i = 0; i < size; i++) {
            GreenAlien p = passengers.get(i);
            names.append(p.getName());

            if (i < size - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    }

    /* --- Helpers --- */
    private int toIndex(int cellNum) {
        if (cellNum < 1 || cellNum > 4)
            return -1;
        return cellNum - 1;
    }

    public String toString() {
        String output = "The passengers on " + name + " are:\n" + getPassengerNames() + "\n"
                + "The number of eyes on this transporter is: " + countEyes();
        return output;
    }
}
