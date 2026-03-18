package run2;

import labTestV2.CellGrowthSimulator;

public class tester {

    public static void main(String[] args) {

        new CellGrowthSimulator().calculateGrowthUntil(1000, 2000, 1.03f);
    }
}
