package labTestV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PlayerInventory {

    private final List<Item> inventory = new ArrayList<>();

    /**
     * Add the given item to this inventory
     *
     * @param item item to add
     */
    public void addItem(Item item) {
        this.inventory.add(item);
    }

    /**
     * Remove the given item from this inventory
     *
     * @param item item to add
     */
    public void removeItem(Item item) {
        for (int i = 0; i < this.inventory.size(); i++) {
            if (this.inventory.get(i) == item) {
                this.inventory.remove(i);
            }
        }
    }

    /**
     * Return the current number of items added to/associated with this inventory
     *
     * @return number of items
     */
    public int getNumberOfItems() {
        return this.inventory.size();
    }

    /**
     * Get the total value of the items added to/associated with the inventory
     * <p>
     * Total refers to the sum of all individual values
     *
     * @return total value of all items
     */
    public double getTotalValue() {
        double totalValue = 0;
        for (int i = 0; i < this.inventory.size(); i++) {
            totalValue += this.inventory.get(i).getValue();
        }
        return totalValue;
    }

    /**
     * Use all items once, and returns the number of items that were successfully
     * used
     *
     * @return Returns the total number of items that were successfully used
     */
    public int useAll() {
        int itemsUsed = 0;
        for (int i = 0; i < inventory.size(); i++) {
            if (this.inventory.get(i).use()) {
                itemsUsed++;
            }
        }
        return itemsUsed;
    }

    /**
     * Print {@link Item#toString()} for each Item added to/associated with the
     * inventory
     * from the highest value to the lowest.
     * For example an item with value 100.0 must have its toString() printed before
     * one with 50.0
     * <p>
     * If there are <b>no turbines</b> this method must print "Inventory is empty"
     */
    public void printItemsByValue() {
        if (this.inventory.isEmpty()) {
            System.out.println("Inventory is empty");
        }
        List<Double> sortedInv = new ArrayList<>();
        for (Item item : this.inventory) {
            sortedInv.add(item.getValue());
        }
        Collections.sort(sortedInv, Collections.reverseOrder());
        for (Double value : sortedInv) {
            for (Item item : this.inventory) {
                if (item.getValue() == value) {
                    System.out.println(item);
                }
            }
        }
    }
}
