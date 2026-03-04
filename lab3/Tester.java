package lab3;

public class Tester {

    public static void main(String[] args) {
        LiftOffWatch watch = new LiftOffWatch();
        watch.setTemp(16.5);
        watch.setWeather("Sunny");
        watch.setWind(60.1);
        System.out.println(watch.canWeLaunch());
    }
}
