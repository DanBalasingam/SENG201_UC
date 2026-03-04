package lab2;

public class Tester {

    public void main() {
        StarmanFixes wheelnut = new StarmanFixes();

        wheelnut.setOneTurn(1);
        wheelnut.tightenQuarter();
        wheelnut.tightenHalf();
        wheelnut.tightenFull();
        System.out.println(wheelnut.getTightenAmount());
    }
}
