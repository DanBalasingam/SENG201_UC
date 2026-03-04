package lab3;

public class StarmanFixes {

    private double oneTurn;
    private double tightenAmount;

    public void setOneTurn(double amount) {
        oneTurn = amount;
    }

    public double getTightenAmount() {
        return tightenAmount;
    }

    public void tightenQuarter() {
        tightenAmount += oneTurn / 4;
        System.out.println("Starman tightens the nut one quarter of a turn");
    }

    public void tightenHalf() {
        tightenQuarter();
        tightenQuarter();
        System.out.println("The nut has been tightened half a turn");
    }

    public void tightenFull() {
        tightenHalf();
        tightenHalf();
        System.out.println("The nut has been tightened a full turn");
    }
}