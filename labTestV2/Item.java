package labTestV2;

import java.util.Objects;

public class Item {

    private final String name;
    private final double value;
    private int durability;

    public Item(String name, double value, int durability) {
        this.name = name;
        this.value = value;
        this.durability = durability;
    }

    /**
     * Uses the item, and returns true if the item was sucessfully used (ie, it was
     * not broken).
     *
     * @return Returns true if the item was used
     */
    public boolean use() {
        if (!isBroken()) {
            this.durability--;
            return true;
        } else {
            return false;
        }
    }

    public boolean isBroken() {
        return this.durability <= 0;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format(
                "%s is currently %sbroken. Value: %.2f",
                this.name,
                isBroken() ? "" : "not ",
                this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Item item = (Item) o;
        return Double.compare(value, item.value) == 0 && durability == item.durability
                && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, durability);
    }
}
