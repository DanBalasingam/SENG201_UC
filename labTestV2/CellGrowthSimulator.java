package labTestV2;

import java.lang.Math;

public class CellGrowthSimulator {

    public void calculateGrowthUntil(int initialCells, int targetCells, float growthRate) {

        int year = 0;
        int currentCells = initialCells;

        while (currentCells < targetCells) {
            year++;
            currentCells = (int) Math.pow(currentCells, growthRate);
            if (currentCells < targetCells) {
                System.out.println("Year " + year + ": $" + currentCells);
            }
        }
        System.out.println("Year " + year + ": target cells $" +
                targetCells + " reached! Current cells: $" + currentCells);
    }
}
