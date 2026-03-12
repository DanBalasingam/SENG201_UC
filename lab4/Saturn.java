package lab4;

public class Saturn extends Planet {

    public Saturn() {
        super("Saturn", 6, "Cold");
    }

    public String getFact() {
        return super.getFact() + ". " + super.getName() + " has massive rings.";
    }
}
