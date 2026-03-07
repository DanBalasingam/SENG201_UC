package lab3;

public class Tester {

    public static void main(String[] args) {

        GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club");

        GreenAlien kloup = new GreenAlien("Yyest", 2, "Biscuits");
        GreenAlien gwerp = new GreenAlien("Lmona", 99, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Troll", 5, "Pop Rocks");
        GreenAlien lesap = new GreenAlien("Nemoa", 3, "Marshmellows");
        GreenAlien hugso = new GreenAlien("Hugso", 8, "Pop Rocks");

        transporter.addPassenger(kloup);
        System.out.println(transporter.addPassenger(kloup));
        transporter.removePassenger(kloup);
        System.out.println(transporter.addPassenger(kloup));
        transporter.addPassenger(gwerp);
        transporter.addPassenger(blarg);
        transporter.addPassenger(lesap);
        transporter.addPassenger(hugso);

        System.out.println(transporter);
    }
}