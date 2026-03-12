package lab4;

public class Mercury extends Planet {

    public Mercury() {
        super("Mercury", 1, "Hot");
    }

    public String getFact() {
        return super.getName()
                + " is only the second hottest planet in the Solar System, despite being closest to the sun.";
    }
}
