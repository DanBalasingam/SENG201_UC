package lecture2_1;

public class CostCalculator {

    int discountThreshold = 100;
    double discount = 0.10;
    double gst = 0.15;

    void main() {
        showPurchaseInformation("Watermelons", 30, 150, true);
        showPurchaseInformation("Laptop", 2500, 1, false);

        String[] penColours = { "blue", "black" };
        for (String colour : penColours) {
            showPurchaseInformation("Pens", 10, 200, true);
        }
    }

    double computePrice(int nbItems, double unitPrice) {
        double total = nbItems * unitPrice;
        if (nbItems > discountThreshold) {
            total = applyDiscount(total);
        }
        return total;
    }

    double applyDiscount(double basePrice) {
        return basePrice - basePrice * discount;
    }

    double computeGst(double totalPrice) {
        return totalPrice * gst;
    }

    void showPurchaseInformation(String itemName, double unitPrice, int amount, boolean business) {
        System.out.println("Purchase of" + amount + " " + itemName);
        double totalPrice = computePrice(amount, unitPrice);
        System.out.println("Total: " + totalPrice);
        if (business) {
            double gst = computeGst(totalPrice);
            System.out.println("GST: " + gst);
            System.out.println("Price (without GST): " + (totalPrice - gst));
        }
        System.out.println("==========================");
    }
}
